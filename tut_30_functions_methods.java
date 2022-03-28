package com.company;
public class tut_30_functions_methods {
    static int result(int x, int y){
        int z;
        if (x<y) {
            z = x + y;
        }
        else {
            z = x-y;
        }
        return z;
    }
    public static void main(String[] args) {
        int a = 2;
        int b = 4;
        int c;
        c = result(a, b);
        int a2 = 4;
        int b2 = 2;
        int c2;
        c2 = result(a2, b2);
        System.out.println(c);
        System.out.println(c2);
    }
}
