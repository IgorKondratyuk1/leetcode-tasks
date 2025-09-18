package org.LeetCode75;

public class Merge_Strings_Alternately_1768 {
    public static void main(String[] args) {
        String word1 = "abc", word2 = "pqrde";
        System.out.println(mergeStrings(word1, word2));
    }

    private static String mergeStrings(String word1, String word2) {
        String[] word1Array = word1.split("");
        String[] word2Array = word2.split("");
        int maxLength = Math.max(word1Array.length, word2Array.length);

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < maxLength; i++) {
            if (word1Array.length > i) {
                result.append(word1Array[i]);
            }

            if (word2Array.length > i) {
                result.append(word2Array[i]);
            }
        }

        return result.toString();
    }
}
