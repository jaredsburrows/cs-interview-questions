package util

import spock.lang.Specification

class TupleSpec extends Specification {

    Tuple<String, Integer> tuple = new Tuple<>("test", 123);
    Tuple<String, Integer> tuple2 = new Tuple<>("test", 123);

    def "default values"() {
        expect:
        tuple.getX() == "test"
        tuple.getY() == 123
        tuple.equals(tuple2)
        !new Tuple<>("test", 123).equals(new Tuple<>("test", 321))
    }

    def "equals"() {
        expect:
        tuple.equals(tuple2)
        !new Tuple<>("test", 123).equals(new Tuple<>("test", 321))
    }
}
