package api.util;

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
public final class Swap {

    public static <T> void swap(final T[] array, final int left, final int right) {
        final T t = array[left];
        array[left] = array[right];
        array[right] = t;
    }
}
