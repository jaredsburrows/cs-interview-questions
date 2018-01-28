package api.util;

public class Swap {
    public static <T> void swap(T[] array, int left, int right) {
        final T temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }
}
