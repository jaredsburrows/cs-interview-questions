package crackingthecode.part1datastructures;

import questions.util.TreeNode;

public class Chapter4TreesAndGraphs {

    /**
     * 4.1 - Implement a function to check if a tree is balanced. For the purposes of this question,
     * a balanced tree is defined to be a tree such that no two leaf nodes differ in distance from
     * the root by more than one.
     */
    public static boolean isBalanced(final TreeNode treeNode) {
        return treeNode == null || getHeight(treeNode) != -1;
    }

    static int getHeight(final TreeNode treeNode) {
        if (treeNode == null) {
            return 0;
        }

        int left = getHeight(treeNode.left);
        int right = getHeight(treeNode.right);

        if (left == -1 || right == -1) {
            return -1;
        }

        // balanced tree is defined to be a tree such that no two leaf nodes differ in distance from
        // the root by more than one
        if (Math.abs(left - right) > 1) {
            return -1;
        }

        return Math.max(left, right) + 1;
    }

    /**
     * 4.2 - Given a directed graph, design an algorithm to find out whether there is a route
     * between two nodes.
     */

    /**
     * 4.3 - Given a sorted (increasing order) array, write an algorithm to create a binary tree
     * with minimal height.
     */

    /**
     * 4.4 - Given a binary search tree, design an algorithm which creates a linked list of all the
     * nodes at each depth (i.e., if you have a tree with depth D, you’ll have D linked lists).
     */

    /**
     * 4.5 - Write an algorithm to find the ‘next’ node (i.e., in-order successor) of a given node
     * in a binary search tree where each node has a link to its parent.
     */

    /**
     * 4.6 - Design an algorithm and write code to find the first common ancestor of two nodes in a
     * binary tree. Avoid storing additional nodes in a data structure. NOTE: This is not
     * necessarily a binary search tree.
     */

    /**
     * 4.7 - You have two very large binary trees: T1, with millions of nodes, and T2, with hundreds
     * of nodes. Create an algorithm to decide if T2 is a subtree of T1.
     */

    /**
     * 4.8 - You are given a binary tree in which each node contains a value. Design an algorithm to
     * print all paths which sum up to that value. Note that it can be any path in the tree
     * it does not have to start at the root.
     */

}
