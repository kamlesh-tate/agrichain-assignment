package com.example.problem1.kt;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstring {

    public static int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        Map<Character, Integer> lastPos = new HashMap<>();
        int maxLen = 0;
        int start = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (lastPos.containsKey(c) && lastPos.get(c) >= start) {
                start = lastPos.get(c) + 1;
            }
            lastPos.put(c, i);
            int currentLen = i - start + 1;
            if (currentLen > maxLen) {
                maxLen = currentLen;
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        // quick tests
        System.out.println("abcabcbb -> " + lengthOfLongestSubstring("abcabcbb"));  // 3
        System.out.println("bbbbb    -> " + lengthOfLongestSubstring("bbbbb"));     // 1
        System.out.println("pwwkew   -> " + lengthOfLongestSubstring("pwwkew"));    // 3
        System.out.println("empty    -> " + lengthOfLongestSubstring(""));          // 0
    }
}
