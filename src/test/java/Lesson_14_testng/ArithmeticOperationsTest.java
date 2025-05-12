package Lesson_14_testng;
import Lesson_14.ArithmeticOperations;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class ArithmeticOperationsTest {
    @Test
    public void testAdd() {
        assertEquals(ArithmeticOperations.add(2, 3), 5);
    }

    @Test
    public void testDivide() {
        assertEquals(ArithmeticOperations.divide(5, 2), 2.5);
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void testDivideByZero() {
        ArithmeticOperations.divide(5, 0);
    }
}
