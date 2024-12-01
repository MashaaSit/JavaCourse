class Ex1 extends Exception {}
class Ex2 extends Exception {}
class Ex3 extends Exception {}

public class MultipleExceptionsExample {
    public static void main(String[] args) {
        try {
            // Выбрасываем одно из исключений в зависимости от условия
            int choice = (int) (Math.random() * 3);
            switch (choice) {
                case 0 -> throw new Ex1();
                case 1 -> throw new Ex2();
                case 2 -> throw new Ex3();
            }
        } catch (Ex1 | Ex2 | Ex3 e) {
            // Все исключения обрабатываются одинаково
            System.out.println("Поймано исключение: " + e.getClass().getSimpleName());
        }
    }
}
