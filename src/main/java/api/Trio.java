package api;

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
public final class Trio<First, Second, Third> {

    private final First mFirst;
    private final Second mSecond;
    private final Third mThird;

    public Trio(final First first, final Second second, final Third third) {
        this.mFirst = first;
        this.mSecond = second;
        this.mThird = third;
    }

    public First getFirst() {
        return this.mFirst;
    }

    public Second getSecond() {
        return this.mSecond;
    }

    public Third getThird() {
        return this.mThird;
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

        final Trio<?, ?, ?> trio = (Trio<?, ?, ?>) object;

        if (this.mFirst != null ? !this.mFirst.equals(trio.mFirst) : trio.mFirst != null) {
            return false;
        }

        if (this.mSecond != null ? !this.mSecond.equals(trio.mSecond) : trio.mSecond != null) {
            return false;
        }

        return this.mThird != null ? this.mThird.equals(trio.mThird) : trio.mThird == null;
    }

    @Override
    public int hashCode() {
        int result = this.mFirst != null ? this.mFirst.hashCode() : 0;
        result = 31 * result + (this.mSecond != null ? this.mSecond.hashCode() : 0);
        result = 31 * result + (this.mThird != null ? this.mThird.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Trio{" +
                "mFirst=" + this.mFirst
                + ", mSecond=" + this.mSecond
                + ", mThird=" + this.mThird
                + '}';
    }
}
