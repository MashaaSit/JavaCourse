import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamExample {
    public static void main(String[] args) {
        // Укажите путь к файлу
        String filePath = "/home/masha/IdeaProjects/JavaCourse/Input_Output_Streams/Byte_Char_streams/example.txt";

        // Используем блок try-with-resources для автоматического закрытия потока
        try (FileInputStream fileInputStream = new FileInputStream(filePath)) {
            int data;

            // Читаем данные по байтам до конца файла
            while ((data = fileInputStream.read()) != -1) {
                // Преобразуем байт в символ и выводим его
                System.out.print((char) data);
            }
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }
    }
}