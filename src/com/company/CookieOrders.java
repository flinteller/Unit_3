package com.company;
import java.util.Scanner;

public class CookieOrders {

    public static String totalCost(int num_boxes){
        if (num_boxes >= 1 && num_boxes <= 4)
            return "You bought " + num_boxes + " boxes of cookies at $6.95 per box for a total of $" + (num_boxes * 6.95);
        if (num_boxes >= 5 && num_boxes <= 9)
            return "You bought " + num_boxes + " boxes of cookies at $5.95 per box for a total of $" + (num_boxes * 5.95);
        if (num_boxes >= 10 && num_boxes <= 15)
            return "You bought " + num_boxes + " boxes of cookies at $5.50 per box for a total of $" + (num_boxes * 5.50);
        if (num_boxes >= 16)
            return "You bought " + num_boxes + " boxes of cookies at $4.95 per box for a total of $" + (num_boxes * 4.95);
        else
            return "Your input is invalid";
    }


    public static void main(String[] args){
        System.out.println("1-4 boxes ............ $6.95 per box");
        System.out.println("5-9 boxes ............ $5.95 per box");
        System.out.println("10-15 boxes .......... $5.50 per box");
        System.out.println("16 or more boxes ..... $4.95 per box");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of boxes you want ot buy: ");
        int boxes = scan.nextInt();
        System.out.println(totalCost(boxes));
    }
}
