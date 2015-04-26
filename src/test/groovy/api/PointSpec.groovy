package api

import spock.lang.Specification

class PointSpec extends Specification {

    Point point1
    Point point2

    def "setup"() {
        point1 = new Point(321, 123)
        point2 = new Point(321, 123)
    }

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
        point1.equals(point1)
        !point1.equals("test")
        point2.equals(point1)
        new Point(321, 123).equals(new Point(321, 123))
        !new Point(32, 1243).equals(new Point(321, 123))
    }

    def "hashcode"() {
        expect:
        point2.hashCode() == point1.hashCode()
        new Point(321, 123).hashCode() == new Point(321, 123).hashCode()
        new Point(3221, 1323).hashCode() != new Point(321, 123).hashCode()
    }
}
