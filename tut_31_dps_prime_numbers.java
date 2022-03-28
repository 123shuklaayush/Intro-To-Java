package com.company;
import java.util.Scanner;
public class tut_31_dps_prime_numbers {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        To Print all the prime numbers just go and see deepak sir 32th lecture
        int no = 117;
        int temp = 0;
        for (int i = 2; i < 5; i++) {
            if (no % i == 0) {
                temp = temp + 1;
            }
        }
        if (temp>0) {
            System.out.println("The Number Is Not Prime");
        }
        else {
            System.out.println("The Number Is Prime");
        }
    }
}
