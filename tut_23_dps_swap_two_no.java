package com.company;

public class tut_23_dps_swap_two_no {
    public static void main(String[] args) {
//        int a =10, b = 20;
//        int t;
//        t = a;
//        a = b;
//        b = t;
//        System.out.println(a);
//        System.out.println(b);
        //This is one method but in interview they ask that swap numbers without creating a new variable( Here t is created)
        // Now without variable
        int a = 10, b = 20;
        a = b + a;
        b = a - b;
        a = a - b;
        System.out.println(a);
        System.out.println(b);


    }
}
