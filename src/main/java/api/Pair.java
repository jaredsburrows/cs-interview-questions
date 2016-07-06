package api;

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
public final class Pair<T1, T2> {

    private final T1 mLeft;
    private final T2 mRight;

    public Pair(final T1 left, final T2 right) {
        this.mLeft = left;
        this.mRight = right;
    }

    public T1 getLeft() {
        return this.mLeft;
    }

    public T2 getRight() {
        return this.mRight;
    }

    @SuppressWarnings("SimplifiableIfStatement")
    @Override
    public boolean equals(final Object object) {
        if (this == object) {
            return true;
        }

        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }

        final Pair<?, ?> pair = (Pair<?, ?>) object;

        if (this.mLeft != null ? !this.mLeft.equals(pair.mLeft) : pair.mLeft != null) {
            return false;
        }

        return this.mRight != null ? this.mRight.equals(pair.mRight) : pair.mRight == null;
    }

    @Override
    public int hashCode() {
        int result = this.mLeft != null ? this.mLeft.hashCode() : 0;
        result = 31 * result + (this.mRight != null ? this.mRight.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Pair{"
                + "mLeft=" + this.mLeft
                + ", mRight=" + this.mRight
                + '}';
    }
}
