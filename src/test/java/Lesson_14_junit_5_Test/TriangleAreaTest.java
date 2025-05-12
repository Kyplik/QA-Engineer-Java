package Lesson_14_junit_5_Test;
import Lesson_14_junit_5.TriangleArea;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TriangleAreaTest {
    @Test
    void testCalculateArea() {
        Assertions.assertEquals(10.0, TriangleArea.calculateArea(5, 4));
        assertThrows(IllegalArgumentException.class, () -> TriangleArea.calculateArea(-5, 4));
    }
}
