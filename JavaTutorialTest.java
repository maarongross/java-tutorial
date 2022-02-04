import static org.junit.Assert.*;
import org.junit.*;

public class JavaTutorialTest {
    @Test
    public void multTest() {
        assertEquals(6, JavaTutorial.mult(2, 2));
    }
}