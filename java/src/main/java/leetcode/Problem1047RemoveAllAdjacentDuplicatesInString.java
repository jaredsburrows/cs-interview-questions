package leetcode;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/
 */
public final class Problem1047RemoveAllAdjacentDuplicatesInString {
    public String removeDuplicates(String s) {
        int i = -1;
        char[] characters = s.toCharArray();

        for (char character : characters) {
            if (i >= 0 && characters[i] == character) {
                i--;
            } else {
                characters[++i] = character;
            }
        }

        return new String(characters, 0, i + 1);
    }

    public String removeDuplicates2(String S) {
        if (S == null || S.isEmpty()) {
            return "";
        }

        char[] characters = S.toCharArray();
        int i = -1;
        int j = 0;

        while (j < characters.length) {
            if (i < 0 || characters[i] != characters[j]) {
                characters[++i] = characters[j++];
            } else {
                i--;
                j++;
            }
        }

        return new String(characters, 0, i + 1);
    }

    public String removeDuplicates3(String S) {
        if (S == null || S.isEmpty()) {
            return "";
        }

        char[] characters = S.toCharArray();
        Deque<Character> queue = new ArrayDeque<>();
        queue.offerLast(characters[0]);

        for (int i = 1; i < characters.length; i++) {
            if (Objects.equals(queue.peekLast(), characters[i])) {
                queue.removeLast();
            } else {
                queue.offerLast(characters[i]);
            }
        }

        return queue.stream().map(String::valueOf).collect(Collectors.joining());
    }
}
