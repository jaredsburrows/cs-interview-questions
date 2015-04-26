package questions.math

import spock.lang.Specification

class SubsetsSpec extends Specification {

    def "subsets"() {
        given:
        Subsets subsets = new Subsets()

        expect:
        subsets.subsets(a) == b
        subsets.subsets(a) == b

        where:
        a         || b
        null      || null
        []        || [[]]
        [1]       || [[], [1]]
        [1, 2]    || [[], [1], [2], [1, 2]]
        [1, 2, 3] || [[], [1], [2], [1, 2], [3], [1, 3], [2, 3], [1, 2, 3]]
        [3, 1, 2] || [[], [1], [2], [1, 2], [3], [1, 3], [2, 3], [1, 2, 3]]
    }
}
