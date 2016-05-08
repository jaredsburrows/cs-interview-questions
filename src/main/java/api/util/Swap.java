package api.util;


/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
public class Swap {

    public static <T> void swap(final T[] a, final int i, final int j) {
        final T t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}
