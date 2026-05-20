package testbai5;

import org.example.bai1.code.MathUtils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathUtilsTest {
    @Test
    public void testMax() {
        assertEquals(5, MathUtils.max(3, 5));
        assertEquals(7, MathUtils.max(7, 2));
        assertEquals(2, MathUtils.max(2, 2));
    }
}
