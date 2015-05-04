package questions.stringarraymatrix

import spock.lang.Specification

class RotateArraySpec extends Specification {

    def "rotate"() {
        given:
        RotateArray rotateArray = new RotateArray()

        expect:
        rotateArray.rotate(a as int[], b) == c as int[]

        where:
        a               || b  || c
        [1, 2, 3, 4, 5] || -1 || null
        null            || 1  || null
        [1, 2, 3, 4, 5] || 1  || [5, 1, 2, 3, 4]
    }
}
