package codingbat.ap1;

/**
 * https://codingbat.com/prob/p143482
 */
public final class UserCompare {
    public int userCompare(String aName, int aId, String bName, int bId) {
        int compare = aName.compareTo(bName);
        if (compare > 0) {
            return 1;
        }

        if (compare == 0) {
            return Integer.compare(aId, bId);
        }

        return -1;
    }
}
