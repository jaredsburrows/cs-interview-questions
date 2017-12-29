package questions.stringarraymatrix

import test.BaseSpec

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
final class ReorderBooleanArraySpec extends BaseSpec {
    def "reorder boolean - primitive"() {
        given:
        def actual = [false, true, true, true, false, true] as boolean[]
        def expected = [false, false, true, true, true, true] as boolean[]

        when:
        actual = ReorderBooleanArray.getReorderBoolPrimitives(actual)

        then:
        actual == expected
    }

    def "reorder boolean - object"() {
        given:
        def actual = [false, true, true, true, false, true] as Boolean[]
        def expected = [false, false, true, true, true, true] as Boolean[]

        when:
        actual = ReorderBooleanArray.getReorderBoolObjects(actual)

        then:
        actual as boolean[] == expected as boolean[]
    }
}
