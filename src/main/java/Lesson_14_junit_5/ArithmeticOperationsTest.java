package Lesson_14_junit_5;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArithmeticOperationsTest {
    @Test
    void testAdd() {
        assertEquals(5, ArithmeticOperations.add(2, 3));
    }

    @Test
    void testSubtract() {
        assertEquals(-1, ArithmeticOperations.subtract(2, 3));
    }

    @Test
    void testMultiply() {
        assertEquals(6, ArithmeticOperations.multiply(2, 3));
    }

    @Test
    void testDivide() {
        assertEquals(2.5, ArithmeticOperations.divide(5, 2));
        assertThrows(ArithmeticException.class, () -> ArithmeticOperations.divide(5, 0));
    }
}
