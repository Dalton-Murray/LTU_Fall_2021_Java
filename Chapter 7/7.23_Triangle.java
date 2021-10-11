/*
Given class Triangle (in file Triangle.java), complete main() to read and set the base and height of triangle1 and of triangle2, determine which triangle's area is larger, and output that triangle's info, making use of Triangle's relevant methods.

Ex: If the input is:

3.0 4.0
4.0 5.0
where 3.0 is triangle1's base, 4.0 is triangle1's height, 4.0 is triangle2's base, and 5.0 is triangle2's height, the output is:

Triangle with larger area:
Base: 4.00
Height: 5.00
Area: 10.00

Dalton Murray
*/

public class Triangle {
   private double base;
   private double height;
   
   public void setBase(double userBase){
      base = userBase;
   }
   public void setHeight(double userHeight) {
      height = userHeight;
   }
   
   public double getArea() {
      double area = 0.5 * base * height;
      return area;
   }
   
   public void printInfo() {
      System.out.printf("Base: %.2f\n", base);
      System.out.printf("Height: %.2f\n", height);
      System.out.printf("Area: %.2f\n", getArea());
   }
}