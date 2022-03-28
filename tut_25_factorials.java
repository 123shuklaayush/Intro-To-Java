package com.company;
import java.util.Scanner;
public class tut_25_factorials {
    public static void main(String[] args) {
        //By while loop
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int i = 1;
        int factorial = 1;
        while (i<=n) {
            factorial *= i;
            i++;
        }
        System.out.println(factorial);

        //By for loop
//        Scanner sc= new Scanner(System.in);
//        int n = sc.nextInt();
//        int factorial = 1;
//        for (int i = 1 ; i<=n ; i++) {
//            factorial *= i;
//        }
//        System.out.println(factorial);

    }
}
