public class Cone {
    private double height;
    private double radius;

    // Конструктор для ініціалізації висоти та радіуса
    public Cone(double height, double radius) {
        this.height = height;
        this.radius = radius;
    }

    // Метод для обчислення площі бічної поверхні конуса
    public double calculateLateralSurfaceArea() {
        double slantHeight = Math.sqrt((radius * radius) + (height * height));
        return Math.PI * radius * slantHeight;
    }

    // Метод для обчислення об'єму конуса
    public double calculateVolume() {
        return (1.0 / 3) * Math.PI * (radius * radius) * height;
    }

    // Геттери для висоти та радіуса
    public double getHeight() {
        return height;
    }

    public double getRadius() {
        return radius;
    }

    // Сеттери для висоти та радіуса
    public void setHeight(double height) {
        this.height = height;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
