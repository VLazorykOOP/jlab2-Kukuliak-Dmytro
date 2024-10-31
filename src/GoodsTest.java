import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

public class GoodsTest {

    @Test
    public void testGoodsFields() {
        Goods goods1 = new Goods("Laptop", LocalDate.of(2023, 1, 15), 1200.0, 10, "INV12345");
        assertEquals("Laptop", goods1.getName());
        assertEquals(LocalDate.of(2023, 1, 15), goods1.getDateOfReceipt());
        assertEquals(1200.0, goods1.getPrice());
        assertEquals(10, goods1.getQuantity());
        assertEquals("INV12345", goods1.getInvoiceNumber());
    }

    @Test
    public void testCalculateTotalValue() {
        Goods goods1 = new Goods("Laptop", LocalDate.of(2023, 1, 15), 1200.0, 10, "INV12345");
        double totalValue1 = goods1.calculateTotalValue();
        assertEquals(12000.0, totalValue1);
    }

    @Test
    public void testChangePrice() {
        Goods goods1 = new Goods("Laptop", LocalDate.of(2023, 1, 15), 1200.0, 10, "INV12345");
        goods1.setPrice(1300.0);
        assertEquals(1300.0, goods1.getPrice());
    }

    @Test
    public void testChangeQuantity() {
        Goods goods1 = new Goods("Laptop", LocalDate.of(2023, 1, 15), 1200.0, 10, "INV12345");
        goods1.setQuantity(8);
        assertEquals(8, goods1.getQuantity());
    }

    @Test
    public void testCalculateTotalValueAfterChanges() {
        Goods goods1 = new Goods("Laptop", LocalDate.of(2023, 1, 15), 1200.0, 10, "INV12345");
        goods1.setPrice(1300.0);
        goods1.setQuantity(8);
        double totalValue2 = goods1.calculateTotalValue();
        assertEquals(10400.0, totalValue2);
    }

    @Test
    public void testChangeName() {
        Goods goods1 = new Goods("Laptop", LocalDate.of(2023, 1, 15), 1200.0, 10, "INV12345");
        goods1.setName("Gaming Laptop");
        assertEquals("Gaming Laptop", goods1.getName());
    }

    @Test
    public void testChangeDateOfReceipt() {
        Goods goods1 = new Goods("Laptop", LocalDate.of(2023, 1, 15), 1200.0, 10, "INV12345");
        goods1.setDateOfReceipt(LocalDate.of(2023, 2, 1));
        assertEquals(LocalDate.of(2023, 2, 1), goods1.getDateOfReceipt());
    }

    @Test
    public void testChangeInvoiceNumber() {
        Goods goods1 = new Goods("Laptop", LocalDate.of(2023, 1, 15), 1200.0, 10, "INV12345");
        goods1.setInvoiceNumber("INV54321");
        assertEquals("INV54321", goods1.getInvoiceNumber());
    }
}
