import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReaderExample {
    public static void main(String[] args) {

        String filePath = "/home/masha/IdeaProjects/JavaCourse/Input_Output_Streams/Byte_Char_streams/example.txt";
        try {
            // Создаем объект File для указанного пути
            File file = new File(filePath);

            // Создаем объект Scanner для чтения файла
            Scanner scanner = new Scanner(file);

            // Чтение файла построчно
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }

            // Закрываем Scanner после завершения работы
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден: " + filePath);
            e.printStackTrace();
        }
    }
}