/*
Given main(), complete the FoodItem class (in file FoodItem.java) with constructors to initialize each food item. The default constructor should initialize the name to "None" and all other fields to 0.0. The second constructor should have four parameters (food name, grams of fat, grams of carbohydrates, and grams of protein) and should assign each private field with the appropriate parameter value.

Ex: If the input is:

M&M's
10.0
34.0
2.0
1.0
where M&M's is the food name, 10.0 is the grams of fat, 34.0 is the grams of carbohydrates, 2.0 is the grams of protein, and 1.0 is the number of servings, the output is:

Nutritional information per serving of None:
   Fat: 0.00 g
   Carbohydrates: 0.00 g
   Protein: 0.00 g
Number of calories for 1.00 serving(s): 0.00


Nutritional information per serving of M&M's:
   Fat: 10.00 g
   Carbohydrates: 34.00 g
   Protein: 2.00 g
Number of calories for 1.00 serving(s): 234.00
The first FoodItem above is initialized using the default constructor.

Dalton Murray
*/

public class FoodItem {

    private String name;
    private double fat;
    private double carbs;
    private double protein;

    FoodItem() {
        name = "None";
        fat = carbs = protein = 0;
    }

public String getName() { return name; }

    FoodItem(String name, double fat, double carbs, double protein) {
        this.name = name;
        this.carbs = carbs;
        this.fat = fat;
        this.protein = protein;
    }

    public void printInfo() {
        System.out.println("Nutritional information per serving of " + name + ":");
        System.out.printf(" Fat: %.2f g\n", fat);
        System.out.printf(" Carbohydrates: %.2f g\n", carbs);
        System.out.printf(" Protein: %.2f g\n", protein);
    }

    public double getFat() {
        return fat;
    }

    public double getCarbs() {
        return carbs;
    }

    public double getProtein() {
        return protein;
    }

    public double getCalories(double numServings) {
        double calories = ((fat * 9) + (carbs * 4) + (protein * 4)) * numServings;
        return calories;
    }

}