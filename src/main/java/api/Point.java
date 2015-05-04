package api;

public class Point {
    private final int x;
    private final int y;

    public Point(final int x, final int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    @Override
    public boolean equals(final Object object) {
        if (this == object) {
            return true;
        }

        if (!(object instanceof Point)) {
            return false;
        }

        final Point point = (Point) object;

        return this.x == point.x && this.y == point.y;
    }

    @Override
    public int hashCode() {
        int result = 0;

        result = 31 * result + this.x;
        result = 31 * result + this.y;

        return result;
    }
}
