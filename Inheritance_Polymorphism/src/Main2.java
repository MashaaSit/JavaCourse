final class FinalClass {
    public void display() {
        System.out.println("This is a method from a final class.");
    }
}

// Попытка наследования от final-класса
class SubClass extends FinalClass { // Ошибка компиляции
    public void display() {
        System.out.println("Attempting to override method in a subclass.");
    }
}

public class Main2 {
    public static void main(String[] args) {
        FinalClass finalClass = new FinalClass();
        finalClass.display();
    }
}
