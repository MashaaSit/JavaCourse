// Создание собственного класса исключения
public class MyFirstException extends Exception {

    // Конструктор по умолчанию
    public MyFirstException() {
        super();  // вызывает конструктор родительского класса Exception
    }

    // Конструктор с сообщением
    public MyFirstException(String message) {
        super(message);  // вызывает конструктор родительского класса с сообщением
    }

    // Конструктор с сообщением и причиной (другим исключением)
    public MyFirstException(String message, Throwable cause) {
        super(message, cause);  // вызывает конструктор родительского класса с сообщением и причиной
    }

    // Конструктор с причиной
    public MyFirstException(Throwable cause) {
        super(cause);  // вызывает конструктор родительского класса с причиной
    }
}

class Main {
    public static void main(String[] args) {
        try {
            throw new MyFirstException("Это тестовое исключение!");
        } catch (MyFirstException e) {
            System.out.println("Поймано исключение: " + e.getMessage());
        }

        try {
            throw new MyFirstException("Ошибка с причиной", new NullPointerException("Null pointer"));
        } catch (MyFirstException e) {
            System.out.println("Поймано исключение с причиной: " + e.getMessage());
            System.out.println("Причина: " + e.getCause());
        }
    }
}

