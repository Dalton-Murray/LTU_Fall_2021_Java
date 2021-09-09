import java.util.Scanner; 

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int max = 0;
      int total = 0;
      int count = 0;
      int num;
      int average;
      
      num = scnr.nextInt();
      
      while (num >= 0) {
         if (num > max) {
            max = num;
         }
         ++count;
         total = total + num;
         num = scnr.nextInt();
      }
      
      average = total / count;
      System.out.println(max + " " + average);
      
   }
}
