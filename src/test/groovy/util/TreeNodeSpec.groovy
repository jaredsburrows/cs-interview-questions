package util

import spock.lang.Specification

class TreeNodeSpec extends Specification {

    def "Test - Node [Correct Values]"() {
        TreeNode valueNode = new TreeNode(5)
        TreeNode blankNode = new TreeNode(0)
        blankNode.right = valueNode

        expect:
        valueNode != blankNode
        valueNode.value == 5
        valueNode.right == null
        blankNode != null
        blankNode.value == 0
        blankNode.right == valueNode
        blankNode.right.value == 5
        blankNode.right.right == null
    }
}
