package projecteuler

import projecteuler.number1.Number1
import projecteuler.number2.Number2
import projecteuler.number3.Number3
import projecteuler.number4.Number4
import spock.lang.Specification

class ProjectEulerSpec extends Specification {

    def "Test Problem 1 - [Multiples of 3 and 5]"() {
        expect:
        Number1.getMultiplesOf3And5ON() == 233168
        Number1.getMultiplesOf3And5() == 233168
    }

    def "Test Problem 2 - [Even Fibonacci numbers]"() {
        expect:
        Number2.getEvenFibonacciNumbers(4000000) == 4613732
    }

    def "Test Problem 3 - [Largest prime factor]"() {
        expect:
        Number3.getLargestPrimeFactor(600851475143L) == 6857
    }

    def "Test Problem 4 - [Largest palindrome product]"() {
        expect:
        Number4.getLargestPalindromeProduct() == 906609
    }
}
