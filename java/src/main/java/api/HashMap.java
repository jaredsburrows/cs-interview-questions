package api;

import javax.annotation.Nullable;

public final class HashMap<K, V> {
    private int capacity = 10;
    private int size = 0;

    public HashMap() {
        this(10);
    }

    public HashMap(int capacity) {
        this.capacity = capacity;
    }

    public void put(K key, V value) {

    }

    @Nullable
    public V get(K key) {
        return null;
    }

    private static int hash(Object key) {
        if (key == null) {
            return 0;
        } else {
            int hashCode = key.hashCode();
            int shift = hashCode >>> 16;
            return hashCode ^ shift;
        }
    }

    public static class Entry<K, V> {
        private final K key;
        private final V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }
    }
}
