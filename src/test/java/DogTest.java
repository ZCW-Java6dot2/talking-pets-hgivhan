import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DogTest {

    @Test
    public void testSpeak(){
        Dog dog = new Dog("Bowe");
        String expected = "woof";
        String actual = dog.speak();

        Assert.assertEquals(expected, actual);
    }

}