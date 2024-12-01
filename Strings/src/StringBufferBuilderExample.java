public class StringBufferBuilderExample {
    public static void main(String[] args) {
        // Работа с StringBuilder
        StringBuilder sb = new StringBuilder("Hello");

        // 1. append() - Добавляет строку или символы к текущему объекту
        sb.append(" World");
        System.out.println("After append: " + sb); // Результат: Hello World

        // 2. insert() - Вставляет строку или символы на указанную позицию
        sb.insert(6, "Java ");
        System.out.println("After insert: " + sb); // Результат: Hello Java World

        // 3. replace() - Заменяет часть строки в указанном диапазоне
        sb.replace(6, 10, "Awesome");
        System.out.println("After replace: " + sb); // Результат: Hello Awesome World

        // 4. delete() - Удаляет символы в указанном диапазоне
        sb.delete(6, 13);
        System.out.println("After delete: " + sb); // Результат: Hello World

        // 5. reverse() - Переворачивает строку
        sb.reverse();
        System.out.println("After reverse: " + sb); // Результат: dlroW olleH

        // 6. setLength() - Устанавливает новую длину строки
        sb.setLength(5);
        System.out.println("After setLength: " + sb); // Результат: dlroW

        // Работа с StringBuffer
        StringBuffer sbf = new StringBuffer("Hello");

        // 7. capacity() - Возвращает текущую ёмкость (длину внутреннего массива)
        System.out.println("Initial capacity: " + sbf.capacity()); // Обычно 16 + длина строки

        // 8. ensureCapacity() - Увеличивает ёмкость до указанного значения
        sbf.ensureCapacity(50);
        System.out.println("Capacity after ensureCapacity(50): " + sbf.capacity()); // Результат: >= 50

        // 9. charAt() - Возвращает символ по указанному индексу
        char ch = sbf.charAt(1);
        System.out.println("Character at index 1: " + ch); // Результат: e

        // 10. substring() - Возвращает подстроку в указанном диапазоне
        String sub = sbf.substring(1, 4);
        System.out.println("Substring (1, 4): " + sub); // Результат: ell
    }
}
