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
