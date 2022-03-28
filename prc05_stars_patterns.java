package com.company;
import java.util.Scanner;
public class prc05_stars_patterns {

    public static void main(String[] args) {
        for(int i = 1; i<=4 ; i++){
            for (int j = 1 ; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int a = 2; a<=4; a++){
            for (int k = 4; k>=a ; k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}