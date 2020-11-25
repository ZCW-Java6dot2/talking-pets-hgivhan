package io.zipcoder.polymorphism;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class MainApplicationTest {
    @Test
    public void testFerret() {

        String input = "1\nFerret\nMeepers\n";
        InputStream stdin = System.in;
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Scanner scanner = new Scanner(System.in);

        OwnerDisplay display = new OwnerDisplay(scanner);

        Owner owner = display.getPetNum();
        System.out.println(owner);

    }

    @Test
    public void testWrongAnimal() {

        String input = "1\nmonkey";
        InputStream stdin = System.in;
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Scanner scanner = new Scanner(System.in);

        OwnerDisplay display = new OwnerDisplay(scanner);

        Owner owner = display.getPetNum();
        System.out.println(owner);

    }
}
