package Lesson_14_testng;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class NumberComparatorTest {
    @Test
    public void testCompare() {
        assertEquals(NumberComparator.compare(5, 3), "5 is greater than 3");
    }
}
