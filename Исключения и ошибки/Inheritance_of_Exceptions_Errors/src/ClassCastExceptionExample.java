//4. ClassCastException
//Это исключение возникает, когда попытка приведения объекта к неподобающему типу не удается.

public class ClassCastExceptionExample {
    public static void main(String[] args) {
        Object obj = "Hello, World!";  // Объект типа String
        try {
            Integer num = (Integer) obj;  // Приведение строки к типу Integer вызывает ClassCastException
        } catch (ClassCastException e) {
            System.out.println("Ошибка: " + e.getMessage());  // Печать сообщения об ошибке
        }
    }
}
