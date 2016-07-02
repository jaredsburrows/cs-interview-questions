package questions.stringarraymatrix

import test.BaseSpec

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
class MergeSortedListsSpec extends BaseSpec {

    def "merge"() {
        expect:
        MergeSortedLists.merge(a as List<List<Integer>>) == b as List

        where:
        a                                 | b
        null                              | null
        [[]]                              | []
        [[1, 3, 5], null]                 | [1, 3, 5]
        [[1, 2, 3]]                       | [1, 2, 3]
        [[1, 3, 5], [3, 5, 6]]            | [1, 3, 3, 5, 5, 6]
        [[1, 2, 3], [2, 5, 7], [3, 4, 6]] | [1, 2, 2, 3, 3, 4, 5, 6, 7]
    }
}
