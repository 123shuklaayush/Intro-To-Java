package com.company;
import java.util.Scanner;
public class tut_18_swithcase {
    public static void main(String[] args) {
        int age;
        System.out.println("Enter Your Age");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        switch (age) {
            case 12 -> System.out.println("You're a fresher");
            case 21 -> System.out.println("You have become adult");
            case 40 -> System.out.println("You're experienced");
            case 60 -> System.out.println("You're retired");
            default -> System.out.println("You're enjoying your life!");
        }
    }
}
