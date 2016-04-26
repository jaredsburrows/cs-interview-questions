package api.util;

public class Swap {

    public <T> void swap(final T[] a, final int i, final int j) {
        T t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}
