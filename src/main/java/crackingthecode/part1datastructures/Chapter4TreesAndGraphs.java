package crackingthecode.part1datastructures;

import api.TreeNode;
import questions.treeheap.EqualTree;
import questions.treeheap.TreeHeight;

public class Chapter4TreesAndGraphs {

    /**
     * 4.1 - Implement a function to check if a tree is balanced. For the purposes of this question,
     * a balanced tree is defined to be a tree such that no two leaf nodes differ in distance from
     * the root by more than one.
     */
    public static boolean isBalanced(final TreeNode treeNode) {
        return treeNode == null || TreeHeight.getHeight(treeNode) != -1;
    }

    /**
     * 4.2 - Given a directed graph, design an algorithm to find out whether there is a route
     * between two nodes.
     */

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
    public static TreeNode getMinimumTree(int[] array, int start, int end) {
        if ((array == null) || (array.length == 0) || ((start < 0) || (start > end))) {
            return null;
        }

        int mid = (start + end) / 2;
        TreeNode treeNode = new TreeNode(array[mid]);
        treeNode.left = getMinimumTree(array, start, mid - 1);   // 1 2 3 4 5 6 // remove one from left
        treeNode.right = getMinimumTree(array, mid + 1, end);    // 2 3 4 5 6 7 // remove one from front

        return treeNode;
    }

    /**
     * 4.4 - Given a binary search tree, design an algorithm which creates a linked list of all the
     * nodes at each depth (i.e., if you have a tree with depth D, you’ll have D linked lists).
     */

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
    // BST

    /**
     * 4.7 - You have two very large binary trees: T1, with millions of nodes, and T2, with hundreds
     * of nodes. Create an algorithm to decide if T2 is a subtree of T1.
     */
    // T1 - millions of nodes
    // T2 - supposed subtree of T1, should be the same or smaller
    public static boolean isSubtree(final TreeNode treeNode, final TreeNode treeNode2) {
        if (treeNode2 == null) {
            return true;
        }

        if (treeNode == null) {
            return false;
        }

        if (EqualTree.isEqual(treeNode, treeNode2)) {
            return true;
        }

        return EqualTree.isEqual(treeNode.left, treeNode2)
                || EqualTree.isEqual(treeNode.right, treeNode2); // important || vs &&
    }

    /**
     * 4.8 - You are given a binary tree in which each node contains a value. Design an algorithm to
     * print all paths which sum up to that value. Note that it can be any path in the tree
     * it does not have to start at the root.
     */

}
