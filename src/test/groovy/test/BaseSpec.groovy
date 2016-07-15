package test

import api.Node
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
    @Shared def static final NUMBER_NEGATIVE_ONE = -1
    @Shared def static final NUMBER_ZERO = 0
    @Shared def static final NUMBER_ONE = 1
    @Shared def static final STRING_EMPTY = ""
    @Shared def static final STRING_NULL = null
    @Shared def static final STRING_UNIQUE = randomUUID().toString()
    @Shared def static final STRING_UNIQUE2 = randomUUID().toString() + randomUUID().toString()
    @Shared def static final STRING_UNIQUE3 = randomUUID().toString()
    @Shared def static final INTEGER_RANDOM = new Random().nextInt()
    @Shared def static final INTEGER_RANDOM_POSITIVE = new Random().nextInt(Integer.SIZE - 1)
    @Shared def static final LONG_RANDOM = new Random().nextLong()
    @Shared def static final DOUBLE_RANDOM = new Random().nextDouble()

    // Api
    @Shared def node0 = new Node<>(0)
    @Shared def node1 = new Node<>(1)
    @Shared def node2 = new Node<>(2)
    @Shared def node3 = new Node<>(3)
    @Shared def node4 = new Node<>(4)

    def "setup"() {

    }

    def "cleanup"() {

    }
}
