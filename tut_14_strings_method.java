package com.company;

import java.util.Locale;

public class tut_14_strings_method {
    public static void main(String[] args) {
//        String a1 = new String("harry ");
//        String a2 = new String("I'am");
//        System.out.println(a + a1 + a2);
        String a = "harry";
        int value = a.length();
//        String  lstring = a.toLowerCase();
//        String  Ustring = a.toUpperCase();
//        System.out.println(lstring);
//        System.out.println(Ustring);

//        String nonTrimmedString = "   harry  ";
//        System.out.println(nonTrimmedString.trim());  //This removes the extra spaces
        System.out.println(a.substring(2));
        System.out.println(a.substring(3, 5));
        
        System.out.println(a.replace('r', 'p'));
        System.out.println(a.startsWith("Ha"));
        System.out.println(a.endsWith("rry"));
        System.out.println(a.charAt(1));
        System.out.println(a.indexOf("ry"));
        System.out.println(a.lastIndexOf("y"));
        System.out.println(a.equals("harry"));
        System.out.println(a.equalsIgnoreCase("hARrY"));  //Very helpful
        System.out.println("If we have to use \" double quote, use like this");
    }
}
