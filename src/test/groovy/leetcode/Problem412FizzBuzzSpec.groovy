package leetcode

import spock.lang.Specification
import spock.lang.Unroll

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
final class Problem412FizzBuzzSpec extends Specification {
    @Unroll def "testFizzBuzz"() {
        expect:
        Problem412FizzBuzz.fizzBuzz(a) == b

        where:
        a  || b
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
