import java.util.Arrays;

public class ArraysExample {
    public static void main(String[] args) {
        // Создание массива для примера
        int[] array = {3, 5, 1, 4, 2};

        // Пример использования toString(...)
        // Метод Arrays.toString для преобразования массива в строковое представление
        String arrayString = Arrays.toString(array);
        System.out.println("Массив как строка: " + arrayString);

        // Пример использования binarySearch(...)
        // Перед использованием binarySearch массив должен быть отсортирован
        Arrays.sort(array); // Сортируем массив
        int index = Arrays.binarySearch(array, 4); // Ищем элемент 4
        System.out.println("Индекс элемента 4: " + index);

        // Пример использования equals(...)
        // Проверяем, равны ли два массива
        int[] array2 = {1, 2, 3, 4, 5};
        boolean isEqual = Arrays.equals(array, array2);
        System.out.println("Массивы равны? " + isEqual);

        // Пример использования compare(...)
        // Сравниваем два массива
        int comparisonResult = Arrays.compare(array, array2);
        if (comparisonResult < 0) {
            System.out.println("Массив array меньше массива array2.");
        } else if (comparisonResult > 0) {
            System.out.println("Массив array больше массива array2.");
        } else {
            System.out.println("Массивы одинаковы.");
        }

        // Пример использования sort(...)
        // Сортируем массив
        System.out.println("Массив до сортировки: " + Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("Массив после сортировки: " + Arrays.toString(array));
    }
}