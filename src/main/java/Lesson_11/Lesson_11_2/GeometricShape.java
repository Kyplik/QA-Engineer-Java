package Lesson_11.Lesson_11_2;

interface GeometricShape {
    String getFillColor();
    String getBorderColor();
    double calculatePerimeter();
    double calculateArea();

    // Дефолтный метод для вывода информации
    default void printInfo() {
        System.out.println("Периметр: " + calculatePerimeter() + ", Площадь: " + calculateArea() + ", Цвет фона: " + getFillColor() + ", Цвет границ: " + getBorderColor());
    }
}