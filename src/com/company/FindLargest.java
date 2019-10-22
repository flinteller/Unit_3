package com.company;
import java.util.Scanner;

public class FindLargest {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = scan.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = scan.nextInt();

        if(num1 > num2)
            System.out.println(num1 + " is greater than " + num2);

        if(num2 > num1)
            System.out.println(num2 + " is greater than " + num1);

        if(num1 == num2)
            System.out.println(num1 + " is equal to " + num2);

    }
}
