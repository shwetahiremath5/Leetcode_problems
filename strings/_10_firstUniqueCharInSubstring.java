//package strings;

import java.util.*;
public class _10_firstUniqueCharInSubstring {
   
    public static int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        // Count frequency of each character
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Find first non-repeating character
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        //Solution sol = new Solution();

        String s1 = "leetcode";
        System.out.println("Index: " + firstUniqChar(s1)); // 0

        String s2 = "loveleetcode";
        System.out.println("Index: " + firstUniqChar(s2)); // 2

        String s3 = "aabb";
        System.out.println("Index: " + firstUniqChar(s3)); // -1
    }
}

