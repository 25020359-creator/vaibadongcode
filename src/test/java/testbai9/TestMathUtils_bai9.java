package testbai9;

import org.example.bai9.code.MathUtils;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestMathUtils_bai9 {
    private static final Logger logger = LoggerFactory.getLogger(TestMathUtils_bai9.class);

    @BeforeAll
    static void setUp(){
        logger.info("Bắt đầu chạy toàn bộ test bài 9!");
    }

    @AfterAll
    static void shutDown(){
        logger.info("Kết thúc chạy toàn bộ test bài 9!");
    }

    @Test
    void testMax() {
        assertEquals(1, MathUtils.max(1, 1));
        assertEquals(3, MathUtils.max(3, 1));
        assertEquals(3, MathUtils.max(1, 3));
    }

    @Test
    void testDevide() {
        assertEquals(2, MathUtils.divide(2, 1));
        assertEquals(-2, MathUtils.divide(2, -1));

        assertEquals(Integer.MAX_VALUE, MathUtils.max(5, Integer.MAX_VALUE));
        assertEquals(5, MathUtils.max(5, Integer.MIN_VALUE));
    }

    @Test
    public void testChiacho0() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            MathUtils.divide(10, 0);
        });
        assertEquals("Không thể chia cho số 0 !", exception.getMessage());
    }
}