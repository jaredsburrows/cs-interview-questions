package questions.recursion;

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
public final class FloodFill {
    public static void floodFill(int[][] array, int positionX, int positionY, int newColor) {
        if (array == null                                   // based
            || array[positionX][positionY] == newColor) {   // // check previous color
            return;
        }

        floodFill(array,
            positionX,
            positionY,
            array[positionX][positionY], // oldColor
            newColor);
    }

    public static void floodFill(int[][] array, int positionX, int positionY, int oldColor,
                                 int newColor) {
        if (array == null                                       // base
            || positionX < 0 || positionX >= array.length       // x
            || positionY < 0 || positionY >= array[0].length    // y
            || array[positionX][positionY] != oldColor) {       // check previous color
            return;
        }

        array[positionX][positionY] = newColor; // Set new color

        floodFill(array, positionX + 1, positionY, oldColor, newColor); // right
        floodFill(array, positionX - 1, positionY, oldColor, newColor); // left
        floodFill(array, positionX, positionY + 1, oldColor, newColor); // down
        floodFill(array, positionX, positionY - 1, oldColor, newColor); // up
    }
}
