package api.util;

public class Swap {
    // Time - O(1), Space - O(1)
    public static <T> void swap(T[] array, int left, int right) {
        T temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }
}
