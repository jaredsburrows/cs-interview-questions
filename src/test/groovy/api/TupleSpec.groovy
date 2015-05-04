package api

import spock.lang.Specification

class TupleSpec extends Specification {

    Tuple<String, Integer> tuple
    Tuple<String, Integer> tuple2

    def "setup"() {
        tuple = new Tuple<>("test", 123);
        tuple2 = new Tuple<>("test", 123);
    }

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
