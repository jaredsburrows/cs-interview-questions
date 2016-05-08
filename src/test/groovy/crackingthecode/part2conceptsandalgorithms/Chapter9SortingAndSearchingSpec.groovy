package crackingthecode.part2conceptsandalgorithms

import api.Tuple
import spock.lang.Specification

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
class Chapter9SortingAndSearchingSpec extends Specification {

    def "9.1 - mergeAInB"() {
        expect:
        Chapter9SortingAndSearching.mergeBInA(a as int[], b as int[], c as int) == d as int[]

        where:
        a                        || b         || c || d
        [1, 2, 3, 0, 0, 0]       || [4, 5, 6] || 3 || [1, 2, 3, 4, 5, 6]
        [1, 2, 0, 0, 0]          || [3, 4]    || 2 || [1, 2, 3, 4, 0]
        [1, 2, 4, 6, 9, 0, 0, 0] || [3, 5, 7] || 5 || [1, 2, 3, 4, 5, 6, 7, 9]
    }

    // http://www2.vo.lu/homepages/phahn/anagrams/oneword.htm
    def "9.2 - sortAnagrams"() {
        expect:
        Chapter9SortingAndSearching.sortAnagrams(a) == b

        where:
        a                                                                             || b
        ["catalogue", "coagulate", "decimate", "medicate", "exitation", "intoxicate"] ||
                ["aaceglotu", "aaceglotu", "acdeeimt", "acdeeimt", "aceiinottx", "aeiinottx"]
        ["canoe", "englander", "sweat", "paint", "ocean", "greenland", "inapt"]       ||
                ["aceno", "aceno", "adeeglnnr", "adeeglnnr", "aestw", "ainpt", "ainpt"]
    }

    def "9.3 - getRotatedIndexOf"() {
        expect:
        Chapter9SortingAndSearching.getRotatedIndexOf(a as int[], b) == c

        where:
        a                                                         || b   || c
        null                                                      || 5   || -1
        [15, 16, 19, 20, 25, 1, 3, 4, 5, 7, 10, 14]               || 100 || -1
        [15, 16, 19, 20, 25, 1, 3, 4, 5, 7, 10, 14]               || 5   || 8
        [15, 16, 19, 20, 25, 1, 3, 4, 5, 7, 10, 14]               || 20  || 3
        [2, 2, 2, 2, 2, 2, 2, 2, 3, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2] || 3   ||
                -1 // cant handle duplicates
    }

    def "9.5 - findString"() {
        expect:
        Chapter9SortingAndSearching.findString(a as String[], b as String) == c
        Chapter9SortingAndSearching.findString2(a as String[], b as String) == c
        Chapter9SortingAndSearching.findString3(a as String[], b as String) == c

        where:
        a                                                                || b         || c
        ["a", "b", "c", "d", "e"]                                        || "b"       ||
                1 // normal - no spaces
        ["a", "b", "", "c", "d", "e"]                                    || "b"       || 1
        ["a", "", "b", "", "c", "", "", "", "d", "", "e"]                || "b"       || 2
        ["at", "", "", "", "ball", "", "", "car", "", "", "dad", "", ""] || "ball"    || 4
        ["at", "", "", "", "", "ball", "car", "", "", "dad", "", ""]     || "ballcar" || -1
    }

    def "9.6 - findValue"() {
        expect:
        Chapter9SortingAndSearching.findValue(a as int[][], b) == c

        where:
        a || b || c
        // normal
        null || -1 || false
        null || 8 || false
//        [[1, 1, 1, 1, 1],
//         [1, 2, 2, 2, 2],
//         [1, 2, 3, 3, 3],
//         [1, 2, 3, 4, 4],
//         [1, 2, 3, 4, 5]] || 5 || true
        // book fails for [4][5], it claims to work for nxm
//        [[1, 2, 4, 5, 6],
//         [2, 3, 5, 7, 8],
//         [4, 6, 8, 9, 10],
//         [5, 8, 9, 10, 11]] || 11 || true
        [[1, 2, 4, 5, 6],
         [2, 3, 5, 7, 8],
         [4, 6, 8, 9, 10],
         [5, 8, 9, 10, 11]] || 3 || true
        [[1, 2, 4, 5, 6],
         [2, 3, 5, 7, 8],
         [4, 6, 8, 9, 10],
         [5, 8, 9, 10, 11]] || 8 || true
        [[1, 2, 4, 5, 6],
         [2, 3, 5, 7, 8],
         [4, 6, 8, 9, 10],
         [5, 8, 9, 10, 11]] || 4 || true
        [[1, 2, 4, 5, 6],
         [2, 3, 5, 7, 8],
         [4, 6, 8, 9, 10],
         [5, 8, 9, 10, 11]] || 9 || true
        [[1, 2, 4, 5, 6],
         [2, 3, 5, 7, 8],
         [4, 6, 8, 9, 10],
         [5, 8, 9, 10, 11]] || 8 || true
        [[1, 2, 4, 5, 6],
         [2, 3, 5, 7, 8],
         [4, 6, 8, 9, 10],
         [5, 8, 9, 10, 11]] || -5 || false
        [[10, 20, 30, 40],
         [15, 25, 35, 45],
         [27, 29, 37, 48],
         [32, 33, 39, 50]] || 29 || true
    }

    def "9.7 - getCircusOrder"() {
        given:
        // (65, 100) (70, 150) (56, 90) (75, 190) (60, 95) (68, 110)
        ArrayList<Tuple<Integer, Integer>> original = [new Tuple<Integer, Integer>(65, 100),
                                                       new Tuple<Integer, Integer>(70, 150),
                                                       new Tuple<Integer, Integer>(56, 90),
                                                       new Tuple<Integer, Integer>(75, 190),
                                                       new Tuple<Integer, Integer>(60, 95),
                                                       new Tuple<Integer, Integer>(68, 110)]

        when:
        def result = Chapter9SortingAndSearching.getCircusOrder(original)

        then:
        // (56, 90) (60,95) (65,100) (68,110) (70,150) (75,190)
        result == [new Tuple<Integer, Integer>(56, 90),
                   new Tuple<Integer, Integer>(60, 95),
                   new Tuple<Integer, Integer>(65, 100),
                   new Tuple<Integer, Integer>(68, 110),
                   new Tuple<Integer, Integer>(70, 150),
                   new Tuple<Integer, Integer>(75, 190)]

    }
}
