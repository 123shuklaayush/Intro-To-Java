package com.company;

import java.util.Arrays;

public class tut_26_chap_06_arrays {
    public static void main(String[] args) {
        /*You have to store 500 students marks
        you have two options
               1) use arrays
               2) use arrays ;)   */
        //Basically there are three ways to print arrays in java
        //1) Declaration and memory allocation

//        int mark[]= new int[5]; //1st method
        // 2)Declaration and then memory allocation
        int marks[];  // ----> Declaration
        marks = new int[5];   //----> Memory Allocation
        //initialization
        marks [0] = 42;
        marks [1] = 22;
        marks [2] = 67;
        marks [3] = 71;
        marks [4] = 18;
//        System.out.println(marks[2]);

        // 3) Declaration, memory allocation and initialization together
        int[] mark = {1, 42, 21 , 12, 53, 89, 92};
        System.out.println(mark[3]);


    }
}
