package com.company;
import java.util.Scanner;
public class tut_25_dps_calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hey, I'm a calculator and I am used to calculate two integer numbers");
        System.out.println("Enter the First Number: ");
        int a = sc.nextInt();

        System.out.println("Enter the Second Number: ");
        int b = sc.nextInt();
        System.out.println("Which action do you want to perform(+, -, *, /)");
        String symbols = sc.next();
        int res;
        switch(symbols) {
            case"+": res = a+b;
                System.out.println("The Sum Of given Number is: " + res);
                break;
            case"-": res = a-b;
                System.out.println("The difference between the given Number is: " + res);
                break;
            case"/": res = a/b;
                System.out.println("The division of given number is: " + res);
                break;
            case"*": res = a*b;
                System.out.println("The multiplication of given number is: " + res);
                break;
            default:
                System.out.println("The given operator doesn't perform any action!!!");

        }

    }
}
