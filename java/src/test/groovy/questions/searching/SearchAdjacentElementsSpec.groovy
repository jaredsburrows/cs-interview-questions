package questions.searching

import spock.lang.Unroll
import test.BaseSpec

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
final class SearchAdjacentElementsSpec extends BaseSpec {
    @Unroll def "test search"() {
        expect:
        SearchAdjacentElements.search(a as int[], b) == c
        SearchAdjacentElements.search2(a as int[], b) == c

        where:
        a                              | b || c
        [1, 2, 3, 4, 5, 4, 5, 6, 5, 6] | 9 || -1
        [1, 2, 3, 4, 5, 4, 5, 6, 5, 6] | 6 || 7
    }
}
