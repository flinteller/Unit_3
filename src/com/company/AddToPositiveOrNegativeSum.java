package com.company;
import java.util.Scanner;

public class AddToPositiveOrNegativeSum {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int pos_num = 0;
        int neg_num = 0;
        for (int i = 1; i <= 10; i++)        {
            System.out.println("Enter a number: ");
            int num = scan.nextInt();
            if(num > 0)
                pos_num += num;
            if(num < 0)
                neg_num += num;
        }
        System.out.println("Sum of positive numbers: " + pos_num);
        System.out.println("Sum of negative numbers: " + neg_num);
    }

}
