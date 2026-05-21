import java.util.HashSet;

class Sol {

    public int longestSubstring(String s) {

        HashSet<Character> charset = new HashSet<>();

        int l = 0;
        int res = 0;

        for (int r = 0; r < s.length(); r++) {

            while (charset.contains(s.charAt(r))) {
                charset.remove(s.charAt(l));
                l++;
            }

            charset.add(s.charAt(r));

            res = Math.max(res, r - l + 1);
        }

        return res;
    }
}

public class _2_LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {

        String str = "abcabcbb";

        Sol a = new Sol();

        System.out.println(a.longestSubstring(str));
    }
}