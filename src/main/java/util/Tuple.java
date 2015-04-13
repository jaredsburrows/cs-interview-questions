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
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Tuple) {
            if (((Tuple) obj).getX().equals(this.x)
                    && ((Tuple) obj).getY().equals(this.y)) {
                return true;
            }
        }
        return false;
    }
}
