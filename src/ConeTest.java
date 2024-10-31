import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



public class ConeTest {

    @Test
    public void testCalculateLateralSurfaceArea() {
        Cone cone = new Cone(5, 3);
        double expected = Math.PI * 3 * Math.sqrt((3 * 3) + (5 * 5));
        assertEquals(expected, cone.calculateLateralSurfaceArea(), 0.0001);
    }

    @Test
    public void testCalculateVolume() {
        Cone cone = new Cone(5, 3);
        double expected = (1.0 / 3) * Math.PI * (3 * 3) * 5;
        assertEquals(expected, cone.calculateVolume(), 0.0001);
    }

    @Test
    public void testGetHeight() {
        Cone cone = new Cone(5, 3);
        assertEquals(5, cone.getHeight());
    }

    @Test
    public void testGetRadius() {
        Cone cone = new Cone(5, 3);
        assertEquals(3, cone.getRadius());
    }

    @Test
    public void testSetHeight() {
        Cone cone = new Cone(5, 3);
        cone.setHeight(10);
        assertEquals(10, cone.getHeight());
    }

    @Test
    public void testSetRadius() {
        Cone cone = new Cone(5, 3);
        cone.setRadius(6);
        assertEquals(6, cone.getRadius());
    }
}
