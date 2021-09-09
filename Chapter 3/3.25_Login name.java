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