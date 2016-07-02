package codingbat.warmup

import spock.lang.Specification

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
class SleepInSpec extends Specification {

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
