import java.util.Scanner; 

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      int i = 0;
      int arraySize;
      int limit;

      arraySize = scnr.nextInt();
      
      int arrayTemp[] = new int [arraySize];
      
      for (i = 0; i < arraySize; i++) {
         arrayTemp[i] = scnr.nextInt();
      }
      limit = scnr.nextInt();
      
      for (i = 0; i < arraySize; i++) {
         if (arrayTemp[i] < limit) {
            System.out.print(arrayTemp[i] + ",");
         }
      }
      
      System.out.println();

   }
}
