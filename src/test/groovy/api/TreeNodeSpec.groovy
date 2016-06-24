package api

import nl.jqno.equalsverifier.EqualsVerifier
import nl.jqno.equalsverifier.Warning
import spock.lang.Specification

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
class TreeNodeSpec extends Specification {

    def sut = new TreeNode<>()

    def "test values"() {
        def valueNode = new TreeNode<>(5)
        sut.right = valueNode

        expect:
        valueNode != sut
        valueNode.value == 5
        !valueNode.right
        sut
        !sut.value
        sut.right == valueNode
        sut.right.value == 5
        !sut.right.right
    }

    def "equals/hashcode"() {
        when:
        EqualsVerifier.forClass(TreeNode.class)
                .withPrefabValues(TreeNode.class, new TreeNode<>(), new TreeNode<>(1))
                .suppress(Warning.NONFINAL_FIELDS)
                .verify()

        then:
        noExceptionThrown()
    }

    def "string"() {
        given:
        def actual = sut.toString()
        def expected = "TreeNode{value=null, left=null, right=null}"

        expect:
        actual == expected
    }
}
