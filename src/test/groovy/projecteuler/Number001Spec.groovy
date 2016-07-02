package projecteuler

import test.BaseSpec

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
class Number001Spec extends BaseSpec {

    def "testGetMultiplesOf3And5"() {
        expect:
        Number001.getMultiplesOf3And5() == 233168
    }

    def "testGetMultiplesOf3And52"() {
        expect:
        Number001.getMultiplesOf3And52() == 233168
    }
}
