import java.util.Scanner;

public class TriangleArea {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      Triangle triangle1 = new Triangle();
      Triangle triangle2 = new Triangle();

      // Take in all of the base and heights to later use
      double base = scnr.nextDouble();
      double height = scnr.nextDouble();
      double base2 = scnr.nextDouble();
      double height2 = scnr.nextDouble();
      
      // Calculate proper areas
      double area = (0.5 * base * height);
      double area2 = (0.5 * base2 * height2);
      
      // Print out the required title/first line
      System.out.println("Triangle with larger area:");
      
      // Need to see which one has greater area
      if (area > area2) {
         // Prints out information with formatting
         System.out.printf("Base: %.2f\n", base);
         System.out.printf("Height: %.2f\n", height);
         System.out.printf("Area: %.2f\n", area);
      }
      // We know second triangle is greater than first
      else {
         // Prints out information with formatting
         System.out.printf("Base: %.2f\n", base2);
         System.out.printf("Height: %.2f\n", height2);
         System.out.printf("Area: %.2f\n", area2);
      }
      
   }
}
