
import java.util.ArrayList;
import java.util.Scanner;

public class OwnerDisplay {
    // need a way to store pets owner has and to take in 0-3 pets.
    // then associate each pet with it's Class (and corresponding name/speech)
    private Scanner scanner;

    public OwnerDisplay(Scanner aScanner) {
        this.scanner = aScanner;
    }

    public void showPetInfo() {
        System.out.println("Thanks for sharing. Your pets, their names, and their sound are listed here:");
        for (Pet thePet : Owner.getPetsList()) {
            System.out.println(thePet.getName() + "," + thePet.speak());
        }
    }


        public Owner getPetNum () {
            System.out.println("Hello, how many pets do you have?");
            Integer howManyPets = scanner.nextInt();
            ArrayList<Pet> userPets = new ArrayList<Pet>();
            return new Owner(userPets);
        }

        public void createPetInfo ( int numPets){
            ArrayList<Pet> petsList = new ArrayList<Pet>();
            for (int i = 0; i <= numPets; i++) {
                System.out.println("Is pet" + i + "a cat, dog, or ferret?");
                String petType = scanner.nextLine();
                if (petType.toLowerCase().equals("dog")) {
                    System.out.println("What is your dog's name?");
                    //String dogName = scanner.nextLine();
                    petsList.add(new Dog(scanner.nextLine()));
                } else if (petType.toLowerCase().equals("cat")) {
                    System.out.println("What is your cat's name?");
                    petsList.add(new Cat(scanner.nextLine()));
                } else if (petType.toLowerCase().equals("ferret")) {
                    System.out.println("What is your ferret's name?");
                    petsList.add(new Ferret(scanner.nextLine()));
                } else {
                    System.out.println("Sorry, we can only discuss cats, dogs, or ferrets here.");
                }
            }
        }
    }

