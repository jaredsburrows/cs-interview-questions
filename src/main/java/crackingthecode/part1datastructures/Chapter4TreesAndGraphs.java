package crackingthecode.part1datastructures;

import api.GraphNode;
import api.TreeNode;
import questions.treeheap.EqualTree;
import questions.treeheap.TreeHeight;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Chapter4TreesAndGraphs {

    /**
     * 4.1 - Implement a function to check if a tree is balanced. For the purposes of this question,
     * a balanced tree is defined to be a tree such that no two leaf nodes differ in distance from
     * the root by more than one.
     */
    public static <T> boolean isBalanced(final TreeNode<T> node) {
        if (node == null) {
            return true;
        }

        return TreeHeight.getHeight(node) != -1;
    }

    /**
     * 4.2 - Given a directed graph, design an algorithm to find out whether there is a route
     * between two nodes.
     */
    // BFS
    public static <T> boolean hasGraphNodeBFS(final GraphNode<T> start, final GraphNode<T> end) {
        final Queue<GraphNode<T>> queue = new LinkedList<>();

        start.visited = true;
        queue.add(start);

        while (!queue.isEmpty()) {
            final GraphNode<T> node = queue.poll();
            for (final GraphNode<T> tGraphNode : node.neighbors) {
                if (!tGraphNode.visited) {
                    tGraphNode.visited = true;
                    if (tGraphNode.value == end.value) {
                        return true;
                    }
                    queue.add(tGraphNode);
                }
            }
        }

        return false;
    }

    /**
     * 4.3 - Given a sorted (increasing order) array, write an algorithm to create a binary tree
     * with minimal height.
     */
    // 1 2 3 4 5 6 7
    //      4
    //     / \
    //    2   6
    //   /\   /\
    //  1  3  5 7
    // (length - 0) / 2
    public static TreeNode<Integer> getMinimumTree(int[] array, int start, int end) {
        if (array == null || array.length == 0 || (start < 0 || start > end)) {
            return null;
        }

        int mid = (start + end) / 2;
        TreeNode<Integer> treeNode = new TreeNode<>(array[mid]);
        treeNode.left = getMinimumTree(array, start, mid - 1);   // 1 2 3 4 5 6 // remove one from left
        treeNode.right = getMinimumTree(array, mid + 1, end);    // 2 3 4 5 6 7 // remove one from front

        return treeNode;
    }

    /**
     * 4.4 - Given a binary search tree, design an algorithm which creates a linked list of all the
     * nodes at each depth (i.e., if you have a tree with depth D, you’ll have D linked lists).
     */
    // simply traversing from top to bottom, do not over think this
    public static <T> List<LinkedList<TreeNode<T>>> getLinkedListLevels(TreeNode<T> node) {
        if (node == null) {
            return null;
        }

        final List<LinkedList<TreeNode<T>>> listLinkedList = new ArrayList<>();
        LinkedList<TreeNode<T>> linkedList = new LinkedList<>();

        // keep track of levels
        int level = 0;

        // add the first
        linkedList.add(node);
        listLinkedList.add(level, linkedList);

        while (true) {
            linkedList = new LinkedList<>();
            // loop through nodes at current level
            for (int i = 0; i < listLinkedList.get(level).size(); i++) {
                // get the current node
                TreeNode<T> treeNode = listLinkedList.get(level).get(i);
                // add it's children
                if (treeNode != null) {
                    if (treeNode.left != null) {
                        linkedList.add(treeNode.left);
                    }
                    if (treeNode.right != null) {
                        linkedList.add(treeNode.right);
                    }
                }
            }

            level++;

            // if there are no children at this level, stop
            if (linkedList.size() > 0) {
                listLinkedList.add(level, linkedList);
            } else {
                break;
            }
        }

        return listLinkedList;
    }

    /**
     * 4.5 - Write an algorithm to find the ‘next’ node (i.e., in-order successor) of a given node
     * in a binary search tree where each node has a link to its parent.
     */
    // keep parent in node or search from root

    /**
     * 4.6 - Design an algorithm and write code to find the first common ancestor of two nodes in a
     * binary tree. Avoid storing additional nodes in a data structure. NOTE: This is not
     * necessarily a binary search tree.
     */
    public static <T> TreeNode<T> commonAncestor(final TreeNode<T> root, final TreeNode<T> node1, final TreeNode<T> node2) {
        if (root == null || node1 == null || node2 == null) {
            return root;
        }

        if (covers(root.left, node1) && covers(root.left, node2)) {
            return commonAncestor(root.left, node1, node2);
        }

        if (covers(root.right, node1) && covers(root.right, node2)) {
            return commonAncestor(root.right, node1, node2);
        }

        return root;
    }

    private static <T> boolean covers(final TreeNode<T> root, final TreeNode<T> node) {
        if (root == null || node == null) {
            return false;
        }

        if (root == node) {
            return true;
        }

        return covers(root.left, node) || covers(root.right, node);
    }

    /**
     * 4.7 - You have two very large binary trees: T1, with millions of nodes, and T2, with hundreds
     * of nodes. Create an algorithm to decide if T2 is a subtree of T1.
     */
    // T1 - millions of nodes
    // T2 - supposed subtree of T1, should be the same or smaller
    public static <T> boolean isSubtree(final TreeNode<T> tree, final TreeNode<T> subTree) {
        if (subTree == null) {
            return true;
        }

        if (tree == null) {
            return false;
        }

        if (EqualTree.isEqual(tree, subTree)) {
            return true;
        }

        return EqualTree.isEqual(tree.left, subTree) || EqualTree.isEqual(tree.right, subTree); // important || vs &&
    }

    /**
     * 4.8 - You are given a binary tree in which each node contains a value. Design an algorithm to
     * print all paths which sum up to that value. Note that it can be any path in the tree
     * it does not have to start at the root.
     */

}
