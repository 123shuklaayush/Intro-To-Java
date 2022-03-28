package com.company;

public class tut_25_prc05_stars {
    public static void main(String[] args) {
//From increasing to decreasing star
        //With For loop
//        int n = 4;
//        for (int i = n ; i>0 ; i--) {
//            for(int j =0; j<i ; j++) {
//                System.out.print("*");
//            }
//            System.out.print("\n");
//        }
        //With while loop
//        int n = 4;
//        int i = 1;
//        while (n>=i) {
//            n--;
//            int j = 4;
//            while (j >= 1) {
//                j--;
//            }
//            System.out.print("\n");
   //From 1 to 4 increasing order star
        int i = 1;
        while (i<=4) {
            int j = 1;
            while (j<=i) {
                System.out.print("*");
                j++;
            }
            i++;
            System.out.println();
        }
      // 4 to 1 start using while loop
//        int i = 1;
//        while (i<=4) {
//            int j = 4;
//            while (j>=i) {
//                System.out.print("*");
//                j--;
//            }
//            i++;
//            System.out.println();
//        }

    }
}
