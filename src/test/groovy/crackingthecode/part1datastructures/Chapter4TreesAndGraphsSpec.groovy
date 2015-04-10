package crackingthecode.part1datastructures

import util.TreeNode
import spock.lang.Specification

class Chapter4TreesAndGraphsSpec extends Specification {

    TreeNode tree = new TreeNode(26);
    TreeNode subTree = new TreeNode(10);
    TreeNode balancedTree = new TreeNode(0);
    TreeNode balancedTree2 = new TreeNode(0);
    TreeNode unbalancedTree = new TreeNode(5);

    def "setup"() {
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

    def "isBalanced"() {
        expect:
        Chapter4TreesAndGraphs.isBalanced(null)
        !Chapter4TreesAndGraphs.isBalanced(unbalancedTree)
        Chapter4TreesAndGraphs.isBalanced(balancedTree)
        Chapter4TreesAndGraphs.isBalanced(balancedTree2)
    }

    def "getHeight"() {
        expect:
        Chapter4TreesAndGraphs.getHeight(null) == 0
        Chapter4TreesAndGraphs.getHeight(balancedTree) == 3
        Chapter4TreesAndGraphs.getHeight(balancedTree2) == 3
        Chapter4TreesAndGraphs.getHeight(unbalancedTree) == -1
    }

    def "getBinaryTree"() {
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
        Chapter4TreesAndGraphs.getBinaryTree(null, 0, sortedArray.size() - 1) == null
        Chapter4TreesAndGraphs.getBinaryTree(empty, 0, sortedArray.size() - 1) == null
        Chapter4TreesAndGraphs.getBinaryTree(sortedArray, sortedArray.size(), 0) == null
        Chapter4TreesAndGraphs.getBinaryTree(sortedArray, -1, sortedArray.size()) == null
        Chapter4TreesAndGraphs.getBinaryTree(sortedArray, 0, -1) == null
        TreeNode tree = Chapter4TreesAndGraphs.getBinaryTree(sortedArray, 0, sortedArray.size() - 1)
        tree.value == 4
        tree.left.value == 2
        tree.left.left.value == 1
        tree.left.right.value == 3
        tree.right.value == 6
        tree.right.left.value == 5
        tree.right.right.value == 7
    }

    def "isSubtree"() {
        expect:
        Chapter4TreesAndGraphs.isSubtree(null, null)
        !Chapter4TreesAndGraphs.isSubtree(null, balancedTree)
        Chapter4TreesAndGraphs.isSubtree(unbalancedTree, null)
        !Chapter4TreesAndGraphs.isSubtree(unbalancedTree, balancedTree)
        Chapter4TreesAndGraphs.isSubtree(tree, subTree)
    }

    def "isEqualTree"() {
        expect:
        Chapter4TreesAndGraphs.isEqualTree(null, null)
        !Chapter4TreesAndGraphs.isEqualTree(null, balancedTree)
        !Chapter4TreesAndGraphs.isEqualTree(unbalancedTree, null)
        !Chapter4TreesAndGraphs.isEqualTree(unbalancedTree, balancedTree)
        Chapter4TreesAndGraphs.isEqualTree(balancedTree, balancedTree)
    }
}
