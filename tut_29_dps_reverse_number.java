package com.company;

public class tut_29_dps_reverse_number {
    public static void main(String[] args) {
        int rem, rev = 0, no = 5432;
        while (no != 0) {
            rem = no%10;
            rev = rev * 10 + rem;
            no = no/10;
        }
        System.out.println(rev);
    }
}
