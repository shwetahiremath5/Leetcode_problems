
import java.util.*;

public class _5_wordBreak {

    public static boolean wordBreak(String s, List<String> wordDict) {

        // Convert list to HashSet for fast searching
        Set<String> set = new HashSet<>(wordDict);

        // DP array
        boolean[] dp = new boolean[s.length() + 1];

        // Empty string is always valid
        dp[0] = true;

        // Check every position
        for (int i = 1; i <= s.length(); i++) {

            // Try every possible split
            for (int j = 0; j < i; j++) {

                // If left part is valid
                // and right part exists in dictionary
                if (dp[j] && set.contains(s.substring(j, i))) {

                    dp[i] = true;
                    break;
                }
            }
        }

        // Return final answer
        return dp[s.length()];
    }

    public static void main(String[] args) {

        String s = "leetcode";

        List<String> wordDict = Arrays.asList("leet", "code");

        boolean result = wordBreak(s, wordDict);

        System.out.println(result);
    }
}

