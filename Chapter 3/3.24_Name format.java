/*
Many documents use a specific format for a person's name. Write a program whose input is:

firstName middleName lastName

and whose output is:

lastName, firstInitial.middleInitial.

Ex: If the input is:

Pat Silly Doe
the output is:

Doe, P.S.
If the input has the form:

firstName lastName

the output is:

lastName, firstInitial.

Ex: If the input is:

Julia Clark
the output is:

Clark, J.

Dalton Murray
*/

import java.util.Scanner; 

public class LabProgram {
   public static void main(String[] args) {
      String firstName;
      String middleName;
      String lastName;
      
      String fullName;
      
      /*
      // Removed because it can just be used when calling for the index itself.
      int firstSpace;
      int secondSpace;
      */
      
      Scanner scnr = new Scanner(System.in);
      fullName = scnr.nextLine();
      
      int firstSpace = fullName.indexOf(" ");
      firstName = fullName.substring(0, firstSpace);
      
      int secondSpace = fullName.indexOf(" ", firstSpace + 1);
      
      if (secondSpace < 0) { // This results in only first name and last name available
         lastName = fullName.substring(firstSpace + 1);
      
         String firstInitial = firstName.substring(0,1); // Sets it so we only get the first character of the firstName.
         System.out.println(lastName + ", " + firstInitial + ".");
      }
      else { // We know there has to be something else there/a middle name
         middleName = fullName.substring(firstSpace, secondSpace);
         lastName = fullName.substring(secondSpace + 1);
         
         String firstInitial = firstName.substring(0,1);
         System.out.println(lastName + ", " + firstInitial + "." + middleName.charAt(1) + ".");
      }

   }
}
