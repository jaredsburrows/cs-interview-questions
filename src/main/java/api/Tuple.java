package api;

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
public final class Tuple<X, Y> {

    private final X mX;
    private final Y mY;

    public Tuple(final X left, final Y right) {
        this.mX = left;
        this.mY = right;
    }

    public X getX() {
        return this.mX;
    }

    public Y getY() {
        return this.mY;
    }

    @SuppressWarnings("SimplifiableIfStatement")
    @Override
    public boolean equals(final Object object) {
        if (this == object) {
            return true;
        }

        if (object == null || getClass() != object.getClass()) {
            return false;
        }

        final Tuple<?, ?> tuple = (Tuple<?, ?>) object;

        if (this.mX != null ? !this.mX.equals(tuple.mX) : tuple.mX != null) {
            return false;
        }

        return this.mY != null ? this.mY.equals(tuple.mY) : tuple.mY == null;
    }

    @Override
    public int hashCode() {
        int result = mX != null ? this.mX.hashCode() : 0;
        result = 31 * result + (this.mY != null ? mY.hashCode() : 0);
        return result;
    }
}
