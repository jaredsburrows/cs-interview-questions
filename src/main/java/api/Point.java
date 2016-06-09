package api;

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
public final class Point {

    private final int mX;
    private final int mY;

    public Point(final int x, final int y) {
        this.mX = x;
        this.mY = y;
    }

    public int getX() {
        return this.mX;
    }

    public int getY() {
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

        final Point point = (Point) object;

        if (this.mX != point.mX) {
            return false;
        }

        return this.mY == point.mY;
    }

    @Override
    public int hashCode() {
        int result = this.mX;
        result = 31 * result + this.mY;
        return result;
    }
}
