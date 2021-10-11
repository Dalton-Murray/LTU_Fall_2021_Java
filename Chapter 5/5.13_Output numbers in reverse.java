/*
Write a program that reads a list of integers and outputs those integers in reverse. The input begins with an integer indicating the number of integers that follow. For coding simplicity, follow each output integer by a comma, including the last one. Assume that the list will always contain fewer than 20 integers.

Ex: If the input is:

5 2 4 6 8 10
the output is:

10,8,6,4,2,
To achieve the above, first read the integers into an array. Then output the array in reverse.

Dalton Murray
*/

import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int[] userList = new int[20];
      int numElements;
      int i;

      numElements = scnr.nextInt();
      
      int arrayNumbers[] = new int[numElements];
      
      for (i = 0; i < numElements; ++i) {
         arrayNumbers[i] = scnr.nextInt();
      }
      for (i = (numElements - 1); i >= 0; --i) {
         System.out.print(arrayNumbers[i] + ",");
      }
      
      System.out.println();
   }
}
