package org.LeetCode75;

public class Greatest_Common_Divisor_Of_Strings_1071 {
    public static void main(String[] args) {
        String str1 = "TAUXXTAUXXTAUXXTAUXXTAUXX",
                str2 = "TAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXX";
        System.out.println("Result: " + gcdOfStrings(str1, str2));
    }


    public static String gcdOfStrings(String str1, String str2) {
        String maxString = str1.length() > str2.length() ? str1 : str2;
        String minString = str1.length() > str2.length() ? str2 : str1;

        for (int i = minString.length(); i > 0; i--) {
            String substrForDivision = minString.substring(0, i);
            String replacedMaxResultStr = maxString.replaceAll(substrForDivision, "");
            String replacedMinResultStr = minString.replaceAll(substrForDivision, "");

            if (replacedMaxResultStr.length() == 0 && replacedMinResultStr.length() == 0) {
                return substrForDivision;
            }
        }

        return "";
    }
}
