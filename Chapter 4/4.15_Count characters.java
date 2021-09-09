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
