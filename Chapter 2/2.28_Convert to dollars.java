import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int quarter;
      int dime;
      int nickel;
      int penny;
      
      int quarterTotal;
      int dimeTotal;
      int nickelTotal;
      int pennyTotal;
      
      float dollarTotal;
      
      quarter = scnr.nextInt();
      dime = scnr.nextInt();
      nickel = scnr.nextInt();
      penny = scnr.nextInt();
      
      quarterTotal = quarter * 25;
      dimeTotal = dime * 10;
      nickelTotal = nickel * 5;
      pennyTotal = penny * 1;
      dollarTotal = (quarterTotal + dimeTotal + nickelTotal + pennyTotal);
      dollarTotal /= 100;

      System.out.printf("Amount: $%.2f\n", dollarTotal);
      
      
      
   }
}