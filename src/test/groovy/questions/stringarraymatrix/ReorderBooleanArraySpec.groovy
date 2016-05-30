package questions.stringarraymatrix

import spock.lang.Specification

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
class ReorderBooleanArraySpec extends Specification {

    def "reorder bools - primitive"() {
        given:
        boolean[] b = [false, true, true, true, false, true]

        when:
        ReorderBooleanArray.getReorderBoolPrimitives(b)

        then:
        b == [false, false, true, true, true, true]
    }

    def "reorder bools - object"() {
        given:
        Boolean[] b = [false, true, true, true, false, true]

        when:
        ReorderBooleanArray.getReorderBoolObjects(b)

        then:
        b == [false, false, true, true, true, true]
    }
}
