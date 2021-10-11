/*
2.28 LAB: Convert to dollars
Given four values representing counts of quarters, dimes, nickels and pennies, output the total amount as dollars and cents.

Output each floating-point value with two digits after the decimal point, which can be achieved as follows:
System.out.printf("Amount: $%.2f\n", dollars);

Ex: If the input is:

4 3 2 1
where 4 is the number of quarters, 3 is the number of dimes, 2 is the number of nickels, and 1 is the number of pennies, the output is:

Amount: $1.41
For simplicity, assume input is non-negative.

Dalton Murray
*/

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