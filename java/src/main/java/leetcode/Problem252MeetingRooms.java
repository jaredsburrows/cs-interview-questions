package leetcode;

import java.util.Arrays;
import java.util.Comparator;
import leetcode.api.Interval;

/**
 * https://leetcode.com/problems/meeting-rooms/description/
 */
public final class Problem252MeetingRooms {
    public boolean canAttendMeetings(Interval[] intervals) {
        if (intervals == null || intervals.length == 0) {
            return true;
        }

        Arrays.sort(intervals, Comparator.comparingInt(left -> left.start));

        for (int i = 1; i < intervals.length; i++) {
            if (!((intervals[i - 1].end <= intervals[i].start)
                && (intervals[i - 1].end <= intervals[i].end))) {
                return false;
            }
        }

        return true;
    }
}
