// Створити клас Goods (товар) з полями: назва товару, дата оформлення, ціна
// товару, кількість одиниць товару, номер накладної, по якій товар поступив на
// склад. Реалізувати методи зміни ціни товару, зміни кількості, обчислення
// вартості товару. 
import java.time.LocalDate;

public class Goods {
    private String name;
    private LocalDate dateOfReceipt;
    private double price;
    private int quantity;
    private String invoiceNumber;

    public Goods(String name, LocalDate dateOfReceipt, double price, int quantity, String invoiceNumber) {
        this.name = name;
        this.dateOfReceipt = dateOfReceipt;
        this.price = price;
        this.quantity = quantity;
        this.invoiceNumber = invoiceNumber;
    }
    
    // Метод для обчислення вартості товару
    public double calculateTotalValue() {
        return this.price * this.quantity;
    }

    // Геттери та сеттери для полів
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfReceipt() {
        return dateOfReceipt;
    }

    public void setDateOfReceipt(LocalDate dateOfReceipt) {
        this.dateOfReceipt = dateOfReceipt;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public String toString() {
        return "Goods{" +
                "name='" + name + '\'' +
                ", dateOfReceipt=" + dateOfReceipt +
                ", price=" + price +
                ", quantity=" + quantity +
                ", invoiceNumber='" + invoiceNumber + '\'' +
                '}';
    }
}