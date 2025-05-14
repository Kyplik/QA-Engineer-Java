package Lesson_14_testng;
import Lesson_14.FactorialCalculator;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class FactorialCalculatorTest {
    @Test
    public void testCalculateFactorial() {
        assertEquals(FactorialCalculator.calculateFactorial(0), 1);
        assertEquals(FactorialCalculator.calculateFactorial(5), 120);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testNegativeInput() {
        FactorialCalculator.calculateFactorial(-1);
    }
}
