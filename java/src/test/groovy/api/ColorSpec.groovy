package api

import test.BaseSpec

final class ColorSpec extends BaseSpec {
    def "values"() {
        expect:
        Color.valueOf(Color.BLUE.toString())
        Color.values().length == 3
    }
}
