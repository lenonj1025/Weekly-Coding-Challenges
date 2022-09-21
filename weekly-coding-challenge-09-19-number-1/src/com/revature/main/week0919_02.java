package com.revature.main;

import java.util.Scanner;

public class week0919_02 {

    public static void main(String[] args)  {
        String S = "asdbjb123131";

        System.out.println(sumDigitsInString(S));
    }

    public static int sumDigitsInString(String S) {

        String temp = "0";
        int sum = 0;
        int digitSum;

            for (int i = 0; i < S.length(); i++) {
                char ch = S.charAt(i);

                if (Character.isDigit(ch)) {
                    digitSum = Character.getNumericValue(ch);
                    sum += digitSum;
                }

            }
        return sum;
    }
}
