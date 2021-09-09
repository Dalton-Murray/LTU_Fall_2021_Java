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
