import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {
    public static void main(String[] args) {
        // Укажите путь к файлу
        String filePath = "output.txt";

        // Используем блок try-with-resources для автоматического закрытия потока
        try (FileOutputStream fileOutputStream = new FileOutputStream(filePath)) {
            // Строка, которую мы хотим записать в файл
            String data = "Hello, World!";

            // Запись данных по одному символу
            for (int i = 0; i < data.length(); i++) {
                fileOutputStream.write(data.charAt(i)); // Записываем каждый символ как байт
            }

            System.out.println("Данные успешно записаны в файл: " + filePath);
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        }
    }
}