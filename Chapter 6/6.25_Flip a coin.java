import java.util.Scanner;
import java.util.Random;

public class LabProgram {
   
   public static String headsOrTails(Random rand) {
   String headOrTail = "";
   int randomValue;
   
   randomValue = rand.nextInt(2);
   
   if (randomValue == 0) {
      headOrTail = "heads";
   }
   if (randomValue == 1) {
      headOrTail = "tails";
   }
   
   return headOrTail;
   
   }
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      Random rand = new Random(2);

      int userInput;
      int i;
      
      userInput = scnr.nextInt();
      
      for (i = 0; i < userInput; i++) {
         System.out.println(headsOrTails(rand));
      }

   }
}
