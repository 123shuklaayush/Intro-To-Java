package com.company;

public class tut_27_arrays_properties {
    public static void main(String[] args) {
        int[] marks = {23, 42, 84, 25, 64, 35};
//        float[] markk = {23.42f, 42.21f, 52.1f};
//        System.out.println(marks.length);
        // Noobs method for printing arrays
//        System.out.println(marks[0]);
//        System.out.println(marks[1]);
//        System.out.println(marks[2]);....
         //Legends print like this
//        This method is called array traversal
        System.out.println("To print all the elements in the arrays");
        for( int i = 0 ; i<marks.length ; i++) {
            System.out.println(marks[i]);
        }
        System.out.println("To print in reverse order");
            for( int i = marks.length -1 ; i>=0 ; i--) {  //carefully see this
                // lengh - 1 means that always subtract -1 from -1 length
                System.out.println(marks[i]);
        }
        System.out.println("Printing using the Concept of For-each loop");
            // Basically this loop is made to print all the elements of java
        for (int elements:  marks) {
            System.out.println(elements);
        }
    }
}
