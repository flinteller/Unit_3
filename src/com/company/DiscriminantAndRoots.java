package com.company;
import java.util.Scanner;

public class DiscriminantAndRoots {
    private static String roots(int a , int b, int c){
        String polynomial = a + "X^2 + " + b + "X + " + c;
       if (Math.pow(b, 2) - 4 * a * c < 0)
           return polynomial + " has 2 imaginary roots";
       else if (Math.pow(b, 2) - 4 * a * c > 0)
           return polynomial + " has 2 real roots";
       else
           return polynomial + " has 1 real (double) root";
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter A: ");
        int a = scan.nextInt();
        System.out.println("Enter B: ");
        int b = scan.nextInt();
        System.out.println("Enter C: ");
        int c = scan.nextInt();
        System.out.println(roots(a, b, c));






    }
}
