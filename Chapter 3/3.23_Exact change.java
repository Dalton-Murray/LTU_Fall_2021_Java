/*
Write a program with total change amount in pennies as an integer input, and output the change using the fewest coins, one coin type per line. The coin types are Dollars, Quarters, Dimes, Nickels, and Pennies. Use singular and plural coin names as appropriate, like 1 Penny vs. 2 Pennies.

Ex: If the input is:

0
the output is:

No change
Ex: If the input is:

45
the output is:

1 Quarter
2 Dimes

Dalton Murray
*/

import java.util.Scanner; 

public class LabProgram {
   public static void main(String[] args) {
      int startingAmount;
      int totalAmount;
      int dollars;
      int quarters;
      int dimes;
      int nickels;
      int pennies;
      
      Scanner scnr = new Scanner(System.in);
      totalAmount = scnr.nextInt();
      startingAmount = totalAmount;
      
      if (totalAmount <= 0) {
         System.out.println("No change");
      }
      
      /* Didn't know had to do dollars, so I thought of an easier way which is more simplistic
      quarters = totalAmount / 25;
      dimes = (totalAmount % 25) / 10;
      nickels = ((totalAmount % 25) % 10) / 5;
      pennies = ((totalAmount % 25) % 10) % 5;
      */
      
      dollars = totalAmount / 100;
      totalAmount %= 100;
      quarters = totalAmount / 25;
      totalAmount %= 25;
      dimes = totalAmount / 10;
      totalAmount %= 10;
      nickels = totalAmount / 5;
      totalAmount %= 5;
      pennies = totalAmount;
      
      if (startingAmount >=1) {
         if (dollars >= 1) {
            if (dollars == 1) {
               System.out.println(dollars + " Dollar");
            }
            else {
               System.out.println(dollars + " Dollars");
            }
         }
         if (quarters >= 1) {
            if (quarters == 1) {
               System.out.println(quarters + " Quarter");
            }
            else {
               System.out.println(quarters + " Quarters");
            }
         }
            
         if (dimes >= 1) {
            if (dimes == 1) {
               System.out.println(dimes + " Dime");
            }
            else {
               System.out.println(dimes + " Dimes");
            }
         }
            
         if (nickels >= 1) {
            if (nickels == 1) {
               System.out.println(nickels + " Nickel");
            }
            else {
               System.out.println(nickels + " Nickels");
            }
         }
         
         if (pennies >= 1) {
            if (pennies == 1) {
               System.out.println(pennies + " Penny");
            }
            else {
               System.out.println(pennies + " Pennies");
            }
         }
            
      }
      
   }
}
