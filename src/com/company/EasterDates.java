// Flint Eller
// 11/6/19
// This program find the date for Easter from 1900 to 2099

package com.company;
import java.util.Scanner;

public class EasterDates {

    public static String find_date(int year){
        // formula that calculates the date based on the year given
        int a = year % 19;
        int b = year % 4;
        int c = year % 7;
        int d = (19 * a + 24) % 30;
        int e = (2 * b + 4 * c + 6 * d + 5) % 7;
        // 22 represents March 22
        int date = 22 + d + e;
        // date > 31 means it is in April, otherwise in March
        // 1954, 1981, 2049, 2076 are one week ahead so it is corrected with this if statement
        if (date > 31)
            if (year == 1954 || year == 1981 || year == 2049 || year == 2076)
                return "In " + year + ", Easter (is/was) on April " + (Math.abs(31 - date) - 7);
            else
                return "In " + year + ", Easter (is/was) on April " + (Math.abs(31 - date));
        else
            if (year == 1954 || year == 1981 || year == 2049 || year == 2076)
                return "In " + year + ", Easter (is/was) on March " + (Math.abs(31 - date) - 7);
            else
                return "In " + year + ", Easter (is/was) on March " + date;
        }

        public static void main(String[] args){
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter a year between 1900 and 2099: ");
            int year = scan.nextInt();
            // Check if input is valid
            if (year >= 1900 && year <= 2099)
                System.out.println(find_date(year));
            else
                System.out.println("Entry invalid");

        }
    }

