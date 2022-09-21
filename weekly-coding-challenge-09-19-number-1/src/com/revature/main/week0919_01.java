package com.revature.main;

import java.util.Arrays;
import java.util.Scanner;

public class week0919_01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] IntArr = new int[N][3];
        for (int i = 0; i < N; i++) {
            IntArr[i][0] = sc.nextInt();
            IntArr[i][1] = sc.nextInt();
            IntArr[i][2] = sc.nextInt();
            Arrays.sort(IntArr[i]);
            System.out.println(IntArr[i][1]);
        }
        secondMaxInt(N, IntArr);
    }

    public static void secondMaxInt(int N, int[][] IntArr) {
            for (int i = 0; i < N; i++) {
                Arrays.sort(IntArr[i]);
                System.out.println(IntArr[i][1]);
            }
        }


}


//    public static void main(String[] args)  {
//        String S = "asdbjb123131";
//
//        System.out.println(sumDigitsInString(S));
//    }
//
//    public static int sumDigitsInString(String S) {
//
//        String temp = "0";
//        int sum = 0;
//
//        for (int i = 0; i < S.length(); i++) {
//            char ch = S.charAt(i);
//
//            if (Character.isDigit(ch)) {
//                temp += Integer.parseInt(String.valueOf(ch));
//                System.out.println(temp);
//            }
//            else {
//                sum += Integer.parseInt(temp);
//            }
//        }
//        return sum + Integer.parseInt(temp);
//    }
//}

