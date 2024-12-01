//Если класс реализует два интерфейса,
//оба из которых имеют одинаковые default методы, 
//это может привести к конфликту (Diamond Problem).
//Компилятор Java выдаст ошибку, так как он не может определить, 
//какую версию метода использовать.

//Чтобы решить этот конфликт, класс обязан явно переопределить 
//конфликтующий метод и указать его реализацию.


interface InterfaceA {
    default void defaultMethod() {
        System.out.println("Default method from InterfaceA");
    }
}

interface InterfaceB {
    default void defaultMethod() {
        System.out.println("Default method from InterfaceB");
    }
}

class MyClass implements InterfaceA, InterfaceB {
    @Override
    public void defaultMethod() {
        // Разрешение конфликта с явным указанием логики
        System.out.println("Overridden method in MyClass");
    }

    // Альтернативный вариант: вызов default метода из конкретного интерфейса
    public void callSpecificDefaultMethod() {
        InterfaceA.super.defaultMethod(); // Вызов default метода InterfaceA
        InterfaceB.super.defaultMethod(); // Вызов default метода InterfaceB
    }
}

public class MultipleInterfaceConflict {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();

        // Вызов переопределенного метода
        myClass.defaultMethod();

        // Вызов специфических default методов
        myClass.callSpecificDefaultMethod();
    }
}
