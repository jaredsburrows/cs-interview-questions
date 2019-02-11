package api

import spock.lang.Specification

final class ColorSpec extends Specification {
    def 'values'() {
        expect:
        Color.valueOf(Color.BLUE.toString())
        Color.values().length == 3
    }
}
