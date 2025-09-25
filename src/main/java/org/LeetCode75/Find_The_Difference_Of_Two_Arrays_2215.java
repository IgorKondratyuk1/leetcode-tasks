package org.LeetCode75;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Find_The_Difference_Of_Two_Arrays_2215 {
    public static void main(String[] args) {
        int[] nums1 = {48,-111,73,26,382,-97,-129,91,110,373,-360,-236,194,282,-229,352,25,213,-15,193,365,187,277,-20};
        int[] nums2 = {-371,41,261,-294,-247,-63,-47,384,425,58,484,393,236,-265,-198,-415,-366,284,136,-470,433,390,-160,-410,-317,-252,-41,-423,177,350,-92,448,-125,-229,35,110,443,-73,328};

        System.out.println(findDifference(nums1, nums2));
    }

    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<Integer> disctinctNums1 = Arrays.stream(nums1).distinct().boxed().collect(Collectors.toList());
        List<Integer> disctinctNums2 = Arrays.stream(nums2).distinct().boxed().collect(Collectors.toList());

        List<List<Integer>> answers = new ArrayList<>();
        List<Integer> commonNums = new ArrayList<>();

        for (int i = 0; i < disctinctNums1.size(); i++) {
            for (int j = 0; j < disctinctNums2.size(); j++) {
                if (disctinctNums1.get(i).equals(disctinctNums2.get(j))) {
                    commonNums.add(disctinctNums1.get(i));
                }
            }
        }

        answers.add(getUnique(disctinctNums1, commonNums));
        answers.add(getUnique(disctinctNums2, commonNums));
        return answers;
    }

    static List<Integer> getUnique(List<Integer> arr1, List<Integer> arr2) {
        List<Integer> result = new ArrayList();
        for (int n : arr1) {
            boolean isUnique = true;
            for (Integer commonNum : arr2) {
                if (commonNum.equals(n)) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                result.add(n);
            }

        }
        return result;
    }
}
