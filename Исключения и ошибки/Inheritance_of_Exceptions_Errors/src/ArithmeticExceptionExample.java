//1. ArithmeticException
//Это исключение возникает, когда происходит арифметическая ошибка, например, деление на ноль.

public class ArithmeticExceptionExample {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;  // Деление на ноль вызывает ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: " + e.getMessage());  // Печать сообщения об ошибке
        }
    }
}




