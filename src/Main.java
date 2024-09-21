import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введiть кiлькiсть: ");
        int quantity = scanner.nextInt();

        System.out.print("Введiть цiну: ");
        double price = scanner.nextDouble();

        Goods goods = new Goods("Молоко", LocalDate.of(2021, 1, 1), price, quantity, "123456");

        System.out.println("Назва товару: " + goods.getName());
        System.out.println("Дата отримання: " + goods.getDateOfReceipt());
        System.out.println("Цiна: " + goods.getPrice());
        System.out.println("Кiлькiсть: " + goods.getQuantity());
        System.out.println("Номер накладної: " + goods.getInvoiceNumber());
        System.out.println("Загальна вартiсть: " + goods.calculateTotalValue());
    }
}
