class Exc1 extends Exception {}
class Exc2 extends Exc1 {}
class Exc3 extends Exc2 {}

public class ExceptionHierarchyExample {
    public static void main(String[] args) {
        try {
            // В этом примере выбрасываем исключение Ex3
            throw new Exc3();
        } catch (Exc3 e) {
            System.out.println("Поймано исключение типа Ex3");
        } catch (Exc2 e) {
            System.out.println("Поймано исключение типа Ex2");
        } catch (Exc1 e) {
            System.out.println("Поймано исключение типа Ex1");
        }
    }
}
