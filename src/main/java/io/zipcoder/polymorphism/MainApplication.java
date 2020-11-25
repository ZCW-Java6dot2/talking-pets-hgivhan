package io.zipcoder.polymorphism;
import java.util.Scanner;

public class MainApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OwnerDisplay display = new OwnerDisplay(scanner);

        Owner owner = display.getPetNum();

    }
}
