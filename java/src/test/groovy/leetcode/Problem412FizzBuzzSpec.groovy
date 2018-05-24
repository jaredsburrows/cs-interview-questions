package leetcode

import spock.lang.Specification
import spock.lang.Unroll

final class Problem412FizzBuzzSpec extends Specification {
    @Unroll def "fizzBuzz(#n) = #answer"() {
        given:
        def sut = new Problem412FizzBuzz()

        expect:
        sut.fizzBuzz(n) == answer

        where:
        n  || answer
        0  || []
        15 || ["1",
               "2",
               "Fizz",
               "4",
               "Buzz",
               "Fizz",
               "7",
               "8",
               "Fizz",
               "Buzz",
               "11",
               "Fizz",
               "13",
               "14",
               "FizzBuzz"]
    }
}
