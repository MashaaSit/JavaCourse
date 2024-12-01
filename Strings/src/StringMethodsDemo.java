public class StringMethodsDemo {
    public static void main(String[] args) {
        String text = "Hello, World!";

        // 1. length() - Возвращает длину строки
        System.out.println("Length: " + text.length()); // Результат: 13

        // 2. charAt() - Возвращает символ на указанной позиции
        System.out.println("Character at index 7: " + text.charAt(7)); // Результат: W

        // 3. substring() - Возвращает подстроку
        System.out.println("Substring (7, 12): " + text.substring(7, 12)); // Результат: World

        // 4. toUpperCase() - Преобразует строку в верхний регистр
        System.out.println("Uppercase: " + text.toUpperCase()); // Результат: HELLO, WORLD!

        // 5. toLowerCase() - Преобразует строку в нижний регистр
        System.out.println("Lowercase: " + text.toLowerCase()); // Результат: hello, world!

        // 6. indexOf() - Возвращает индекс первого вхождения символа или подстроки
        System.out.println("Index of 'o': " + text.indexOf('o')); // Результат: 4

        // 7. lastIndexOf() - Возвращает индекс последнего вхождения символа или подстроки
        System.out.println("Last index of 'o': " + text.lastIndexOf('o')); // Результат: 8

        // 8. contains() - Проверяет, содержит ли строка указанную подстроку
        System.out.println("Contains 'World': " + text.contains("World")); // Результат: true

        // 9. replace() - Заменяет все вхождения одной подстроки на другую
        System.out.println("Replace 'World' with 'Java': " + text.replace("World", "Java")); // Результат: Hello, Java!

        // 10. trim() - Удаляет начальные и конечные пробелы из строки
        String textWithSpaces = "   Hello, World!   ";
        System.out.println("Trimmed: '" + textWithSpaces.trim() + "'"); // Результат: 'Hello, World!'
    }
}
