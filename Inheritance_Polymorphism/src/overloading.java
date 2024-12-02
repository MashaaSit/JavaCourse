class Calculator {

    // Перегруженные методы для сложения
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b, double c) {
        return a + b + c;
    }

    public String add(String a, String b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Вызов различных перегруженных методов
        System.out.println("Sum of 2 integers: " + calculator.add(5, 10));               // Вызов метода с 2 int параметрами
        System.out.println("Sum of 2 doubles: " + calculator.add(5.5, 10.5));             // Вызов метода с 2 double параметрами
        System.out.println("Sum of 3 integers: " + calculator.add(5, 10, 15));           // Вызов метода с 3 int параметрами
        System.out.println("Sum of 3 doubles: " + calculator.add(5.5, 10.5, 15.5));     // Вызов метода с 3 double параметрами
        System.out.println("Concatenation of strings: " + calculator.add("Hello, ", "World!")); // Вызов метода для строк
    }
}
