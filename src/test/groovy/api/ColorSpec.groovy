package api

import spock.lang.Specification

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
class ColorSpec extends Specification {

    def "default values"() {
        expect:
        Color.valueOf(Color.BLUE.toString())
        Color.values().length == 3
        Color.BLUE != Color.RED
        Color.GREEN == Color.GREEN
    }
}
