import java.util.Formatter;

public class FormatterExample {
    public static void main(String[] args) {
        // Создание объекта Formatter
        Formatter formatter = new Formatter();

        // Использование различных спецификаторов формата

        // %b — Логическое значение
        boolean flag = true;
        formatter.format("Логическое значение: %b%n", flag);

        // %c — Символьное представление
        char symbol = 'A';
        formatter.format("Символ: %c%n", symbol);

        // %d — Десятичное целое число
        int integer = 123;
        formatter.format("Целое число: %d%n", integer);

        // %f — Десятичное число с плавающей точкой
        double pi = 3.14159;
        formatter.format("Число с плавающей точкой: %f%n", pi);

        // %s — Строковое представление
        String name = "John";
        formatter.format("Строка: %s%n", name);

        // Вывод форматированного текста
        System.out.println(formatter.toString());

        // Закрытие объекта Formatter
        formatter.close();
    }
}