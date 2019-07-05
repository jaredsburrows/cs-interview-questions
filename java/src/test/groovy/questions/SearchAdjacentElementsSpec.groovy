package questions

import questions.SearchAdjacentElements
import spock.lang.Specification
import spock.lang.Unroll

final class SearchAdjacentElementsSpec extends Specification {
    @Unroll def 'search(#a, #b) == #c'() {
        expect:
        SearchAdjacentElements.search(a as int[], b) == c
        SearchAdjacentElements.search2(a as int[], b) == c

        where:
        a                              | b || c
        [1, 2, 3, 4, 5, 4, 5, 6, 5, 6] | 9 || -1
        [1, 2, 3, 4, 5, 4, 5, 6, 5, 6] | 6 || 7
    }
}
