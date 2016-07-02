package questions.stringarraymatrix

import api.Trio
import spock.lang.Ignore
import spock.lang.Specification

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
class ThreeSumSpec extends Specification {

    def "list all trios(x ,y), equal given number, allow duplicates"() {
        expect:
        ThreeSum.getSums2(a as int[], b) == c

        where:
        a         | b | c
        [1, 1, 1] | 0 | []
        [1, 1, 1] | 3 | [new Trio<>(1, 1, 1), new Trio<>(1, 1, 1), new Trio<>(1, 1, 1),
                          new Trio<>(1, 1, 1), new Trio<>(1, 1, 1), new Trio<>(1, 1, 1),
                          new Trio<>(1, 1, 1), new Trio<>(1, 1, 1), new Trio<>(1, 1, 1),
                          new Trio<>(1, 1, 1), new Trio<>(1, 1, 1), new Trio<>(1, 1, 1),
                          new Trio<>(1, 1, 1), new Trio<>(1, 1, 1), new Trio<>(1, 1, 1),
                          new Trio<>(1, 1, 1), new Trio<>(1, 1, 1), new Trio<>(1, 1, 1),
                          new Trio<>(1, 1, 1), new Trio<>(1, 1, 1), new Trio<>(1, 1, 1),
                          new Trio<>(1, 1, 1), new Trio<>(1, 1, 1), new Trio<>(1, 1, 1),
                          new Trio<>(1, 1, 1), new Trio<>(1, 1, 1), new Trio<>(1, 1, 1)]
    }

    @Ignore
    def "list trios(x ,y), equal given number, no duplicates"() {
        expect:
        ThreeSum.getSums(a as int[], b) == c

        where:
        a                     | b | c
        [1, 1, 1]             | 0 | []
        [-1, 0, 1, 2, -1, -4] | 0 | [new Trio<>(-1, -1, 2), new Trio<>(-1, 0, 1)]
        //          [Trio{mFirst=0, mSecond=-1, mThird=1}, Trio{mFirst=2, mSecond=2, mThird=-4}]

    }
}
