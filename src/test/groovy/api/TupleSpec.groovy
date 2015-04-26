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
        tuple.equals(tuple)
        !tuple.equals("test")
        tuple.equals(tuple2)
        new Tuple<String, Integer>("test", 123).equals(new Tuple<String, Integer>("test", 123))
        !new Tuple<String, Integer>("d", 1243).equals(new Tuple<String, Integer>("321", 123))
    }

    def "hashcode"() {
        expect:
        tuple.hashCode() == tuple2.hashCode()
        new Tuple<String, Integer>("test", 123).hashCode() == new Tuple<String, Integer>("test", 123).hashCode()
        new Tuple<String, Integer>("d", 1243).hashCode() != new Tuple<String, Integer>("test", 123).hashCode()
    }
}
