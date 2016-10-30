package api;

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
public final class Trio<First, Second, Third> {

    private final First first;
    private final Second second;
    private final Third third;

    public Trio(final First first, final Second second, final Third third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public First getFirst() {
        return first;
    }

    public Second getSecond() {
        return second;
    }

    public Third getThird() {
        return third;
    }

    @Override
    public boolean equals(final Object object) {
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

    @Override
    public String toString() {
        return "Trio{"
            + "first=" + first
            + ", second=" + second
            + ", third=" + third
            + '}';
    }

}
