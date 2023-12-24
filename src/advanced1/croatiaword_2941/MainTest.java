package advanced1.croatiaword_2941;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    void testMain() throws IOException {
        // Given
        String input = "ddz=z=";  // Replace with your test input
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        // When
        Main.main(null);

        // Then
        // Modify the expected result based on your logic
        assertEquals(3, getOutput());  // Replace 10 with the expected output
    }

    public static int getOutput() {
        return Integer.parseInt(System.out.toString().trim());
    }
}