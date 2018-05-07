package leetcode.api;

public final class Interval {
    public final int start;
    public final int end;

    public Interval() {
        this(0, 0);
    }

    public Interval(int s, int e) {
        start = s;
        end = e;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        final Interval interval = (Interval) o;

        if (start != interval.start) return false;
        return end == interval.end;
    }

    @Override
    public int hashCode() {
        int result = start;
        result = 31 * result + end;
        return result;
    }

    @Override
    public String toString() {
        return "Interval{" +
            "start=" + start +
            ", end=" + end +
            '}';
    }
}
