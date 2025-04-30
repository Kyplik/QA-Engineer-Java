package Lesson_14_testng;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class TriangleAreaTest {
    @Test
    public void testCalculateArea() {
        assertEquals(TriangleArea.calculateArea(5, 4), 10.0);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testInvalidInput() {
        TriangleArea.calculateArea(-5, 4);
    }
}
