package questions

import questions.ReorderBooleanArray
import spock.lang.Specification

final class ReorderBooleanArraySpec extends Specification {
    def 'reorder boolean - primitive'() {
        given:
        def actual = [false, true, true, true, false, true] as boolean[]
        def expected = [false, false, true, true, true, true] as boolean[]

        when:
        actual = ReorderBooleanArray.getReorderBoolPrimitives(actual)

        then:
        actual == expected
    }

    def 'reorder boolean - object'() {
        given:
        def actual = [false, true, true, true, false, true] as Boolean[]
        def expected = [false, false, true, true, true, true] as Boolean[]

        when:
        actual = ReorderBooleanArray.getReorderBoolObjects(actual)

        then:
        actual as boolean[] == expected as boolean[]
    }
}
