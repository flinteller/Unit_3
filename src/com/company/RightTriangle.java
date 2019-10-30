package com.company;
import java.util.Scanner;

public class RightTriangle {

    public static boolean isTriangle(int a, int b, int c){
        return a + b > c && b + c > a && a + c > b;
    }

    public static boolean isRight(int a, int b, int c){
        return Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2);
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 3 integer sides of a triangle");
        System.out.println("Enter side A: ");
        int a = scan.nextInt();
        System.out.println("Enter side B: ");
        int b = scan.nextInt();
        System.out.println("Enter side C: ");
        int c = scan.nextInt();

        if(isTriangle(a, b, c) && isRight(a, b, c))
            System.out.println("The side lengths " + a + ", " + b + ", and " + c + " form a right triangle");
        else if(isTriangle(a, b, c) && !isRight(a, b, c))
            System.out.println("The side lengths " + a + ", " + b + ", and " + c + " form a triangle, but it is not a right triangle");
        else
            System.out.println("The side lengths " + a + ", " + b + ", and " + c + " do not form a triangle");

    }
}
