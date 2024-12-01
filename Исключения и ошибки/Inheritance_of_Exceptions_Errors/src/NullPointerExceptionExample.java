//5. NullPointerException
//Это исключение возникает, когда программа пытается использовать ссылку, которая равна null.

public class NullPointerExceptionExample {
    public static void main(String[] args) {
        String str = null;
        try {
            int length = str.length();  // Попытка вызвать метод на объекте, который равен null
        } catch (NullPointerException e) {
            System.out.println("Ошибка: " + e.getMessage());  // Печать сообщения об ошибке
        }
    }
}
