class Calculator {

    // Перегруженный метод для сложения двух целых чисел
    public int add(int a, int b) {
        return a + b;
    }

    // Перегруженный метод для сложения трех целых чисел
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Перегруженный метод для сложения двух чисел с плавающей запятой
    public double add(double a, double b) {
        return a + b;
    }
}

public class MethodOverloadingExample {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // Вызов методов с разными параметрами
        System.out.println("Сумма 2 целых чисел: " + calc.add(10, 20));
        System.out.println("Сумма 3 целых чисел: " + calc.add(10, 20, 30));
        System.out.println("Сумма 2 чисел с плавающей запятой: " + calc.add(10.5, 20.5));
    }
}