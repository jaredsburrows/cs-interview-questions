package questions

import spock.lang.Specification

class CrackingTheCodeSpec extends Specification {

    def "Test - hasUniqueCharacters [Correct Values]"() {
        expect:
        CrackingTheCode.hasUniqueCharacters(a) == b

        where:
        a                             || b
        null                          || false
        ""                            || false
        "abc"                         || true
        "aab"                         || false
        "qazwsxedcrfvtgbyhnujmikolp"  || true
        "qwertyuiopplkjhgfdsazxcvbnm" || false
    }

    def "Test - replaceSpace [Correct Values]"() {
        expect:
        CrackingTheCode.replaceSpaces(a) == b

        where:
        a        || b
        null     || null
        ""       || ""
        "abc"    || "abc"
        "a%20bc" || "abc"
        "%20%20" || ""
    }

    def "Test - isAnagram [Correct Values]"() {
        expect:
        CrackingTheCode.isAnagram(a, b) == c
        CrackingTheCode.isAnagram2(a, b) == c

        where:
        a            || b            || c
        null         || "abc"        || false
        "abc"        || "abc"        || true
        "has"        || "ash"        || true
        "gas"        || "sag"        || true
        "Deductions" || "Discounted" || true
        "fall"       || "foul"       || false
    }

}
