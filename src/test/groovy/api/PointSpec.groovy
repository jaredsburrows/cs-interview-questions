package api

import spock.lang.Specification

class PointSpec extends Specification {

    Point point1 = new Point(321, 123)
    Point point2 = new Point(321, 123)

    def "getX"() {
        expect:
        point1.getX() == 321
    }

    def "getY"() {
        expect:
        point1.getY() == 123
    }

    def "equals"() {
        expect:
        point1.equals(point1)                               // same reference
        !point1.equals("test")                              // different object
        point2.equals(point1)                               // same values
        !new Point(1, 1).equals(new Point(1, 2))            // different y
        !new Point(1, 1).equals(new Point(2, 1))            // different x
    }

    def "hashcode"() {
        expect:
        point2.hashCode() == point1.hashCode()
        new Point(321, 123).hashCode() == new Point(321, 123).hashCode()
        new Point(3221, 1323).hashCode() != new Point(321, 123).hashCode()
    }
}
