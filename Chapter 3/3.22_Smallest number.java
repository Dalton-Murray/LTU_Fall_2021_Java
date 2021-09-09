import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      int firstInt;
      int secondInt;
      int thirdInt;
      
      Scanner scnr = new Scanner(System.in);
      firstInt = scnr.nextInt();
      secondInt = scnr.nextInt();
      thirdInt = scnr.nextInt();

      if ((firstInt < secondInt) && (firstInt < thirdInt)) {
         System.out.println(firstInt);
      }
      else if (secondInt < thirdInt) {
         System.out.println(secondInt);
      }
      else {
         System.out.println(thirdInt);
      }
      
   }
}
