package crackingthecode.part2conceptsandalgorithms

import api.Color
import spock.lang.Unroll
import test.BaseSpec

import static api.Color.*

final class Chapter8RecursionSpec extends BaseSpec {
    @Unroll def "getFibNumberRecursive(#a) -> #b"() {
        expect:
        Chapter8Recursion.getFibNumberRecursive(a) == b
        Chapter8Recursion.getFibNumberIterative(a) == b

        where:
        a  || b
        -5 || -5
        -1 || -1
        0  || 0
        1  || 1
        2  || 1
        3  || 2
        4  || 3
        5  || 5
        6  || 8
        7  || 13
        8  || 21
    }

    @Unroll def "getSubsets(#a, #b) == '#c'"() {
        expect:
        Chapter8Recursion.getSubsets(a, b) == c

        where:
        a      | b  || c
        null   | 0  || []
        null   | -1 || []
        [0]    | 0  || [[], [0]]
        [1, 2] | 0  || [[], [2], [1], [2, 1]]
    }

    @Unroll def "getStringPermutations(#a) == '#b'"() {
        expect:
        Chapter8Recursion.getStringPermutations(a, b) == c

        where:
        a  | b     || c
        "" | null  || []
        "" | "abc" || ["abc", "acb", "bca", "bac", "cab", "cba"]
    }

    @Unroll def "getValidParentheses(#a, #b, #c, #d) == '#e'"() {
        expect:
        Chapter8Recursion.getValidParentheses(a, b, c, d) == e

        where:
        a  | b  | c  | d    || e
        -1 | 0  | 0  | ""   || []
        0  | -1 | 0  | ""   || []
        0  | 0  | -1 | ""   || []
        0  | 0  | 0  | null || []
        0  | 0  | 0  | ""   || []
        3  | 0  | 0  | ""   || ["((()))", "(()())", "(())()", "()(())", "()()()"]
    }

    def "paintFill"() {
        given:
        def a = [[RED, RED, GREEN, GREEN, GREEN],
                 [GREEN, RED, RED, GREEN, GREEN],
                 [GREEN, GREEN, RED, RED, GREEN],
                 [GREEN, GREEN, GREEN, RED, RED],
                 [GREEN, GREEN, GREEN, GREEN, RED]] as Color[][]

        when:
        Chapter8Recursion.paintFill(a as Color[][], 0, 0, BLUE)

        then:
        a == [[BLUE, BLUE, GREEN, GREEN, GREEN],
              [GREEN, BLUE, BLUE, GREEN, GREEN],
              [GREEN, GREEN, BLUE, BLUE, GREEN],
              [GREEN, GREEN, GREEN, BLUE, BLUE],
              [GREEN, GREEN, GREEN, GREEN, BLUE]] as Color[][]
    }

    def "floodFill"() {
        given:
        def a = [[1, 1, 1, 1, 1, 1, 1, 1],
                 [1, 1, 1, 1, 1, 1, 0, 0],
                 [1, 0, 0, 1, 1, 0, 1, 1],
                 [1, 2, 2, 2, 2, 0, 1, 0],
                 [1, 1, 1, 2, 2, 0, 1, 0],
                 [1, 1, 1, 2, 2, 2, 2, 0],
                 [1, 1, 1, 1, 1, 2, 1, 1],
                 [1, 1, 1, 1, 1, 2, 2, 1]] as int[][]
        def x = 4
        def y = 4
        def newC = 3

        when:
        Chapter8Recursion.floodFill(a as int[][], x, y, newC)

        then:
        a == [[1, 1, 1, 1, 1, 1, 1, 1],
              [1, 1, 1, 1, 1, 1, 0, 0],
              [1, 0, 0, 1, 1, 0, 1, 1],
              [1, 3, 3, 3, 3, 0, 1, 0],
              [1, 1, 1, 3, 3, 0, 1, 0],
              [1, 1, 1, 3, 3, 3, 3, 0],
              [1, 1, 1, 1, 1, 3, 1, 1],
              [1, 1, 1, 1, 1, 3, 3, 1]] as int[][]
    }

    @Unroll def "getRepresentCents(#a) -> #b"() {
        expect:
        // starting with quarters
        Chapter8Recursion.getRepresentCents(a as int, 25) == b
        Chapter8Recursion.makeChange(a as int, 25) == b

        where:
        a    || b
        1000 || 142511
        100  || 242
        10   || 4
        1    || 1
    }
}
