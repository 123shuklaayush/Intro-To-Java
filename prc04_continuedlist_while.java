package com.company;
import java.util.Scanner;
public class prc04_continuedlist_while{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = 0;
        while(scan.hasNext()) {
            i++;
            System.out.println(i + " " + scan.nextLine());
        }
    }
}