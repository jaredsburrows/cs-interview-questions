package api;

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
public final class Point {

    private final int mX;
    private final int mY;

    public Point(final int positionX, final int positionY) {
        this.mX = positionX;
        this.mY = positionY;
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

        if (object == null || this.getClass() != object.getClass()) {
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

    @Override
    public String toString() {
        return "Point{"
                + "mX=" + this.mX
                + ", mY=" + this.mY
                + '}';
    }
}
