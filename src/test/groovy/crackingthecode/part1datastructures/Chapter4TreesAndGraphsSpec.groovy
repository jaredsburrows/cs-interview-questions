package crackingthecode.part1datastructures

import api.TreeNode
import spock.lang.Specification

class Chapter4TreesAndGraphsSpec extends Specification {

    Chapter4TreesAndGraphs chapter4TreesAndGraphs
    TreeNode tree = new TreeNode(26);
    TreeNode subTree = new TreeNode(10);
    TreeNode balancedTree = new TreeNode(0);
    TreeNode balancedTree2 = new TreeNode(0);
    TreeNode unbalancedTree = new TreeNode(5);

    def "setup"() {
        chapter4TreesAndGraphs = new Chapter4TreesAndGraphs()

        balancedTree.right = new TreeNode(10);
        balancedTree.right.left = new TreeNode(10);
        balancedTree.right.right = new TreeNode(10);
        balancedTree.left = new TreeNode(1);
        balancedTree.left.left = new TreeNode(12);
        balancedTree.left.right = new TreeNode(2);

        balancedTree2.right = new TreeNode(10);
        balancedTree2.right.left = new TreeNode(10);
        balancedTree2.left = new TreeNode(1);
        balancedTree2.left.right = new TreeNode(2);

        unbalancedTree.right = new TreeNode(10);
        unbalancedTree.left = new TreeNode(1);
        unbalancedTree.left.left = new TreeNode(12);
        unbalancedTree.left.left.left = new TreeNode(12);

        subTree.right = new TreeNode(6);
        subTree.left = new TreeNode(4);
        subTree.left.right = new TreeNode(30);

        tree.right = new TreeNode(3);
        tree.right.right = new TreeNode(3);
        tree.left = new TreeNode(10);
        tree.left.left = new TreeNode(4);
        tree.left.left.right = new TreeNode(30);
        tree.left.right = new TreeNode(6);
    }

    def "4.1 - isBalanced"() {
        expect:
        chapter4TreesAndGraphs.isBalanced(null)
        !chapter4TreesAndGraphs.isBalanced(unbalancedTree)
        chapter4TreesAndGraphs.isBalanced(balancedTree)
        chapter4TreesAndGraphs.isBalanced(balancedTree2)
    }

    def "4.2 - "() {

    }

    def "4.3 - getBinaryTree"() {
        given:
        int[] sortedArray = [1, 2, 3, 4, 5, 6, 7]
        int[] empty = []

        TreeNode treeNode = new TreeNode(4)
        treeNode.left = new TreeNode(2)
        treeNode.left.left = new TreeNode(1)
        treeNode.left.right = new TreeNode(3)
        treeNode.right = new TreeNode(5)
        treeNode.right.left = new TreeNode(6)
        treeNode.right.right = new TreeNode(7)

        // 1 2 3 4 5 6 7
        //      4
        //     / \
        //    2   6
        //   /\   /\
        //  1  3  5 7
        expect:
        chapter4TreesAndGraphs.getMinimumTree(null, 0, sortedArray.size() - 1) == null
        chapter4TreesAndGraphs.getMinimumTree(empty, 0, sortedArray.size() - 1) == null
        chapter4TreesAndGraphs.getMinimumTree(sortedArray, sortedArray.size(), 0) == null
        chapter4TreesAndGraphs.getMinimumTree(sortedArray, -1, sortedArray.size()) == null
        chapter4TreesAndGraphs.getMinimumTree(sortedArray, 0, -1) == null
        TreeNode tree = chapter4TreesAndGraphs.
                getMinimumTree(sortedArray, 0, sortedArray.size() - 1)
        tree.value == 4
        tree.left.value == 2
        tree.left.left.value == 1
        tree.left.right.value == 3
        tree.right.value == 6
        tree.right.left.value == 5
        tree.right.right.value == 7
    }

    def "4.4 - "() {

    }

    def "4.5 - "() {

    }

    def "4.6 - "() {

    }

    def "4.7 - isSubtree"() {
        expect:
        chapter4TreesAndGraphs.isSubtree(null, null)
        !chapter4TreesAndGraphs.isSubtree(null, balancedTree)
        chapter4TreesAndGraphs.isSubtree(unbalancedTree, null)
        !chapter4TreesAndGraphs.isSubtree(unbalancedTree, balancedTree)
        chapter4TreesAndGraphs.isSubtree(tree, subTree)
    }

    def "4.8 - "() {

    }

}
