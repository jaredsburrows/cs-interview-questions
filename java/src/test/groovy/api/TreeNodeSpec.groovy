package api

import nl.jqno.equalsverifier.EqualsVerifier
import nl.jqno.equalsverifier.Warning
import test.BaseSpec

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
final class TreeNodeSpec extends BaseSpec {

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

    def "test equals/hashCode"() {
        when:
        EqualsVerifier.forClass(TreeNode.class)
            .withPrefabValues(TreeNode.class, new TreeNode<>(), new TreeNode<>(1))
            .suppress(Warning.NONFINAL_FIELDS)
            .verify()

        then:
        noExceptionThrown()
    }
}
