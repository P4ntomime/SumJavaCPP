import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
//...
¦¦@Test
void testAbs() {
    int negativeValue = -1;
    assertEquals(1, abs(negativeValue));
}
//...