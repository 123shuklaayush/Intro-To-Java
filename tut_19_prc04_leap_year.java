package com.company;
import java.util.Scanner;
public class tut_19_prc04_leap_year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year to check whether it's a leap year or not");
        int year = sc.nextInt();
        if (year == 1900) {
            System.out.println("It's an exception and it's not a leap year");
        }
        else if(year%4 == 0) {
            System.out.println("It's a leap year");
        }
        else {
            System.out.println("No it's not a leap year");
        }
    }
}
