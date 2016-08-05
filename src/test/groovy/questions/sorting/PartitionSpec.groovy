package questions.sorting

import test.BaseSpec

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
class PartitionSpec extends BaseSpec {

    def "test part"() {
        given:
        def actual = [4, 5, 3, 7, 2] as int[]
        def expected = [2, 3, 4, 7, 5] as int[]

        when:
        Partition.part(actual as int[], 0)

        then:
        actual == expected
    }

    def "test part2"() {
        given:
        def actual = [4, 5, 3, 7, 2] as int[]
        def expected = [2, 3, 4, 7, 5] as int[]

        when:
        Partition.part(actual as int[], 0)

        then:
        actual == expected
    }
}
