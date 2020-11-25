package io.zipcoder.polymorphism;
import org.junit.Assert;
import org.junit.Test;

public class DogTest {

    @Test
    public void testSpeak(){
        Dog dog = new Dog("Bowe");
        String expected = "woof";
        String actual = dog.speak();

        Assert.assertEquals(expected, actual);
    }

}