/*
Write a program using integers userNum and divNum as input, and output userNum divided by divNum three times. Note: End with a newline.

Ex: If the input is:

2000 2
the output is:

1000 500 250
Note: In Java, integer division discards fractions. Ex: 6 / 4 is 1 (the 0.5 is discarded).

Dalton Murray
*/

import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      int userNum;
      int divNum;
      
      int userNum1;
      int userNum2;
      int userNum3;
      
      userNum = scnr.nextInt();
      divNum = scnr.nextInt();
      
      userNum1 = userNum / divNum;
      userNum2 = userNum1 / divNum;
      userNum3 = userNum2 / divNum;
      
      System.out.println("" + userNum1 + " " + userNum2 + " " + userNum3);
      
      
   }
}
