package com.company;
import java.util.Scanner;

public class ShareDigit {
    public static void main(String[] args){
        Scanner scan  = new Scanner(System.in);
        System.out.println("Enter the first, two digit number: ");
        int num1 = scan.nextInt();
        System.out.println("Enter the second, two digit number: ");
        int num2 = scan.nextInt();

        boolean answer;

        int num1_first = num1 / 10;
        int num1_second = num1 % 10;

        int num2_first = num2 / 10;
        int num2_second = num2 % 10;

        if (num1_first == num2_first)
            answer = true;
        else if (num1_first == num2_second)
            answer = true;
        else if (num1_second == num2_first)
            answer = true;
        else if (num1_second == num2_second)
            answer = true;
        else
            answer = false;

        System.out.println(num1 + " and " + num2 + " share a digit: " + answer);
    }
}
