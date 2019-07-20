package leetcode;

import java.util.Objects;

/**
 * https://leetcode.com/problems/design-hashmap/
 */
public final class Problem706DesignHashMap {
    public final class MyHashMap {
        private static final int INITIAL_CAPACITY = 1 << 4;
        private final Entry[] table = new Entry[INITIAL_CAPACITY];

        public void put(int key, int value) {
            Entry prev = getElement(key);

            if (prev.next == null) {
                prev.next = new Entry(key, value);
            } else {
                prev.next.value = value;
            }
        }

        public int get(int key) {
            Entry prev = getElement(key);
            return prev.next == null ? -1 : prev.next.value;
        }

        public void remove(int key) {
            Entry prev = getElement(key);

            if (prev.next != null) {
                prev.next = prev.next.next;
            }
        }

        private Entry getElement(int key) {
            int index = getIndex(key);
            if (table[index] == null) {
                return table[index] = new Entry(-1, -1);
            }

            Entry prev = table[index];
            while (prev.next != null && prev.next.key != key) {
                prev = prev.next;
            }

            return prev;
        }

        private int getIndex(int key) {
            return getHash(key) % table.length;
        }

        private int getHash(int key) {
            int hashCode = Objects.hash(key);
            int shift = hashCode >>> 16;
            return hashCode ^ shift;
        }

        final class Entry {
            final int key;
            int value;
            Entry next;

            Entry(int key, int value) {
                this.key = key;
                this.value = value;
            }

            public int getKey() {
                return key;
            }

            public int getValue() {
                return value;
            }
        }
    }
}
