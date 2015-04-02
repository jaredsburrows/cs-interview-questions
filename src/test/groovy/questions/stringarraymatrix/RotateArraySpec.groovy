package questions.stringarraymatrix

import spock.lang.Specification

class RotateArraySpec extends Specification {

    def "Test - rotate [Correct Values]"() {

        expect:
        RotateArray.rotate(a as int[], b) == c as int[]

        where:
        a               || b  || c
//        [1, 2, 3, 4, 5] || -1 || null
//        [1, 2, 3, 4, 5] || 0  || [1, 2, 3, 4, 5]
        [1, 2, 3, 4, 5] || 1  || [5, 1, 2, 3, 4]
//        [1, 2, 3, 4, 5] || 3  || [3, 4, 5, 1, 2]
//        [1, 2, 3, 4, 5] || 5  || [1, 2, 3, 4, 5]

    }
}
