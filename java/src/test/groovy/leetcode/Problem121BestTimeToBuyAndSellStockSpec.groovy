package leetcode

import spock.lang.Specification
import spock.lang.Unroll

final class Problem121BestTimeToBuyAndSellStockSpec extends Specification {
    @Unroll def "maxProfit(#prices) = #answer"() {
        given:
        def sut = new Problem121BestTimeToBuyAndSellStock()

        expect:
        sut.maxProfit(prices as int[]) == answer

        where:
        prices             || answer
        [7, 1, 5, 3, 6, 4] || 5
        [7, 6, 4, 3, 1]    || 0
    }
}
