package com.company;
import java.util.Scanner;
public class tut_19_pr04_if_conditionals {
    public static void main(String[] args) {

        System.out.println("Enter Your Score In Maths");
        Scanner ms = new Scanner(System.in);
        int maths = ms.nextInt();

        System.out.println("Enter Your Score In English");
        Scanner es = new Scanner(System.in);
        int english = es.nextInt();

        System.out.println("Enter Your Score In Science");
        Scanner ss = new Scanner(System.in);
        int science = ss.nextInt();

        int avg = (maths + english + science)/3;
        System.out.println("You've got: " +avg + "%");
        if (maths <= 33) {
            System.out.println("Maths:You're failed");
        }
        else if(maths >= 100) {
            System.out.println("Maths:You have entered an invalid number");
        }
        else {
            System.out.println("Maths:You're passed");
        }

        if (english <= 33) {
            System.out.println("English:You're failed");
        }
        else if(english >= 100) {
            System.out.println("English:You have entered an invalid number");
        }
        else {
            System.out.println("English:You're passed");
        }

        if (science <= 33) {
            System.out.println("Science:You're failed");
        }
        else if(science >= 100) {
            System.out.println("Science:You have entered an invalid number");
        }
        else {
            System.out.println("Science:You're passed");
        }
        if (avg<= 40 || maths<33 || english<33 || science<33) {
            System.out.println("Sorry You're Demoted To The Same Class as you've been failed in one or more subjects");
        }
        else {
            System.out.println("Congratulations, You've successfully promoted to the next class");
        }
    }

}
