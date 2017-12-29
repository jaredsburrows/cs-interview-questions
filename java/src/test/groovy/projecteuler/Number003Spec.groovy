package projecteuler

import test.BaseSpec

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
final class Number003Spec extends BaseSpec {
    def "GetLargestPrimeFactor"() {
        expect:
        Number003.getLargestPrimeFactor(600851475143L) == 6857
    }
}
