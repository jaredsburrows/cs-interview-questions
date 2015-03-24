package crackingthecode.part1datastructures

import spock.lang.Specification
import questions.util.TreeNode;

class Chapter4TreesAndGraphsSpec extends Specification {

    def "Test - isBalanced [Correct Values]"() {
        TreeNode balancedTree = new TreeNode(0);
        balancedTree.right = new TreeNode(10);
        balancedTree.right.left = new TreeNode(10);
        balancedTree.right.right = new TreeNode(10);
        balancedTree.left = new TreeNode(1);
        balancedTree.left.left = new TreeNode(12);
        balancedTree.left.right = new TreeNode(2);

        TreeNode balancedTree2 = new TreeNode(0);
        balancedTree2.right = new TreeNode(10);
        balancedTree2.right.left = new TreeNode(10);
        balancedTree2.left = new TreeNode(1);
        balancedTree2.left.right = new TreeNode(2);

        TreeNode unbalancedTree = new TreeNode(5);
        unbalancedTree.right = new TreeNode(10);
        unbalancedTree.left = new TreeNode(1);
        unbalancedTree.left.left = new TreeNode(12);
        unbalancedTree.left.left.left = new TreeNode(12);

        expect:
        Chapter4TreesAndGraphs.isBalanced(null)
        !Chapter4TreesAndGraphs.isBalanced(unbalancedTree)
        Chapter4TreesAndGraphs.isBalanced(balancedTree)
        Chapter4TreesAndGraphs.isBalanced(balancedTree2)
    }

}
