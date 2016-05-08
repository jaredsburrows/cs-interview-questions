package api

import spock.lang.Specification

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
class TupleSpec extends Specification {

    Tuple<String, Integer> tuple = new Tuple<>("test", 123);
    Tuple<String, Integer> tuple2 = new Tuple<>("test", 123);

    def "getX"() {
        expect:
        tuple.getX().equals("test")
    }

    def "getY"() {
        expect:
        tuple.getY() == 123
    }

    def "equals"() {
        expect:
        tuple.equals(tuple)                                                                     // same reference
        !tuple.equals("test")                                                                   // different object
        tuple.equals(tuple2)                                                                    // same values
        !new Tuple<String, Integer>("test", 1).equals(new Tuple<String, Integer>("test", 123))  // different y
        !new Tuple<String, Integer>("test", 1).equals(new Tuple<String, Integer>("t", 1))       // different x
    }

    def "hashcode"() {
        expect:
        tuple.hashCode() == tuple2.hashCode()
        new Tuple<String, Integer>("test", 123).hashCode() ==
                new Tuple<String, Integer>("test", 123).hashCode()
        new Tuple<String, Integer>("test", null).hashCode() !=
                new Tuple<String, Integer>("test", 123).hashCode()
        new Tuple<String, Integer>(null, 123).hashCode() !=
                new Tuple<String, Integer>("test", 123).hashCode()
    }
}
