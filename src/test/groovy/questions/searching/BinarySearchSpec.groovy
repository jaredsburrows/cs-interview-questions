package questions.searching

import test.BaseSpec

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
class BinarySearchSpec extends BaseSpec {

    def "test search"() {
        expect:
        BinarySearch.search(a as int[], b) == c

        where:
        a                                                       | b | c
        [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16] | 8 | 7
        [1, 2, 3]                                               | 0 | -1
    }
}
