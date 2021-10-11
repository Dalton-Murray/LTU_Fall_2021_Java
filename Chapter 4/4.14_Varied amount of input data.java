/*
Statistics are often calculated with varying amounts of input data. Write a program that takes any number of non-negative integers as input, and outputs the max and average. A negative integer ends the input and is not included in the statistics.

Ex: When the input is:

15 20 0 5 -1
the output is:

20 10
You can assume that at least one non-negative integer is input.

Dalton Murray
*/

import java.util.Scanner; 

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int max = 0;
      int total = 0;
      int count = 0;
      int num;
      int average;
      
      num = scnr.nextInt();
      
      while (num >= 0) {
         if (num > max) {
            max = num;
         }
         ++count;
         total = total + num;
         num = scnr.nextInt();
      }
      
      average = total / count;
      System.out.println(max + " " + average);
      
   }
}
