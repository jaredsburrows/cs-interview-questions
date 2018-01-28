package questions.stringarraymatrix

import spock.lang.Unroll
import test.BaseSpec

final class MergeSortedListsSpec extends BaseSpec {
    @Unroll def "merge(#a) == '#b'"() {
        expect:
        MergeSortedLists.merge(a as List<List<Integer>>) == b as List

        where:
        a                                 || b
        null                              || []
        [[]]                              || []
        [[], []]                          || []
        [[1, 3, 5], null]                 || [1, 3, 5]
        [[1, 2, 3]]                       || [1, 2, 3]
        [[1, 3, 5], [3, 5, 6]]            || [1, 3, 3, 5, 5, 6]
        [[1, 2, 3], [2, 5, 7], [3, 4, 6]] || [1, 2, 2, 3, 3, 4, 5, 6, 7]
    }
}
