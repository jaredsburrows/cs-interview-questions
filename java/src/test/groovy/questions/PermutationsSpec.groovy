package questions

import questions.Permutations
import spock.lang.Specification
import spock.lang.Unroll

final class PermutationsSpec extends Specification {
    @Unroll def 'getStringPermutations(\'\', #a) == #b'() {
        expect:
        Permutations.getStringPermutations('', a) == b

        where:
        a     || b
        null  || []
        ''    || ['']
        'abc' || ['abc', 'acb', 'bca', 'bac', 'cab', 'cba']
    }
}
