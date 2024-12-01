// Определяем интерфейс
interface MyInterface {
    // Неабстрактный метод с ключевым словом default
    default void defaultMethod() {
        System.out.println("This is a default method in the interface.");
    }

    // Статический метод
    static void staticMethod() {
        System.out.println("This is a static method in the interface.");
    }
}

// Класс, реализующий интерфейс
class MyTestClass implements MyInterface {
    // Переопределение default метода (по желанию)
    @Override
    public void defaultMethod() {
        System.out.println("Overridden default method in the implementing class.");
    }

    // Дополнительный метод для вызова default метода интерфейса
    public void callDefaultMethodFromInterface() {
        MyInterface.super.defaultMethod(); // Вызов default метода интерфейса
    }
}

// Главный класс с демонстрацией вызова методов
public class InterfaceExample {
    public static void main(String[] args) {
        // Создаем объект класса, реализующего интерфейс
        MyTestClass myClass = new MyTestClass();

        // Вызов переопределённого default метода
        myClass.defaultMethod();

        // Вызов default метода интерфейса через MyInterface.super
        myClass.callDefaultMethodFromInterface();

        // Вызов статического метода интерфейса
        MyInterface.staticMethod();
    }
}

