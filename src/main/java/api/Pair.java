package api;

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
public final class Pair<Left, Right> {

    private final Left mLeft;
    private final Right mRight;

    public Pair(final Left left, final Right right) {
        this.mLeft = left;
        this.mRight = right;
    }

    public Left getLeft() {
        return this.mLeft;
    }

    public Right getRight() {
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
        return "Pair{" +
                "mLeft=" + this.mLeft +
                ", mRight=" + this.mRight +
                '}';
    }
}
