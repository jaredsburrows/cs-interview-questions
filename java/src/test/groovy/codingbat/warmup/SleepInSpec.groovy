package codingbat.warmup

import spock.lang.Unroll
import test.BaseSpec

@SuppressWarnings("GroovyPointlessBoolean")
final class SleepInSpec extends BaseSpec {
    @Unroll def "sleepIn(#a, #b) == '#c'"() {
        expect:
        SleepIn.sleepIn(a, b) == c

        where:
        a     | b     || c
        false | false || true
        true  | false || false
        false | true  || true
    }
}
