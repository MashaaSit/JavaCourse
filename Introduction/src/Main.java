import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Создаем объект Scanner для чтения ввода из консоли
        Scanner scanner = new Scanner(System.in);

        // Просим пользователя ввести имя
        System.out.print("Введите ваше имя: ");

        // Читаем введенное имя
        String name = scanner.nextLine();

        // Выводим приветствие
        System.out.println("Привет, " + name + "!");
    }
}
