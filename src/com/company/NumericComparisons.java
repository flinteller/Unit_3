package com.company;
import java.util.Scanner;

public class NumericComparisons {

    private static boolean isOdd(int num){
        return num % 2 != 0;
    }

    private static boolean isZero(int num){
        return num == 0;
    }

    private static boolean isPositive(int num){
        return num > 0;
    }

    private static boolean isNegative(int num){
        return num < 0;
    }

    private static boolean isNonNegative(int num){
        return num >= 0;
    }

    private static boolean isNonPositive(int num){
        return num <= 0;
    }

    private static boolean isFactor(int num, int num2){
        return num2 % num == 0;
    }

    private static boolean isMultiple(int num, int num2){
        return num % num2 == 0;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scan.nextInt();

        System.out.println(num + " is odd: " + isOdd(num));

        System.out.println(num + " is zero: " + isZero(num));

        System.out.println(num + " is positive: " + isPositive(num));

        System.out.println(num + " is negative: " + isNegative(num));

        System.out.println(num + " is not negative: " + isNonNegative(num));

        System.out.println(num + " is not positive: " + isNonPositive(num));

        System.out.println("Enter a second number: ");
        int num2 = scan.nextInt();

        System.out.println(num + " is a factor of "+ num2 + " : " + isFactor(num, num2));

        System.out.println(num + " is a multiple of "+ num2 + " : " + isMultiple(num, num2));
    }


}
