/**
 * Класс для выполнения базовых математических операций.
 *
 * @author Ситникова мария
 * @version 1.0
 * @since 2024
 */
public class CodeDocumentation {
    /**
     * Метод для сложения двух чисел.
     *
     * @param a первое число
     * @param b второе число
     * @return результат сложения a и b
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * Метод для деления двух чисел.
     *
     * @param a делимое
     * @param b делитель
     * @return результат деления a на b
     * @throws ArithmeticException если b равно нулю
     * @deprecated {@link #safeDivide(int, int)}.
     */
    @Deprecated
    public int divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Деление на ноль");
        }
        return a / b;
    }

    /**
     * Метод для безопасного деления двух чисел.
     *
     * @param a делимое
     * @param b делитель
     * @return результат деления a на b, или 0, если b равно нулю
     * @since 2024
     */
    public int safeDivide(int a, int b) {
        if (b == 0) {
            return 0;  // Возвращаем 0, если делитель равен нулю
        }
        return a / b;
    }

}

//в терминале выполнила команду javadoc -d docs CodeDocumentation.java
//создалась html страница