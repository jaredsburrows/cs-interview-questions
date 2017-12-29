package questions.math

import spock.lang.Unroll
import test.BaseSpec

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
final class FindMissingNumberSpec extends BaseSpec {
    @Unroll def "findMissing(#a) == '#b'"() {
        expect:
        FindMissingNumber.findMissing(a as int[]) == b
        FindMissingNumber.findMissing2(a as int[]) == b

        where:
        a                               || b
        [1, 2, 0, 4, 5]                 || 3 // 0 is missing integer, keep array length
        [1, 2, 3, 4, 5, 6, 7, 8, 9, 10] || 0
        [1, 2, 3, 4, 5, 6, 7, 8, 0, 10] || 9
    }
}
