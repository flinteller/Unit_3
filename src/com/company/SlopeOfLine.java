package com.company;
import java.util.Scanner;

public class SlopeOfLine {

    public static String slope(int x1, int y1, int x2, int y2) {
        String slope = "Does not compute";
        if (x1 == x2)
            return slope = "The line defined by the points (" + x1 + "," + y1 + ") and (" + x2 + "," + y2 + ") and the slope is undefined.";
        else
            return  slope = "The line defined by the points (" + x1 + "," + y1 + ") and (" + x2 + "," + y2 + ") and the slope is " + ((double)y2 - (double)y1) / ((double)x2 - (double)x1);

    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter x value of first point: ");
        int x_cord_1 = scan.nextInt();
        System.out.println("Enter y value of first point: ");
        int y_cord_1 = scan.nextInt();
        System.out.println("Enter x value of second point: ");
        int x_cord_2 = scan.nextInt();
        System.out.println("Enter y value of second point: ");
        int y_cord_2 = scan.nextInt();
        System.out.println(slope(x_cord_1, y_cord_1, x_cord_2, y_cord_2));
    }
}
