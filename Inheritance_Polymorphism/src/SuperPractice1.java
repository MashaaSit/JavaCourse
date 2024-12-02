class Parent {
    // Поле суперкласса
    protected String name;

    // Конструктор суперкласса
    public Parent(String name) {
        this.name = name;
        System.out.println("Parent constructor called");
    }

    // Метод суперкласса
    public void display() {
        System.out.println("Name in Parent: " + name);
    }
}

class Child extends Parent {
    // Поле подкласса
    protected String name;

    // Конструктор подкласса
    public Child(String childName, String parentName) {
        super(parentName); // Вызов конструктора суперкласса
        this.name = childName;
        System.out.println("Child constructor called");
    }

    // Метод подкласса
    public void display() {
        super.display(); // Вызов метода суперкласса
        System.out.println("Name in Child: " + name);
    }

    public void showParentName() {
        System.out.println("Accessing parent name directly: " + super.name); // Доступ к полю суперкласса
    }
}

public class SuperPractice1 {
    public static void main(String[] args) {
        Child child = new Child("ChildName", "ParentName");

        // Вызов метода подкласса
        child.display();

        // Доступ к полю суперкласса
        child.showParentName();
    }
}
