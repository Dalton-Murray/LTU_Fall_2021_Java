/*
The base class Pet has private fields petName, and petAge. The derived class Dog extends the Pet class and includes a private field for dogBreed. Complete main() to:

create a generic pet and print information using printInfo().
create a Dog pet, use printInfo() to print information, and add a statement to print the dog's breed using the getBreed() method.
Ex. If the input is:

Dobby
2
Kreacher
3
German Schnauzer
the output is:

Pet Information: 
   Name: Dobby
   Age: 2
Pet Information: 
   Name: Kreacher
   Age: 3
   Breed: German Schnauzer

Dalton Murray
*/

public class Pet {

   protected String name;
   protected int age;

   public void setName(String userName) {
      name = userName;
   }

   public String getName() {
      return name;
   }

   public void setAge(int userAge) {
      age = userAge;
   }

   public int getAge() {
      return age;
   }

   public void printInfo() {
      System.out.println("Pet Information: ");
      System.out.println("   Name: " + name);
      System.out.println("   Age: " + age);
   }

}