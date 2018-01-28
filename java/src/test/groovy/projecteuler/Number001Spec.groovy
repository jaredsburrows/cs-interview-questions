package projecteuler

import test.BaseSpec

final class Number001Spec extends BaseSpec {
    def "getMultiplesOf3And5"() {
        expect:
        Number001.getMultiplesOf3And5() == 233168
        Number001.getMultiplesOf3And52() == 233168
    }
}
