public class Calculator {

    // Метод для сложения целых чисел
    public int sum(int... numbers) {
        int result = 0;
        for (int num : numbers) {
            result += num;
        }
        return result;
    }

    // Перегрузка метода для сложения чисел с плавающей точкой (double)
    public double sum(double... numbers) {
        double result = 0.0;
        for (double num : numbers) {
            result += num;
        }
        return result;
    }

    // Перегрузка метода для сложения целых чисел и чисел с плавающей точкой
    public double sum(int[] intNumbers, double... doubleNumbers) {
        double result = 0.0;
        for (int num : intNumbers) {
            result += num;
        }
        for (double num : doubleNumbers) {
            result += num;
        }
        return result;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Вызов метода для целых чисел
        System.out.println("Сумма целых чисел: " + calculator.sum(1, 2, 3, 4, 5));

        // Вызов метода для чисел с плавающей точкой
        System.out.println("Сумма чисел с плавающей точкой: " + calculator.sum(1.1, 2.2, 3.3));

        // Вызов перегруженной версии метода для целых и чисел с плавающей точкой
        System.out.println("Сумма целых и чисел с плавающей точкой: " + calculator.sum(new int[]{1, 2, 3}, 4.4, 5.5));
    }
}