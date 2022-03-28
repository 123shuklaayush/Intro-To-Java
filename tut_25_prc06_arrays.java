package com.company;

public class tut_25_prc06_arrays {
    public static void main(String[] args) {
//        prc 01
        /*
        float[] marks = { 42.24f , 80.14f, 74.98f, 34.78f, 66.34f};
//        float sum = flo[0] + flo[1]+ flo[2]+ flo[3]+ flo[4];
        //Another  method
        float sum = 0;
        for (float elements:marks) {
            sum = sum + elements;
        }
            System.out.println(sum);

         */
        int[] marks = {42, 80, 74, 34, 66};
        int n = 42;
        for (float elements : marks) {
//            sum = sum + elements;
            if (elements == n) {
                System.out.println("The Value is Present in the Arrays"); }
            else {
                System.out.println("No Value has been assigned in the Arrays");
            }
        }
    }
}
