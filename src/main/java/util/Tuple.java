package util;

public class Tuple<X, Y> {
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

    @Override
    public boolean equals(final Object object) {
        if (this == object) {
            return true;
        }

        if (!(object instanceof Tuple)) {
            return false;
        }

        final Tuple<?, ?> tuple = (Tuple<?, ?>) object;

        return tuple.getX().equals(this.x) && tuple.getY().equals(this.y);
    }

    @Override
    public int hashCode() {
        int result = 0;

        result = 31 * result + (this.x != null ? this.x.hashCode() : 0);
        result = 31 * result + (this.y != null ? this.y.hashCode() : 0);

        return result;
    }
}
