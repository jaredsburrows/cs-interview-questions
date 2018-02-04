package leetcode;

import java.util.Arrays;
import java.util.Comparator;
import leetcode.api.Interval;

/**
 * https://leetcode.com/problems/meeting-rooms-ii/description
 */
public final class Problem253MeetingRoomsII {
    public int minMeetingRooms(Interval[] intervals) {
        if (intervals == null || intervals.length == 0) {
            return 0;
        }

        Arrays.sort(intervals, Comparator.comparingInt(left -> left.start));

        int count = 1;
        for (int i = 1; i < intervals.length; i++) {
            if (!((intervals[i - 1].end <= intervals[i].start)
                && (intervals[i - 1].end <= intervals[i].end))) {
                count++;
            }
        }

        return count;
    }
}
