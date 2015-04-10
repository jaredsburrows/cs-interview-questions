package crackingthecode.part4additionalreviewproblems

import spock.lang.Specification

class Chapter20HardSpec extends Specification {

    def "addTwoNumbers"() {
        expect:
        Chapter20Hard.addTwoNumbers(a, b) == c

        where:
        a     || b      || c
        1     || 2      || 3
        -12   || 10     || -2
        14123 || 453115 || 467238
    }

    def "subtractTwoNumbers"() {
        expect:
        Chapter20Hard.substractTwoNumbers(a, b) == c

        where:
        a      || b     || c
        3      || 1     || 2
        -2     || -12   || 10
        467238 || 14123 || 453115
    }

}
