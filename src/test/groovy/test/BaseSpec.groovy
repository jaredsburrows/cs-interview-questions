package test

import spock.lang.Shared
import spock.lang.Specification

import static java.util.UUID.randomUUID

/**
 * Base class for all specifications.
 *
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
abstract class BaseSpec extends Specification {

    // Testing Comparisons
    @Shared def NUMBER_NEGATIVE_ONE = -1
    @Shared def NUMBER_ZERO = 0
    @Shared def NUMBER_ONE = 1
    @Shared def DENSITY_LDPI = 36
    @Shared def DENSITY_MDPI = 48
    @Shared def DENSITY_HDPI = 72
    @Shared def DENSITY_XHDPI = 96
    @Shared def DENSITY_XXHDPI = 144
    @Shared def DENSITY_XXXHDPI = 192
    @Shared def STRING_EMPTY = ""
    @Shared def STRING_NULL = null
    @Shared def STRING_UNIQUE = randomUUID().toString()
    @Shared def STRING_UNIQUE2 = randomUUID().toString() + randomUUID().toString()
    @Shared def STRING_UNIQUE3 = randomUUID().toString()
    @Shared def INTEGER_RANDOM = new Random().nextInt()
    @Shared def INTEGER_RANDOM_POSITIVE = new Random().nextInt(Integer.SIZE - 1)
    @Shared def LONG_RANDOM = new Random().nextLong()
    @Shared def DOUBLE_RANDOM = new Random().nextDouble()

    def "setup"() {

    }

    def "cleanup"() {

    }
}
