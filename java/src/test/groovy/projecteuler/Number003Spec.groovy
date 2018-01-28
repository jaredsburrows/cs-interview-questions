package projecteuler

import test.BaseSpec

final class Number003Spec extends BaseSpec {
    def "getLargestPrimeFactor"() {
        expect:
        Number003.getLargestPrimeFactor(600851475143L) == 6857
    }
}
