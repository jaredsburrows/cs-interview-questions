package api

import spock.lang.Specification

class ColorSpec extends Specification {

    def "default values"() {
        expect:
        Color.valueOf(Color.BLUE.toString());
        Color.values().length == 3
        Color.BLUE != Color.RED
        Color.GREEN == Color.GREEN
    }
}
