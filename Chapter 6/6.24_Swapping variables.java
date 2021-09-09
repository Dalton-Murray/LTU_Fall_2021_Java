import java.util.Scanner;

public class LabProgram {
   
   public static void swapValues(int[] values) {
   int temp;
   
   temp = values[0];
   values[0] = values[1];
   values[1] = temp;
   
   }
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int userInput;
      int i;
      
      int[] array = new int[2];
      
      for (i = 0; i < 2; ++i) {
         userInput = scnr.nextInt();
         array[i] = userInput;
      }
      
      swapValues(array);
      
      System.out.println(array[0] + " " + array[1]);
      
   }
}
