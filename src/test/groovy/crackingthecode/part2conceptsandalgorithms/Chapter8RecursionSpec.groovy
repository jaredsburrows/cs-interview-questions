package crackingthecode.part2conceptsandalgorithms

import spock.lang.Specification

class Chapter8RecursionSpec extends Specification {

    def "Test - card [Correct Values]"() {
        expect:
        Chapter8Recursion.getFibNumberRecursive(a) == b
        Chapter8Recursion.getFibNumberIterative(a) == b

        // 0 1 2 3 4 5 6 7
        // 0 1 1 2 3 5 8 13

        where:
        a  || b
        -5 || -1
        0  || 0
        1  || 1
        2  || 1
        3  || 2
        4  || 3
        5  || 5
        6  || 8
        7  || 13
    }

    def "Test - getStringPermutations [Correct Values]"() {
        expect:
        Chapter8Recursion.getStringPermutations("", a) == b

        where:
        a     || b
//        null  || null
//        ""    || [""]
        "abc" || ["abc", "acb", "bca", "bac", "cab", "cba"]
    }

}
