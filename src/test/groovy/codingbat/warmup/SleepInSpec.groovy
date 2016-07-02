package codingbat.warmup

import test.BaseSpec

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
class SleepInSpec extends BaseSpec {

    def "sleepIn"() {
        expect:
        SleepIn.sleepIn(a, b) == c

        where:
        a     | b     | c
        false | false | true
        true  | false | false
        false | true  | true
    }
}
