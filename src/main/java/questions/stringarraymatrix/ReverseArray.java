package questions.stringarraymatrix;

public class ReverseArray {

    // Time - O(N), Space - O(1)
    public static int[] reverse(int[] array, int start, int end) {
        if (array == null || array.length < 2) {
            return null;
        }

        while (start < end) {
            int tmp = array[start];
            array[start] = array[end];
            array[end] = tmp;

            start++;
            end--;
        }

        return array;
    }
}
