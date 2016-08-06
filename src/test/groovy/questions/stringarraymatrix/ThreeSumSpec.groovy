package questions.stringarraymatrix

import api.Trio
import spock.lang.Ignore
import test.BaseSpec

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
class ThreeSumSpec extends BaseSpec {

    @Ignore
    def "test list trios(x ,y), equal given number, no duplicates"() {
        expect:
        ThreeSum.getSums(a as int[], b) == c

        where:
        a                     | b | c
        [1, 1, 1]             | 0 | []
        [-1, 0, 1, 2, -1, -4] | 0 | [new Trio<>(-1, -1, 2), new Trio<>(-1, 0, 1)]
        //          [Trio{mFirst=0, mSecond=-1, mThird=1}, Trio{mFirst=2, mSecond=2, mThird=-4}]

    }
}
