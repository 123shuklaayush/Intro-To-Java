package com.company;
import java.util.Scanner;
public class tut_18_else_if {
    public static void main(String[] args) {
        System.out.println("Enter Your Age");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age>60) {
            System.out.println("You're not eligible");
        }
        else if(age<=60 && age>50) {
            System.out.println("You have mastered in experience!!");
        }
        else if(age<=50 && age>40) {
            System.out.println("You have experience");
        }
        else if(age<=40 && age>30) {
            System.out.println("You are partially experienced");
        }
        else {
            System.out.println("You need more experience");


        }
    }
}
