import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      double x;
      double y;
      double z;
      double xz,xyz,ay,sqrtXY;
      
      x = scnr.nextDouble();
      y = scnr.nextDouble();
      z = scnr.nextDouble();
      
      xz = Math.pow(x,z);
      
      xyz = Math.pow(x,Math.pow(y,z));
      
      ay = Math.abs(y);
      
      sqrtXY = Math.sqrt(Math.pow(x * y,z));
      
      System.out.println(xz + " " + xyz + " " + ay + " " + sqrtXY);
      
   }
}
