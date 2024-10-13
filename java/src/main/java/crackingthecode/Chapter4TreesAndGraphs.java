package crackingthecode;

import api.GraphNode;
import api.TreeNode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public final class Chapter4TreesAndGraphs {
    /**
     * 4.1 - Implement a function to check if a tree is balanced. For the purposes of this question, a
     * balanced tree is defined to be a tree such that no two leaf nodes differ in distance from the
     * root by more than one.
     */
    public <T> boolean isBalanced(TreeNode<T> node) {
        if (node == null) {
            return true;
        }

        return getHeight(node) != -1;
    }

    private <T> int getHeight(TreeNode<T> treeNode) {
        if (treeNode == null) {
            return 0;
        }

        int left = getHeight(treeNode.left);
        int right = getHeight(treeNode.right);

        // no node never differ by more than 1
        if (left == -1 || right == -1 || Math.abs(left - right) > 1) {
            return -1;
        }

        return Math.max(left, right) + 1;
    }

    /**
     * 4.2 - Given a directed graph, design an algorithm to find out whether there is a route between
     * two nodes.
     */
    // BFS
    public <T> boolean hasGraphNodeBfs(GraphNode<T> start, GraphNode<T> end) {
        Deque<GraphNode<T>> queue = new ArrayDeque<>();

        start.visited = true;
        queue.add(start);

        while (!queue.isEmpty()) {
            GraphNode<T> currentNode = queue.poll();
            for (GraphNode<T> node : currentNode.neighbors) {
                if (!node.visited) {
                    node.visited = true;
                    if (node.value == end.value) {
                        return true;
                    }
                    queue.add(node);
                }
            }
        }

        return false;
    }

    /**
     * 4.3 - Given a sorted (increasing order) array, write an algorithm to create a binary tree with
     * minimal height.
     */
    // 1 2 3 4 5 6 7
    //      4
    //     / \
    //    2   6
    //   /\   /\
    //  1  3  5 7
    // (length - 0) / 2
    @Nullable
    public TreeNode<Integer> getMinimumTree(int[] array, int start, int end) {
        if (array == null || array.length == 0 || start < 0 || start > end) {
            return null;
        }

        int mid = (start + end) / 2;
        TreeNode<Integer> treeNode = new TreeNode<>(array[mid]);
        treeNode.left =
            getMinimumTree(array, start, mid - 1);   // 1 2 3 4 5 6 // remove one from left
        treeNode.right =
            getMinimumTree(array, mid + 1, end);    // 2 3 4 5 6 7 // remove one from front

        return treeNode;
    }

    /**
     * 4.4 - Given a binary search tree, design an algorithm which creates a linked list of all the
     * nodes at each depth (i.e., if you have a tree with depth D, you’ll have D linked lists).
     */
    // simply traversing from top to bottom, do not over think this
    @SuppressWarnings("JdkObsolete") // TODO LinkedList -> ArrayDeque
    public <T> List<LinkedList<TreeNode<T>>> getLinkedListLevels(TreeNode<T> node) {
        if (node == null) {
            return new ArrayList<>();
        }

        List<LinkedList<TreeNode<T>>> queues = new ArrayList<>();
        LinkedList<TreeNode<T>> queue = new LinkedList<>();

        // keep track of levels
        int level = 0;

        // add the first
        queue.add(node);
        queues.add(level, queue);

        while (true) {
            queue = new LinkedList<>();
            // loop through nodes at current level
            for (int i = 0; i < queues.get(level).size(); i++) {
                // get the current node
                TreeNode<T> treeNode = queues.get(level).get(i); // get() from LinkedList
                // add it's children
                if (treeNode != null) {
                    if (treeNode.left != null) {
                        queue.add(treeNode.left);
                    }
                    if (treeNode.right != null) {
                        queue.add(treeNode.right);
                    }
                }
            }

            level++;

            // if there are no children at this level, stop
            if (!queue.isEmpty()) {
                queues.add(level, queue);
            } else {
                break;
            }
        }

        return queues;
    }

    /*
     * 4.5 - Write an algorithm to find the ‘next’ node (i.e., in-order successor) of a given node
     * in a binary search tree where each node has a link to its parent.
     */
    // keep parent in node or search from root

    /**
     * 4.6 - Design an algorithm and write code to find the first common ancestor of two nodes in a
     * binary tree. Avoid storing additional nodes in a data structure. NOTE: This is not necessarily
     * a binary search tree.
     */
    // Time - O(LOG(N)) in Balanced binary tree, O(N) in skewed tree.
    @Nullable
    public <T> TreeNode<T> commonAncestor(TreeNode<T> root, TreeNode<T> node1, TreeNode<T> node2) {
        if (root == null) {
            return null;
        }

        if (Objects.equals(root, node1) || Objects.equals(root, node2)) {
            return root;
        }

        TreeNode<T> left = commonAncestor(root.left, node1, node2);
        TreeNode<T> right = commonAncestor(root.right, node1, node2);

        if (left != null && right != null) {
            return root;
        }

        return left != null ? left : right;
    }

    @Nullable
    public <T> TreeNode<T> commonAncestor2(TreeNode<T> root, TreeNode<T> node1, TreeNode<T> node2) {
        if (root == null) {
            return null;
        }

        if (Objects.equals(root, node1) || Objects.equals(root, node2)) {
            return root;
        }

        TreeNode<T> left = commonAncestor2(root.left, node1, node2);
        TreeNode<T> right = commonAncestor2(root.right, node1, node2);

        if (Objects.equals(left, node1) && Objects.equals(right, node2)) {
            return root;
        }

        if (Objects.equals(left, node2) && Objects.equals(right, node2)) {
            return root;
        }

        return left != null ? left : right;
    }

    /**
     * 4.7 - You have two very large binary trees: T1, with millions of nodes, and T2, with hundreds
     * of nodes. Create an algorithm to decide if T2 is a subtree of T1.
     */
    // T1 - millions of nodes
    // T2 - supposed subtree of T1, should be the same or smaller
    public <T> boolean isSubtree(TreeNode<T> t, TreeNode<T> s) {
        if (s == null) {
            return false;
        }

        if (t == null) {
            return false;
        }

        return isSameTree(t, s)
            || isSubtree(t.left, s)
            || isSubtree(t.right, s);
    }

    private <T> boolean isSameTree(TreeNode<T> p, TreeNode<T> q) {
        if (p == null && q == null) {
            return true;
        }

        if (p == null || q == null) {
            return false;
        }

        return p.value == q.value
            && isSameTree(p.left, q.left)
            && isSameTree(p.right, q.right);
    }

    /*
     * 4.8 - You are given a binary tree in which each node contains a value. Design an algorithm to
     * print all paths which sum up to that value. Note that it can be any path in the tree
     * it does not have to start at the root.
     */
}
