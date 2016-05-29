package api;

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
public final class Tuple<X, Y> {

    private final X x;
    private final Y y;

    public Tuple(final X x, final Y y) {
        this.x = x;
        this.y = y;
    }

    public X getX() {
        return this.x;
    }

    public Y getY() {
        return this.y;
    }

    @SuppressWarnings("SimplifiableIfStatement")
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        final Tuple<?, ?> tuple = (Tuple<?, ?>) o;

        if (this.x != null ? !this.x.equals(tuple.x) : tuple.x != null) {
            return false;
        }

        return this.y != null ? this.y.equals(tuple.y) : tuple.y == null;
    }

    @Override
    public int hashCode() {
        int result = x != null ? this.x.hashCode() : 0;
        result = 31 * result + (this.y != null ? y.hashCode() : 0);
        return result;
    }
}
