package leetcode;

/**
 * https://leetcode.com/problems/read-n-characters-given-read4
 */
public final class Problem157ReadNCharactersGivenRead4 {
    public int read(char[] buf, int n) {
        if (buf == null || buf.length == 0 || n <= 0 || buf.length < n) {
            return 0;
        }

        final char[] buffer = new char[4];
        boolean eof = false;
        int total = 0;

        while (!eof && total < n) {
            int count = read4(buffer);

            eof = count < 4;

            count = Math.min(count, n - total);

            for (int i = 0; i < count; i++) {
                buf[total++] = buffer[i];
            }
        }

        return total;
    }

    // apart of question
    private int read4(char[] buffer) {
        return 0;
    }
}
