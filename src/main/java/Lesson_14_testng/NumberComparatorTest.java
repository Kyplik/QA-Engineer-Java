package Lesson_14_testng;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class NumberComparatorTest {
    @Test
    public void testCompare() {
        assertEquals(NumberComparator.compare(3, 1), "3 > 1");
    }
}
