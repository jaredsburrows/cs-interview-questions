package api

import test.BaseSpec
/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
class ColorSpec extends BaseSpec {

    def "test values"() {
        expect:
        Color.valueOf(Color.BLUE.toString())
        Color.values().length == 3
    }
}
