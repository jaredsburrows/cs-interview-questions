package projecteuler

import spock.lang.Specification

class ProjectEulerSpec extends Specification {

    def "Test Problem 1 - [Multiples of 3 and 5]"() {
        given:
        Number1 number1 = new Number1()

        expect:
        number1.getMultiplesOf3And5ON() == 233168
        number1.getMultiplesOf3And5() == 233168
    }

    def "Test Problem 2 - [Even Fibonacci numbers]"() {
        given:
        Number2 number2 = new Number2()

        expect:
        number2.getEvenFibonacciNumbers(4000000) == 4613732
    }

    def "Test Problem 3 - [Largest prime factor]"() {
        given:
        Number3 number3 = new Number3()

        expect:
        number3.getLargestPrimeFactor(600851475143L) == 6857
    }

    def "Test Problem 4 - [Largest palindrome product]"() {
        given:
        Number4 number4 = new Number4()

        expect:
        number4.getLargestPalindromeProduct() == 906609
    }
}
