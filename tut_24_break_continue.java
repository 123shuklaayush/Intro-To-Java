package com.company;

public class tut_24_break_continue {
    public static void main(String[] args) {
//        This is do while loop
//        int i =1 ;
//        do {
//            System.out.println(i);
//            if(i == 6){
//                System.out.println("It's 6 BREAK IT NOW!!!!");
//                break;
//            }
//            i++;
//        }while (i <20);
        //Next case for continue
        for (int i = 0 ; i <=40; i++) {
            if (i == 2){
            System.out.println("Ending the loop");
            continue;}
            System.out.println("Java Programming " + i);  //At i = 2 programming is continued without executing this statement

        }

    }
}
