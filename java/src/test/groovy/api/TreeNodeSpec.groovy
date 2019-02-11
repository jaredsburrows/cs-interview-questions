package api

import nl.jqno.equalsverifier.EqualsVerifier
import nl.jqno.equalsverifier.Warning
import spock.lang.Specification

final class TreeNodeSpec extends Specification {
    def sut = new TreeNode<>()

    def 'values'() {
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

    def 'equals/hashCode'() {
        when:
        EqualsVerifier.forClass(TreeNode.class)
            .withPrefabValues(TreeNode.class, new TreeNode<>(), new TreeNode<>(1))
            .suppress(Warning.NONFINAL_FIELDS)
            .verify()

        then:
        noExceptionThrown()
    }
}
