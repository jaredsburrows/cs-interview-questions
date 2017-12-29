package projecteuler

import test.BaseSpec

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
final class Number001Spec extends BaseSpec {
    def "GetMultiplesOf3And5"() {
        expect:
        Number001.getMultiplesOf3And5() == 233168
        Number001.getMultiplesOf3And52() == 233168
    }
}
