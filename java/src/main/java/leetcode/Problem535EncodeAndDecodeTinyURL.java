package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/encode-and-decode-tinyurl/
 */
@SuppressWarnings("ClassCanBeStatic") // Leetcode is not static
public final class Problem535EncodeAndDecodeTinyURL {
    public class Codec {
        private final Map<String, String> map = new HashMap<>();

        // Encodes a URL to a shortened URL.
        public String encode(String longUrl) {
            String hashCode = String.valueOf(longUrl.hashCode());

            map.put(hashCode, longUrl);

            return hashCode;
        }

        // Decodes a shortened URL to its original URL.
        public String decode(String shortUrl) {
            return map.get(shortUrl);
        }
    }
}
