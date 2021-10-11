/*
Write a program that creates a login name for a user, given the user's first name, last name, and a four-digit integer as input. Output the login name, which is made up of the first five letters of the last name, followed by the first letter of the first name, and then the last two digits of the number (use the % operator). If the last name has less than five letters, then use all letters of the last name.

Ex: If the input is:

Michael Jordan 1991
the output is:

Your login name: JordaM91
Ex: If the input is:

Kanye West 2024
the output is:

Your login name: WestK24

Dalton Murray
*/

import java.util.Scanner;

public class LabProgram {

	public static void main(String[] args) {
	String firstName;
	String lastName;
	int fourDigits;
	
	String loginName;

   Scanner scnr = new Scanner(System.in);
   firstName = scnr.next();
   lastName = scnr.next();
   fourDigits = scnr.nextInt();
   
   loginName = lastName;
   
   if (lastName.length() > 5) {
      loginName = lastName.substring(0, 5); // Cuts it down if the last name is over 5 characters
   }
   
   loginName = loginName + firstName.charAt(0); // Sets to first character of firstName
   loginName = loginName + (fourDigits % 100);
   
   System.out.println("Your login name: " + loginName);

	}
}