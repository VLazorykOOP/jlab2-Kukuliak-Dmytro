import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathsTest {

    @Test
    public void testGreatestCommonDivisor() {
        Maths maths1 = new Maths(54, 24);
        assertEquals(6, maths1.greatestCommonDivisor(), "Test 1 Failed");

        Maths maths2 = new Maths(48, 18);
        assertEquals(6, maths2.greatestCommonDivisor(), "Test 2 Failed");

        Maths maths3 = new Maths(101, 103);
        assertEquals(1, maths3.greatestCommonDivisor(), "Test 3 Failed");

        Maths maths4 = new Maths(56, 98);
        assertEquals(14, maths4.greatestCommonDivisor(), "Test 4 Failed");
    }

    @Test
    public void testLeastCommonMultiple() {
        Maths maths1 = new Maths(54, 24);
        assertEquals(216, maths1.leastCommonMultiple(), "Test 1 Failed");

        Maths maths2 = new Maths(48, 18);
        assertEquals(144, maths2.leastCommonMultiple(), "Test 2 Failed");

        Maths maths3 = new Maths(101, 103);
        assertEquals(10403, maths3.leastCommonMultiple(), "Test 3 Failed");

        Maths maths4 = new Maths(56, 98);
        assertEquals(392, maths4.leastCommonMultiple(), "Test 4 Failed");
    }
}
