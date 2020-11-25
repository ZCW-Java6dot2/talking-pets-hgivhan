package io.zipcoder.polymorphism;
import org.junit.Assert;
import org.junit.Test;

public class CatTest {
    @Test
    public void testSpeak(){
        Cat cat = new Cat("Austin");
        String expected = "meoww";
        String actual = cat.speak();

        Assert.assertEquals(expected, actual);
    }

}