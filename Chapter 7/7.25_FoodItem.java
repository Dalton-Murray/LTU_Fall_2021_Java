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