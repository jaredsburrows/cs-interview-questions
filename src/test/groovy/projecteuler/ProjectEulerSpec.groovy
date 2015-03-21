package projecteuler

import spock.lang.Specification

class ProjectEulerSpec extends Specification {

    def "Test Problem 1 - [Multiples of 3 and 5]"() {
        expect:
        projecteuler.number001.Main.getMultiplesOf3And5ON() == 233168
        projecteuler.number001.Main.getMultiplesOf3And5() == 233168

        where:
        a || b
        2 || 5
    }

    def "Test Problem 2 - [Even Fibonacci numbers]"() {
        assert projecteuler.number002.Main.getEvenFibonacciNumbers(4000000)
    }

}
