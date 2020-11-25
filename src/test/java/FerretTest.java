import io.zipcoder.polymorphism.Ferret;
import org.junit.Assert;
import org.junit.Test;

public class FerretTest {

    @Test
    public void testSpeak(){
        Ferret ferret = new Ferret("Bobby");
        String expected = "meep";
        String actual = ferret.speak();

        Assert.assertEquals(expected, actual);
    }

}