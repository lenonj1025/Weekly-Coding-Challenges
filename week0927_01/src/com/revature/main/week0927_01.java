package com.revature.main;

import java.util.Arrays;

public class week0927_01 {

    public static void main(String[] args) {

        largestGap(new int[] {9, 4, 26, 26, 0, 0, 5, 20, 6, 25, 5});
        largestGap(new int[] {14, 13, 7, 1, 4, 12, 3, 7, 7, 12, 11, 5, 7});
        largestGap(new int[] {13, 3, 8, 5, 5, 2, 13, 6, 14, 2, 11, 4, 10, 8, 1, 9});
    }

    public static void largestGap(int[] ints) {
        int gap = 0;
        Arrays.sort(ints);
        for(int i = 1; i < ints.length; i++) {
            if (gap < (ints[i] - ints[i - 1])) {
                gap = ints[i] - ints[i - 1];
            }
        }
        System.out.println(gap);

    }
}
