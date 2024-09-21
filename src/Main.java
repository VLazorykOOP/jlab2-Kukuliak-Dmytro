import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Завдання 1: ");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введiть кiлькiсть товару: ");
        int quantity = scanner.nextInt();

        System.out.print("Введiть цiну товару: ");
        double price = scanner.nextDouble();

        Goods goods = new Goods("Молоко", LocalDate.of(2021, 1, 1), price, quantity, "123456");

        System.out.println("Назва товару: " + goods.getName());
        System.out.println("Дата отримання: " + goods.getDateOfReceipt());
        System.out.println("Цiна: " + goods.getPrice());
        System.out.println("Кiлькiсть: " + goods.getQuantity());
        System.out.println("Номер накладної: " + goods.getInvoiceNumber());
        System.out.println("Загальна вартiсть: " + goods.calculateTotalValue());


        System.out.println("Завдання 2: ");

        System.out.println("Введiть радiус конуса: ");
        double radius = scanner.nextDouble();

        System.out.print("Введiть висоту конуса: ");
        double height = scanner.nextDouble();

        Cone cone = new Cone(height, radius);
        System.out.println("Об'єм конуса: " + cone.calculateVolume());
        System.out.println("Площа поверхнi конуса: " + cone.calculateLateralSurfaceArea());

        System.out.println("Завдання 3: ");

        System.out.println("Введiть перше число: ");
        int a = scanner.nextInt();

        System.out.print("Введiть друге число: ");
        int b = scanner.nextInt();

        Maths maths = new Maths(a, b);
        System.out.println("Найбiльший спiльний дiльник: " + maths.greatestCommonDivisor());
        System.out.println("Найменше спiльне кратне: " + maths.leastCommonMultiple());

        
    }


}
