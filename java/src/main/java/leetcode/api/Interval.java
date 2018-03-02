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
}
