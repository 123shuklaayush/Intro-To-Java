package com.company;

public class tut_22_do_whileLoop {
    public static void main(String[] args) {
        int i = 10;
        do {
            System.out.println(i);
            i++;
        }while(i<5);
        // This is a false statement but, it will execute since here it will first execute the code and then check the condition
        int a = 1;
        do {
            System.out.println(a);
            a++;
        }while(a<200);
        System.out.println("Program has ended sucessfully");

    }
}
