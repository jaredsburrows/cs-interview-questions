package questions.bitmanipulation

import spock.lang.Specification

class AddTwoNumbersSpec extends Specification {

    def "getBinarySum"() {
        expect:
        AddTwoNumbers.getBinarySumLib(a, b) == c
        AddTwoNumbers.getBinarySum(a, b) == c
        AddTwoNumbers.getBinarySumBit(a, b) == c

        where:
        a           || b           || c
        null        || null        || null
        "010101101" || null        || "010101101"
        null        || "010101101" || "010101101"
        "010101101" || "101011010" || "1000000111"
    }

}
