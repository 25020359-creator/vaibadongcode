package testbai1;

import org.example.bai1.code.MathUtils;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MathUtilsTest {
    @BeforeAll
    static void beforeAll() {
        System.out.println("Bắt đầu chạy test");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("Kết thúc test");
    }


    @Test
    public void testMax1() {
        assertEquals(5, MathUtils.max(5, 2));
        assertEquals(10, MathUtils.max(5, 10));
        assertEquals(5, MathUtils.max(5, 5));
    }

    @Test
    public void testMax2() {
        assertEquals(Integer.MAX_VALUE, MathUtils.max(5, Integer.MAX_VALUE));
        assertEquals(5, MathUtils.max(5, Integer.MIN_VALUE));
    }

    @Test
    public void testdivide1() {
        assertEquals(2, MathUtils.devide(10, 5));
        assertEquals(-2, MathUtils.devide(10, -5));
    }

    @Test
    public void testdivide2() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            MathUtils.devide(10, 0);
        });
        assertEquals("Không thể chia cho số 0!", exception.getMessage());
    }
}
