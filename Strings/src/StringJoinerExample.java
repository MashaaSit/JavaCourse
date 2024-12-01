import java.util.StringJoiner;

public class StringJoinerExample {
    public static void main(String[] args) {
        // Создаем StringJoiner с разделителем ", "
        StringJoiner joiner = new StringJoiner(", ");

        // Добавляем строки
        joiner.add("Apple");
        joiner.add("Banana");
        joiner.add("Cherry");

        // Выводим результат
        System.out.println("Joined string: " + joiner); // Результат: Apple, Banana, Cherry
    }
}
