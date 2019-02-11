package leetcode

import spock.lang.Specification
import spock.lang.Unroll

final class Problem442FindAllDuplicatesInAnArraySpec extends Specification {
    @Unroll def 'findDuplicates(#nums) = #answer'() {
        given:
        def sut = new Problem442FindAllDuplicatesInAnArray()

        expect:
        sut.findDuplicates(nums as int[]) == answer

        where:
        nums                     || answer
        null                     || []
        [4, 3, 2, 7, 8, 2, 3, 1] || [2, 3]
        [39, 31, 8, 14, 14, 38, 5, 15,
         29, 49, 18, 6, 30, 47, 8, 35,
         2, 17, 6, 10, 29, 46, 41, 48,
         1, 36, 5, 28, 46, 39, 7, 47,
         18, 42, 17, 11, 36, 45, 21, 33,
         24, 10, 24, 50, 25, 16, 9, 12,
         11, 25]                 || [14, 8, 6, 29, 5, 46, 39, 47, 18, 17, 36, 10, 24, 11, 25]
    }
}
