package com.company;
import java.util.Scanner;

public class tut_07_pr_sum{
    public static void main(String[] args) {
        System.out.println("Enter Three Numbers");
        Scanner task = new Scanner(System.in);


        System.out.println("Enter first Digit");
        int a = task.nextInt();


        System.out.println("Enter second Digit");
        int b = task.nextInt();

        System.out.println("Enter third number");
        int c = task.nextInt();

        int sum = a + b + c;

        System.out.println(sum);

    }
}
