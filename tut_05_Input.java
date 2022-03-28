package com.company;
import java.util.Scanner;

public class tut_05_Input {
    public static void main(String[] args) {
//        System.out.println("It works!");
        Scanner cs = new Scanner(System.in);
//        System.out.println("Enter first number");
//        int a = cs.nextInt();
//        System.out.println("Enter second number");
//        int b = cs.nextInt();
//        int sum = a + b;
//        System.out.println("The Sum of the numbers are:");
//        System.out.println(sum);
        System.out.println("Enter the Value");
        boolean b1 = cs.hasNextFloat();
        System.out.println(b1);
    }
}
