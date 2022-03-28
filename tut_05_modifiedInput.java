package com.company;
import java.util.Scanner;

public class tut_05_modifiedInput {
 public static void main(String[] args) {
  System.out.println("CBSE MarkSheet 2021 ");
  Scanner task = new Scanner(System.in);
  System.out.println("Score in English");
  byte Eng = task.nextByte();
  System.out.println("Score in Mathematics");
  byte Maths = task.nextByte();
  System.out.println("Score in Science");
  byte Sci = task.nextByte();
  System.out.println("Score in Social Studies");
  byte Soc = task.nextByte();
  System.out.println("Score in Hindi");
  byte Hin = task.nextByte();
  System.out.println("The percentage of the child is");
  float percent = (Eng + Maths + Sci + Soc + Hin) * 100 ;
  System.out.println(percent / 500);

}
}