
class CustomException1 extends Exception {
    public CustomException1(String message) {
        super(message);
    }
}

class CustomException2 extends Exception {
    public CustomException2(String message) {
        super(message);
    }
}

public class ExceptionHandlingExample {

    // Метод, который генерирует два исключения
    public static void generateExceptions() throws CustomException2 {
        // Генерация первого исключения
        try {
            throw new CustomException1("Это первое исключение (будет перехвачено).");
        } catch (CustomException1 e) {
            // Обработка первого исключения
            System.out.println("Первое исключение перехвачено: " + e.getMessage());
        }

        // Генерация второго исключения (будет передано вверх, не перехвачено)
        throw new CustomException2("Это второе исключение (приведет к аварийной остановке).");
    }

    public static void main(String[] args) {
        try {
            generateExceptions();
        } catch (CustomException2 e) {
            // Перехват второго исключения
            System.out.println("Второе исключение перехвачено в main: " + e.getMessage());
        }

        System.out.println("Программа завершена.");
    }
}

