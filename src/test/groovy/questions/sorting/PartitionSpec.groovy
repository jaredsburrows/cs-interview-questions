package questions.sorting

import spock.lang.Specification

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
class PartitionSpec extends Specification {

    def "part"() {
        given:
        def numbers = [4, 5, 3, 7, 2] as int[]

        when:
        Partition.part(numbers as int[], 0)

        then:
        [2, 3, 4, 7, 5] as int[] == numbers as int[]
    }

    def "part3"() {
        given:
        def numbers = [4, 5, 3, 7, 2] as int[]

        when:
        Partition.part(numbers as int[], 0)

        then:
        [2, 3, 4, 7, 5] as int[] == numbers as int[]
    }
}
