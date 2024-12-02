public class OperatorsExample {
    public static void main(String[] args) {
        // 1. Операторы присваивания (=, +=, -=, *=, /=, %=)
        int a = 10;     // =
        a += 5;         // a = a + 5
        a -= 2;         // a = a - 2
        a *= 3;         // a = a * 3
        a /= 4;         // a = a / 4
        a %= 3;         // a = a % 3

        // Для String оператор +=
        String s = "Hello";
        s += " World";  // Конкатенация строк

        // 2. Тернарный оператор (?:)
        int b = (a > 1) ? 100 : 200;

        // 3. Логические операторы (||, &&)
        boolean logic1 = (a > 1) || (b < 50);  // Логическое "или"
        boolean logic2 = (a > 1) && (b > 50); // Логическое "и"

        // 4. Побитовые операторы (|, ^, &, >>, >>>, <<)
        int x = 5;  // 0101 в двоичной системе
        int y = 3;  // 0011 в двоичной системе
        int bitwiseOr = x | y;   // 0111 -> 7
        int bitwiseXor = x ^ y;  // 0110 -> 6
        int bitwiseAnd = x & y;  // 0001 -> 1
        int shiftLeft = x << 1;  // 1010 -> 10
        int shiftRight = x >> 1; // 0010 -> 2
        int unsignedShift = x >>> 1; // 0010 -> 2

        // 5. Сравнения (==, !=, >, >=, <, <=)
        boolean compare1 = (a == b); // Равно
        boolean compare2 = (a != b); // Не равно
        boolean compare3 = (a > b);  // Больше
        boolean compare4 = (a >= b); // Больше или равно
        boolean compare5 = (a < b);  // Меньше
        boolean compare6 = (a <= b); // Меньше или равно

        // 6. Арифметические операторы (+, -, *, /, %)
        int sum = a + b;    // Сложение
        int diff = a - b;   // Вычитание
        int prod = a * b;   // Умножение
        int div = a / 2;    // Деление
        int mod = a % 2;    // Остаток от деления

        // 7. Префиксная и постфиксная форма ++ и --
        int num = 5;
        int preIncrement = ++num;  // Префиксное увеличение (сначала увеличивает, затем возвращает)
        int postIncrement = num++; // Постфиксное увеличение (сначала возвращает, затем увеличивает)
        int preDecrement = --num;  // Префиксное уменьшение
        int postDecrement = num--; // Постфиксное уменьшение

        // 8. Унарные операторы (~, !)
        int bitwiseNot = ~x;  // Побитовая инверсия
        boolean logicalNot = !logic1; // Логическое "не"

        // 9. Операторы ( ) и [ ] используются для вызова методов, работы с массивами
        int[] array = {1, 2, 3, 4, 5};
        int element = array[2]; // Доступ к элементу массива

        // Вывод результатов
        System.out.println("Примеры операторов:");
        System.out.println("Оператор += для String: " + s);
        System.out.println("Тернарный оператор (a > 1 ? 100 : 200): " + b);
        System.out.println("Логическое ||: " + logic1);
        System.out.println("Побитовое |: " + bitwiseOr);
        System.out.println("Сравнение (a == b): " + compare1);
        System.out.println("Арифметическое сложение: " + sum);
        System.out.println("Префиксный ++: " + preIncrement + ", Постфиксный ++: " + postIncrement);
        System.out.println("Унарный ~: " + bitwiseNot);
        System.out.println("Элемент массива: " + element);
    }
}