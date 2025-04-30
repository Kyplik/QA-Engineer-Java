package Lesson_14_junit_5;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NumberComparatorTest {
    @Test
    void testCompare() {
        assertEquals("3 > 1", NumberComparator.compare(3, 1));
        assertEquals("1 < 3", NumberComparator.compare(1, 3));
        assertEquals("2 = 2", NumberComparator.compare(2, 2));
    }
}
