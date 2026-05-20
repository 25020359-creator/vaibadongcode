package testbai4;

import org.junit.jupiter.api.Test;
import java.io.File;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class OSCompatibilityTest {

    @Test
    public void testWindowsPathStyle() throws IOException {
        String smartPath = "target" + File.separator + "test-folder" +  File.separator + "temp.txt";

        File file = new File(smartPath);
        file.getParentFile().mkdirs();

        boolean newFile = file.createNewFile();

        assertTrue(file.exists());

        file.delete();
    }
}