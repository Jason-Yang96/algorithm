//package baekjoon.advanced1.croatiaword_2941;
//
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//
//import java.io.ByteArrayInputStream;
//import java.io.ByteArrayOutputStream;
//import java.io.IOException;
//import java.io.PrintStream;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//public class MainTest {
//
//    @AfterEach
//    void aftetEach() {
//        System.setOut(System.out);
//    }
//    @Test
//    @DisplayName("first test")
//    void testMain() throws IOException {
//        // Given
//        String input = "ddz=z=";  // Replace with your test input
//        System.setIn(new ByteArrayInputStream(input.getBytes()));
//
//        // Redirect System.out to capture the output
//        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
//        System.setOut(new PrintStream(outputStream));
//        // When
//        Main.main(null);
//
//        // Then
//        // Modify the expected result based on your logic
//        assertEquals(3, Main.getOutput());  // Replace 10 with the expected output
//    }
//}