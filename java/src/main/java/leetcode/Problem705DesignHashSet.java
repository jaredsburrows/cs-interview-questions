package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/design-hashset
 */
@SuppressWarnings("ClassCanBeStatic") // Leetcode is not static
public final class Problem705DesignHashSet {
    public final class MyHashSet {
        private final Object PRESENT = new Object();
        private final Map<Integer, Object> map = new HashMap<>();

        public void add(int key) {
            map.put(key, PRESENT);
        }

        public void remove(int key) {
            map.remove(key);
        }

        public boolean contains(int key) {
            return map.containsKey(key);
        }
    }
}
