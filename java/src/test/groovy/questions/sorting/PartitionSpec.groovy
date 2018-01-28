package questions.sorting

import questions.Partition
import test.BaseSpec

final class PartitionSpec extends BaseSpec {
    def "part"() {
        given:
        def actual = [4, 5, 3, 7, 2] as int[]
        def expected = [2, 3, 4, 7, 5] as int[]

        when:
        Partition.part(actual as int[], 0)

        then:
        actual == expected
    }

    def "part2"() {
        given:
        def actual = [4, 5, 3, 7, 2] as int[]
        def expected = [2, 3, 4, 7, 5] as int[]

        when:
        Partition.part(actual as int[], 0)

        then:
        actual == expected
    }
}
