package Strings;

import java.util.*;

public class LongestSubstringWithoutDuplicates {

    public static String longestSubstring(String s) {

        Set<Character> set = new HashSet<>();
        int left = 0;
        int maxLen = 0;
        int startIndex = 0;

        for (int right = 0; right < s.length(); right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(s.charAt(right));

            int currentLen = right - left + 1;

            if (currentLen > maxLen) {
                maxLen = currentLen;
                startIndex = left;
            }
        }
        String output=s.substring(startIndex, startIndex + maxLen);
        System.out.println("Longest substring without duplicates::"+ output);
        return output;
    }


    public static void main(String[] args) {
        LongestSubstringWithoutDuplicates.longestSubstring("abcabcbb");
    }
}
