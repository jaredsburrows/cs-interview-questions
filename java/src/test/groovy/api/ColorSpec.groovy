package api

import test.BaseSpec

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
final class ColorSpec extends BaseSpec {
    def "values"() {
        expect:
        Color.valueOf(Color.BLUE.toString())
        Color.values().length == 3
    }
}
