package questions;

import api.util.Swap;

public final class ReorderBooleanArray {
    /**
     * Given an array A of n objects with Boolean-valued keys, reorder the array so that objects that
     * have the key false appear first. The relative ordering of objects with key true should not
     * change. Use O(1) additional space and O(n) time.
     */
    public static Boolean[] getReorderBoolObjects(Boolean[] array) {
        int lastFalse = 0;

        for (int i = 0; i < array.length; i++) {
            if (!array[i]) {
                Swap.swap(array, lastFalse++, i);
            }
        }

        return array;
    }

    public static boolean[] getReorderBoolPrimitives(boolean[] array) {
        int falseCount = 0;
        for (boolean bool : array) {
            if (!bool) {
                falseCount++;
            }
        }

        for (int i = 0; i < array.length; i++) {
            array[i] = i >= falseCount;
        }

        return array;
    }
}
