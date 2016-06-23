package questions.stringarraymatrix

import spock.lang.Specification

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
class ReorderBooleanArraySpec extends Specification {

    def "reorder bools - primitive"() {
        given:
        def actual = [false, true, true, true, false, true] as boolean[]
        def expected = [false, false, true, true, true, true] as boolean[]

        when:
        actual = ReorderBooleanArray.getReorderBoolPrimitives(actual)

        then:
        actual == expected
    }

    def "reorder bools - object"() {
        given:
        def actual = [false, true, true, true, false, true] as Boolean[]
        def expected = [false, false, true, true, true, true] as Boolean[]

        when:
        actual = ReorderBooleanArray.getReorderBoolObjects(actual)

        then:
        actual == expected
    }
}
