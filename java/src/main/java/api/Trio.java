package api;

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
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
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }

        if (object == null || getClass() != object.getClass()) {
            return false;
        }

        final Trio<?, ?, ?> trio = (Trio<?, ?, ?>) object;

        if (first != null ? !first.equals(trio.first) : trio.first != null) {
            return false;
        }

        if (second != null ? !second.equals(trio.second) : trio.second != null) {
            return false;
        }

        return third != null ? third.equals(trio.third) : trio.third == null;
    }

    @Override
    public int hashCode() {
        int result = first != null ? first.hashCode() : 0;
        result = 31 * result + (second != null ? second.hashCode() : 0);
        result = 31 * result + (third != null ? third.hashCode() : 0);
        return result;
    }
}
