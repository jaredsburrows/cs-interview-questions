package leetcode;

/**
 * https://leetcode.com/problems/student-attendance-record-i/
 */
public final class Problem551StudentAttendanceRecordI {
    public boolean checkRecord(String s) {
        int a = 0;
        int l = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A') {
                a++;

                if (a > 1) {
                    return false;
                }
            }

            if (s.charAt(i) == 'L') {
                l++;
                if (l > 2) {
                    return false;
                }
            } else {
                l = 0;
            }
        }

        return true;
    }
}
