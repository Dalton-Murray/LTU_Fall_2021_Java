/*
Write a program that takes in a line of text as input, and outputs that line of text in reverse. The program repeats, ending when the user enters "Done", "done", or "d" for the line of text.

Ex: If the input is:

Hello there
Hey
done
the output is:

ereht olleH
yeH

Dalton Murray
*/

import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String userLine;
      
      userLine = scnr.nextLine();
      
      while (! (userLine.equals("Done") || (userLine.equals("done") || (userLine.equals("d"))))) {
         for (int i = userLine.length() - 1;i >= 0; i--) {
            System.out.print(userLine.charAt(i));
         }
         
         System.out.println();
         
         userLine = scnr.nextLine();
         
      }
      
   }
}
