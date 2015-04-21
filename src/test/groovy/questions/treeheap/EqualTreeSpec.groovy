package questions.treeheap
import api.TreeNode
import spock.lang.Specification

class EqualTreeSpec extends Specification {

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

    def "isEqualTree"() {
        expect:
        EqualTree.isEqual(null, null)
        !EqualTree.isEqual(null, balancedTree)
        !EqualTree.isEqual(unbalancedTree, null)
        !EqualTree.isEqual(unbalancedTree, balancedTree)
        EqualTree.isEqual(balancedTree, balancedTree)
    }
}
