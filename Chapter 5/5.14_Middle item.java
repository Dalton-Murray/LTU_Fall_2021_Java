/*
Given a sorted list of integers, output the middle integer. A negative number indicates the end of the input (the negative number is not a part of the sorted list). Assume the number of integers is always odd.

Ex: If the input is:

2 3 4 8 11 -1 
the output is:

Middle item: 4
The maximum number of inputs for any test case should not exceed 9. If exceeded, output "Too many numbers".

Hint: First read the data into an array. Then, based on the array's size, find the middle item.

Dalton Murray
*/

import java.util.Scanner; 

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int i;
      int userInput;
      int middleItem;
      int arraySize = 1;
      int arrayA[] = new int [10];
      
      userInput = scnr.nextInt();
      arrayA[0] = userInput;
      
      for (i = 1; i < 10; ++i) {
         userInput = scnr.nextInt();
         
         if (userInput > 0) {
            arrayA[i] = userInput;
            ++arraySize;
         }
         else {
            break;
         }
         
      }
      
      middleItem = arrayA[((arraySize / 2))];
      if (arrayA[9] > 0) {
         System.out.println("Too many numbers");
      }
      else {
         System.out.println("Middle item: " + middleItem);
      }
      
   }
}
