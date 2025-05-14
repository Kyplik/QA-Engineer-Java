package Lesson_14_junit_5_Test;
import Lesson_14_junit_5.FactorialCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FactorialCalculatorTest {
    @Test
    void testCalculateFactorial() {
        Assertions.assertEquals(1, FactorialCalculator.calculateFactorial(0));
        assertEquals(1, FactorialCalculator.calculateFactorial(1));
        assertEquals(120, FactorialCalculator.calculateFactorial(5));
        assertThrows(IllegalArgumentException.class, () -> FactorialCalculator.calculateFactorial(-1));
    }
}
