class Parent {
    public final void display() {
        System.out.println("This is a final method in Parent class.");
    }
}

class Child extends Parent {
    // Попытка переопределения final-метода
    @Override
    public void display() { // Ошибка компиляции
        System.out.println("Attempting to override the final method in Child class.");
    }
}

public class Main1 {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.display();

        Child child = new Child();
        child.display(); // Здесь будет ошибка компиляции
    }
}
