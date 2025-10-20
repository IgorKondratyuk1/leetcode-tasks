package org.LeetCode75;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Objects;

public class Can_Place_Flowers_605 {
    public static void main(String[] args) {
        System.out.println(canPlaceFlowers(new int[] {1,0,0,0,1}, 1)); // True
        System.out.println(canPlaceFlowers(new int[] {1,0,0,0,1}, 2)); // False
        System.out.println(canPlaceFlowers(new int[] {1,0,1,0,1}, 1)); // False
        System.out.println(canPlaceFlowers(new int[] {1,0,1,0,0,1}, 1)); // False
        System.out.println(canPlaceFlowers(new int[] {1,0,0,0,1,0,0,0,1}, 2)); // True
        System.out.println(canPlaceFlowers(new int[] {1,0,0,0,1,0,1}, 1)); // True
    }

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        System.out.println(Arrays.toString(flowerbed));
        int placedFlowers = 0;

        for (int i = 0; i < flowerbed.length; i++) {
            Integer prev = i > 0 ? flowerbed[i - 1] : null;
            Integer current = flowerbed[i];
            Integer next = i < flowerbed.length - 1 ? flowerbed[i + 1] : null;

            // First
            if (prev == null && current.equals(0) && Objects.equals(next, 0)) {
                flowerbed[i] = 1;
                placedFlowers++;
                continue;
            }

            // Last
            if (Objects.equals(prev,0) && current.equals(0) && next == null) {
                flowerbed[i] = 1;
                placedFlowers++;
                continue;
            }

            // Middle
            if (Objects.equals(prev,0) && current.equals(0) && Objects.equals(next,0)) {
                flowerbed[i] = 1;
                placedFlowers++;
                continue;
            }

            if (prev == null && current.equals(0) && next == null) {
                flowerbed[i] = 1;
                placedFlowers++;
                continue;
            }
        }

        System.out.println(Arrays.toString(flowerbed));
        return placedFlowers >= n;
    }
}
