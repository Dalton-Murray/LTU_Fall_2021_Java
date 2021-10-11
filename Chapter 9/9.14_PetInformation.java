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

import java.util.Scanner;

public class PetInformation {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        Pet myPet = new Pet();
        Dog myDog = new Dog();

        String petName, dogName, dogBreed;
        int petAge, dogAge;

        petName = scnr.nextLine();
        petAge = scnr.nextInt();
        scnr.nextLine();
        dogName = scnr.next();
        dogAge = scnr.nextInt();
        scnr.nextLine();
        dogBreed = scnr.nextLine();

        myPet.setName(petName);
        myPet.setAge(petAge);
        myPet.printInfo();

        myDog.setName(dogName);
        myDog.setAge(dogAge);
        myDog.setBreed(dogBreed);
        myDog.printInfo();

        System.out.println("   Breed: " + myDog.getBreed());
    }
}