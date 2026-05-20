package testbai5;

import org.example.bai1.code.MathUtils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathUtilsTest {
    int So_Nguyen_Sai_Dinh_Dang = 10;
    @Test
    public void testMax() {






        assertEquals(          3, MathUtils.max(3, 5)    ); //Sửa dẻ cố tình trả về kết quả sai
        assertEquals(7, MathUtils.max(7, 2));
        assertEquals(2, MathUtils.max(2, 2));
    }
}


