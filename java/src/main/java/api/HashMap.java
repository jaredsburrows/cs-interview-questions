package api;

import java.util.Objects;
import javax.annotation.Nullable;

// TODO add support to increase size of array
public final class HashMap<K, V> {
    private static final int INITIAL_CAPACITY = 1 << 4;
    private transient Entry<K, V>[] table;

    public HashMap() {
        this(INITIAL_CAPACITY);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    public HashMap(int capacity) {
        this.table = (Entry<K, V>[]) new Entry[capacity];
    }

    public V put(@Nullable K key, @Nullable V value) {
        Entry<K, V> prev = getElement(key);

        if (prev.next == null) {
            prev.next = new Entry<>(key, value);
        } else {
            prev.next.value = value;
        }

        return prev.value;
    }

    @Nullable
    public V get(Object key) {
        Entry<K, V> prev = getElement(key);
        return prev.next == null ? null : prev.next.value;
    }

    public V remove(Object key) {
        Entry<K, V> prev = getElement(key);

        if (prev.next != null) {
            prev.next = prev.next.next;
        }

        return prev.value;
    }

    private Entry<K, V> getElement(Object key) {
        int index = getIndex(key);
        if (table[index] == null) {
            return table[index] = null;
        }

        Entry<K, V> prev = table[index];
        while (prev.next != null && prev.next.key != key) {
            prev = prev.next;
        }

        return prev;
    }

    private int getIndex(Object key) {
        return getHash(key) % table.length;
    }

    private static int getHash(Object key) {
        if (key == null) {
            return 0;
        } else {
            int hashCode = key.hashCode();
            int shift = hashCode >>> 16;
            return hashCode ^ shift;
        }
    }

    static final class Entry<K, V> {
        final K key;
        V value;
        Entry<K, V> next;

        Entry(K key, V value) {
            this(key, value, null);
        }

        Entry(K key, V value, Entry<K, V> next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }

        public K getKey() {
            return key;
        }

        @Nullable
        public V getValue() {
            return value;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }

            if (!(o instanceof Entry)) {
                return false;
            }

            Entry<?, ?> entry = (Entry<?, ?>) o;
            return Objects.equals(key, entry.key)
                && Objects.equals(value, entry.value);
        }

        @Override
        public int hashCode() {
            return Objects.hashCode(key) ^ Objects.hashCode(value);
        }

        @Override
        public String toString() {
            return key + "=" + value;
        }
    }
}
