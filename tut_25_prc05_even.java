package com.company;
public class tut_25_prc05_even {
    public static void main(String[] args) {
        int sum = 0;
        int n = 3;
        for(int j = 0 ; j<n ; j++ ) {
            System.out.println(2*j);
            sum = sum + (2*j);
        }
        System.out.println("The sum will be " +(sum));
    }
}