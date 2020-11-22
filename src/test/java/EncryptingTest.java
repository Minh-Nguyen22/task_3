import encrypting_task_3.Encrypting;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class EncryptingTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void encryptingMethodTest() {
        Encrypting test = new Encrypting();

        String expected = test.encryptingMethod("GO");

        String actual = "00 0 0 0 00 000 0 000 \n00 0 0 0 00 00 0 0000 \n";

        Assert.assertEquals(expected, actual);
    }
}
