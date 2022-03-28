package com.company;
import java.util.Scanner;
public class tut_07_greetings {
    public static void main(String[] args) {
        System.out.println("Take input number");
        Scanner task = new Scanner(System.in);
        String  a = task.next();
        System.out.print("Hello ");
        System.out.print(a);
        System.out.println(",");
        System.out.println("Nice To Meet You");
    }
}
