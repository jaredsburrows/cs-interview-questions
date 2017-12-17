package questions.recursion;

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
public final class FloodFill {
    public static void floodFill(int[][] array, int positionX, int positionY, int newColor) {
        // Start with the color that x,y
        final int oldColor = array[positionX][positionY];

        floodFill(array, positionX, positionY, oldColor, newColor);
    }

    public static void floodFill(int[][] array, int positionX, int positionY, int oldColor,
                                 int newColor) {
        final int length = array.length;

        if (positionX < 0 || positionX >= length) {
            return;
        }

        if (positionY < 0 || positionY >= length) {
            return;
        }

        if (array[positionX][positionY] != oldColor) {
            return;
        }

        // Set new color
        array[positionX][positionY] = newColor;

        floodFill(array, positionX + 1, positionY, oldColor, newColor); // right
        floodFill(array, positionX - 1, positionY, oldColor, newColor); // left
        floodFill(array, positionX, positionY + 1, oldColor, newColor); // down
        floodFill(array, positionX, positionY - 1, oldColor, newColor); // up
    }
}
