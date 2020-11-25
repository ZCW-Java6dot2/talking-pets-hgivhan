package io.zipcoder.polymorphism;
import java.util.ArrayList;
import java.util.Scanner;

public class OwnerDisplay {
    // need a way to store pets owner has and to take in 0-3 pets.
    // then associate each pet with it's Class (and corresponding name/speech)
    private Scanner scanner;

    public OwnerDisplay(Scanner aScanner) {
        this.scanner = aScanner;
    }

    public Owner getPetNum() {
        System.out.println("Hello, how many pets do you have?");
        Integer numPets = scanner.nextInt();
        ArrayList<Pet> petsList = createPetInfo(numPets);
        return new Owner(petsList);
    }

    public ArrayList<Pet> createPetInfo(int numPets) {
        ArrayList<Pet> petsList = new ArrayList<>();
        for (int i = 1; i <= numPets; i++) {
            System.out.println("Is pet " + i + " a cat, dog, or ferret?");
            String petType = scanner.next();
            if (petType.toLowerCase().equals("dog")) {
                System.out.println("What is your dog's name?");
                scanner.nextLine();
                //String dogName = scanner.nextLine(); how to create new Pet of specific subclass type?
                petsList.add(new Dog(scanner.nextLine()));
            } else if (petType.toLowerCase().equals("cat")) {
                System.out.println("What is your cat's name?");
                scanner.nextLine();
                petsList.add(new Cat(scanner.nextLine()));
            } else if (petType.toLowerCase().equals("ferret")) {
                System.out.println("What is your ferret's name?");
                scanner.nextLine();
                petsList.add(new Ferret(scanner.nextLine()));
            } else {
                System.out.println("Sorry, we can only discuss cats, dogs, or ferrets here.");
            }
        }
        Owner owner = new Owner(petsList);
        System.out.println("Thanks for sharing. Your pets, their names, and their sounds are listed here:");
        for (Pet thePet : owner.getPetsList()) {
            System.out.println(thePet.getName() + "," + thePet.speak());
        }
        return petsList;
    }
}

