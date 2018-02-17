package leetcode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import leetcode.api.Interval;

/**
 * https://leetcode.com/problems/merge-intervals
 */
public final class Problem56MergeIntervals {
    public List<Interval> merge(List<Interval> intervals) {
        final List<Interval> result = new ArrayList<>();
        if (intervals == null || intervals.isEmpty()) {
            return result;
        }

        intervals.sort(Comparator.comparingInt(left -> left.start));

        int start = intervals.get(0).start;
        int end = intervals.get(0).end;

        for (Interval interval : intervals) {
            if (interval.start <= end) {
                end = Math.max(end, interval.end);
            } else {
                result.add(new Interval(start, end));
                start = interval.start;
                end = interval.end;
            }
        }

        result.add(new Interval(start, end));
        return result;
    }
}
