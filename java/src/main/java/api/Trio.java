package api;

import java.util.Objects;

public final class Trio<F, S, T> {
    private final F first;
    private final S second;
    private final T third;

    public Trio(F first, S second, T third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public F getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
    }

    public T getThird() {
        return third;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        final Trio<?, ?, ?> trio = (Trio<?, ?, ?>) o;
        return Objects.equals(first, trio.first) &&
            Objects.equals(second, trio.second) &&
            Objects.equals(third, trio.third);
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, second, third);
    }

    @Override
    public String toString() {
        return "Trio{" +
            "first=" + first +
            ", second=" + second +
            ", third=" + third +
            '}';
    }
}
