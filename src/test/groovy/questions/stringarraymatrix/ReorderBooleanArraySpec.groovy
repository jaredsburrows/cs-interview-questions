package questions.stringarraymatrix

import spock.lang.Specification

class ReorderBooleanArraySpec extends Specification {

    def "reorder bools - primitive"() {
        given:
        ReorderBooleanArray reorderBooleanArray = new ReorderBooleanArray()
        boolean[] b = [false, true, true, true, false, true]

        when:
        reorderBooleanArray.getReorderBoolPrimitives(b)

        then:
        b == [false, false, true, true, true, true]
    }

    def "reorder bools - object"() {
        given:
        ReorderBooleanArray reorderBooleanArray = new ReorderBooleanArray()
        Boolean[] b = [false, true, true, true, false, true]

        when:
        reorderBooleanArray.getReorderBoolObjects(b)

        then:
        b == [false, false, true, true, true, true]
    }
}
