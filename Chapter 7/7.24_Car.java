/*
Given main(), complete the Car class (in file Car.java) with methods to set and get the purchase price of a car (setPurchasePrice(), getPurchasePrice()), and to output the car's information (printInfo()).

Ex: If the input is:

2011
18000
2018
where 2011 is the car's model year, 18000 is the purchase price, and 2018 is the current year, the output is:

Car's information:
   Model year: 2011
   Purchase price: 18000
   Current value: 5770
Note: printInfo() should use three spaces for indentation.

Dalton Murray
*/

import java.util.Scanner;


public class Car {

    private int modelYear;
    private int currentValue;
    private int purchasePrice;

    public int getModelYear() {
        return modelYear;
    }

    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }

    public int getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(int purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public void calcCurrentValue(int currentYear) {
        double depreciationRate = 0.15;
        int carAge = currentYear - modelYear;
        currentValue = (int)Math.round(purchasePrice * Math.pow(1 - depreciationRate, carAge));
    }

    public void printInfo(){
        System.out.println("Car\'s information:");
        System.out.println("   Model year: " + getModelYear());
        System.out.println("   Purchase price: " + getPurchasePrice());
        System.out.println("   Current value: " + currentValue);
    }
    public static void main(String[] args) {
        Car myCar = new Car();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter model year: ");
        myCar.setModelYear(scanner.nextInt());

        System.out.print("Enter purchase price: ");
        myCar.setPurchasePrice(scanner.nextInt());

        System.out.print("Enter current year: ");
        myCar.calcCurrentValue(scanner.nextInt());

        myCar.printInfo();
    }

}