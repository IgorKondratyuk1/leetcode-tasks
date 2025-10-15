package org.LeetCode75;

import java.util.ArrayList;
import java.util.List;

public class Kids_With_The_Greatest_Number_Of_Candies_1431 {
    public static void main(String[] args) {
        System.out.println(kidsWithCandies(new int[] {1, 2, 5, 4}, 3)); // [false,true,true,true]
        System.out.println(kidsWithCandies(new int[] {2,3,5,1,3}, 3)); // [true,true,true,false,true]
        System.out.println(kidsWithCandies(new int[] {4,2,1,1,2}, 1)); // [true,false,false,false,false]
        System.out.println(kidsWithCandies(new int[] {12,1,12}, 10)); // [true,false,true]
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();

        for (int i = 0; i < candies.length; i++) {
            int currentKidCandiesWithExtra = candies[i] + extraCandies;
            boolean isCurrentKidCandiesGreatestOrEqualInGroup = true;

            for (int j = 0; j < candies.length; j++) {
                if (candies[j] > currentKidCandiesWithExtra) {
                    isCurrentKidCandiesGreatestOrEqualInGroup = false;
                }
            }

            result.add(isCurrentKidCandiesGreatestOrEqualInGroup);
        }

        return result;
    }
}
