package api.util;

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
public class Swap {
    public static <T> void swap(T[] array, int left, int right) {
        final T temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }
}
