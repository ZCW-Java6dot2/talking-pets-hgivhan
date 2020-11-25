import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PetTest {

    @Test
    public void testSetName() {
        Pet pet = new Pet();
        String expected = "Marvel";
        pet.setName("Marvel");
        String actual = pet.getName();

        Assert.assertEquals(expected, actual);


    }
}