package questions.recursion

import test.BaseSpec

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
final class FloodFillSpec extends BaseSpec {

    def "test floodFill - error bounds"() {
        given:
        def oldColor = 2
        def newColor = 3
        def actual = [[1, 1, 1, 1, 1, 1, 1, 1],
                      [1, 1, 1, 1, 1, 1, 0, 0],
                      [1, 0, 0, 1, 1, 0, 1, 1],
                      [1, 2, 2, 2, 2, 0, 1, 0],
                      [1, 1, 1, 2, 2, 0, 1, 0],
                      [1, 1, 1, 2, 2, 2, 2, 0],
                      [1, 1, 1, 1, 1, 2, 1, 1],
                      [1, 1, 1, 1, 1, 2, 2, 1]] as int[][]

        def expected = [[1, 1, 1, 1, 1, 1, 1, 1],
                        [1, 1, 1, 1, 1, 1, 0, 0],
                        [1, 0, 0, 1, 1, 0, 1, 1],
                        [1, 2, 2, 2, 2, 0, 1, 0],
                        [1, 1, 1, 2, 2, 0, 1, 0],
                        [1, 1, 1, 2, 2, 2, 2, 0],
                        [1, 1, 1, 1, 1, 2, 1, 1],
                        [1, 1, 1, 1, 1, 2, 2, 1]] as int[][]
        when:
        FloodFill.floodFill(actual as int[][], -1, 4, oldColor, newColor)
        FloodFill.floodFill(actual as int[][], 100, 4, oldColor, newColor)
        FloodFill.floodFill(actual as int[][], 4, -1, oldColor, newColor)
        FloodFill.floodFill(actual as int[][], 4, 100, oldColor, newColor)

        then:
        actual == expected
    }

    def "test floodFill - change color"() {
        given:
        // Start on 4, 4
        def positionX = 4
        def positionY = 4
        // 4,4 has a 2, oldColor = 2
        def newColor = 3
        def actual = [[1, 1, 1, 1, 1, 1, 1, 1],
                      [1, 1, 1, 1, 1, 1, 0, 0],
                      [1, 0, 0, 1, 1, 0, 1, 1],
                      [1, 2, 2, 2, 2, 0, 1, 0],
                      [1, 1, 1, 2, 2, 0, 1, 0],
                      [1, 1, 1, 2, 2, 2, 2, 0],
                      [1, 1, 1, 1, 1, 2, 1, 1],
                      [1, 1, 1, 1, 1, 2, 2, 1]] as int[][]

        def expected = [[1, 1, 1, 1, 1, 1, 1, 1],
                        [1, 1, 1, 1, 1, 1, 0, 0],
                        [1, 0, 0, 1, 1, 0, 1, 1],
                        [1, 3, 3, 3, 3, 0, 1, 0],
                        [1, 1, 1, 3, 3, 0, 1, 0],
                        [1, 1, 1, 3, 3, 3, 3, 0],
                        [1, 1, 1, 1, 1, 3, 1, 1],
                        [1, 1, 1, 1, 1, 3, 3, 1]] as int[][]
        when:
        FloodFill.floodFill(actual as int[][], positionX, positionY, newColor)

        then:
        actual == expected
    }

    def "test floodFill - choose color"() {
        given:
        // Start on 4, 4
        def positionX = 4
        def positionY = 4
        def oldColor = 2
        def newColor = 3
        def actual = [[1, 1, 1, 1, 1, 1, 1, 1],
                      [1, 1, 1, 1, 1, 1, 0, 0],
                      [1, 0, 0, 1, 1, 0, 1, 1],
                      [1, 2, 2, 2, 2, 0, 1, 0],
                      [1, 1, 1, 2, 2, 0, 1, 0],
                      [1, 1, 1, 2, 2, 2, 2, 0],
                      [1, 1, 1, 1, 1, 2, 1, 1],
                      [1, 1, 1, 1, 1, 2, 2, 1]] as int[][]
        def expected = [[1, 1, 1, 1, 1, 1, 1, 1],
                        [1, 1, 1, 1, 1, 1, 0, 0],
                        [1, 0, 0, 1, 1, 0, 1, 1],
                        [1, 3, 3, 3, 3, 0, 1, 0],
                        [1, 1, 1, 3, 3, 0, 1, 0],
                        [1, 1, 1, 3, 3, 3, 3, 0],
                        [1, 1, 1, 1, 1, 3, 1, 1],
                        [1, 1, 1, 1, 1, 3, 3, 1]] as int[][]

        when:
        FloodFill.floodFill(actual as int[][], positionX, positionY, oldColor, newColor)

        then:
        actual == expected
    }
}
