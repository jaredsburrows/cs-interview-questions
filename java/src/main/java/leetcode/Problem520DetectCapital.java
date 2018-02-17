package leetcode;

/**
 * https://leetcode.com/problems/detect-capital
 */
public final class Problem520DetectCapital {
    public boolean detectCapitalUse(String word) {
        return word.length() < 2 || isAllCaps(word) || isNotCaps(word) || hasOnlyFirstCap(word);
    }

    private boolean isAllCaps(String word) {
        for (int i = 0; i < word.length(); i++) {
            if (!Character.isUpperCase(word.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    private boolean isNotCaps(String word) {
        for (int i = 0; i < word.length(); i++) {
            if (Character.isUpperCase(word.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    private boolean hasOnlyFirstCap(String word) {
        final boolean firstCap = Character.isUpperCase(word.charAt(0));
        if (!firstCap) {
            return false;
        }

        for (int i = 1; i < word.length(); i++) {
            if (Character.isUpperCase(word.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
