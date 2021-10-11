/*
Write a program whose input is a character and a string, and whose output indicates the number of times the character appears in the string. The output should include the input character and use the plural form, n's, if the number of times the characters appears is not exactly 1.

Ex: If the input is:

n Monday
the output is:

1 n
Ex: If the input is:

z Today is Monday
the output is:

0 z's
Ex: If the input is:

n It's a sunny day
the output is:

2 n's
Case matters.

Ex: If the input is:

n Nobody
the output is:

0 n's
n is different than N.

Dalton Murray
*/

import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      int result = 0;
      char userChar;
      String userInput;
      
      userChar = scnr.next().charAt(0);
      userInput = scnr.nextLine();
      
      for (int i = 0; i < userInput.length(); i++) {
         if (userInput.charAt(i) == userChar) {
            result += 1;
         }
      }
      
      if (result == 1) {
         System.out.println(result + " " + userChar);
      }
      else {
         System.out.println(result + " " + userChar + "'s");
      }
   }
}
