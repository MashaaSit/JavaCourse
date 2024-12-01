//2. ArrayIndexOutOfBoundsException
//Это исключение возникает, когда попытка обращения к элементу массива выходит за пределы его индексов.

public class ArrayIndexOutOfBoundsExceptionExample {
    public static void main(String[] args) {
        int[] arr = new int[5];
        try {
            int value = arr[10];  // Индекс за пределами массива вызывает ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: " + e.getMessage());  // Печать сообщения об ошибке
        }
    }
}
