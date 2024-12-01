//3. IllegalArgumentException
//Это исключение возникает, когда метод получает неподобающий аргумент.

public class IllegalArgumentExceptionExample {
    public static void main(String[] args) {
        try {
            int value = Integer.parseInt("abc");  // Невозможно преобразовать строку "abc" в число
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());  // Печать сообщения об ошибке
        }
    }
}
