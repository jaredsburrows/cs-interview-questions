package api

import nl.jqno.equalsverifier.EqualsVerifier
import nl.jqno.equalsverifier.Warning
import spock.lang.Specification

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
class TreeNodeSpec extends Specification {

    def "test values"() {
        def valueNode = new TreeNode<>(5)
        def blankNode = new TreeNode<>(0)
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

    def "equals"() {
        when:
        EqualsVerifier.forClass(TreeNode.class)
                .usingGetClass()
                .withPrefabValues(TreeNode.class, new TreeNode<>(1), new TreeNode<>(2))
                .suppress(Warning.NONFINAL_FIELDS)
                .verify()

        then:
        noExceptionThrown()
    }
}
