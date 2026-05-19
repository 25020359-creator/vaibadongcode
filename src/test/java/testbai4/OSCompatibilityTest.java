package testbai4;

import org.junit.jupiter.api.Test;
import java.io.File;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class OSCompatibilityTest {

    @Test
    public void testWindowsPathStyle() throws IOException {
        // Cố tình viết cứng đường dẫn dùng dấu gạch chéo ngược của Windows
        String smartPath = "target" + File.separator + "test-folder" +  File.separator + "temp.txt";

        File file = new File(smartPath);
        // Tạo thư mục cha nếu chưa có
        file.getParentFile().mkdirs();

        // Tạo file mới
        boolean isCreated = file.createNewFile();

        // Kiểm tra xem file có tồn tại thực sự không
        assertTrue(file.exists());

        file.delete();
    }
}