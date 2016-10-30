package api;

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
public final class Trio<T1, T2, T3> {

    private final T1 mFirst;
    private final T2 mSecond;
    private final T3 mThird;

    public Trio(final T1 first, final T2 second, final T3 third) {
        this.mFirst = first;
        this.mSecond = second;
        this.mThird = third;
    }

    public T1 getFirst() {
        return this.mFirst;
    }

    public T2 getSecond() {
        return this.mSecond;
    }

    public T3 getThird() {
        return this.mThird;
    }

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
        return "Trio{"
                + "mFirst=" + this.mFirst
                + ", mSecond=" + this.mSecond
                + ", mThird=" + this.mThird
                + '}';
    }
}
