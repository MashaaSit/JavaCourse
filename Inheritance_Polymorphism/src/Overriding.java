class Animal {
    // Метод в суперклассе
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    // Переопределение метода в подклассе
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}

public class Overriding {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();

        animal.makeSound();  // Вызывает метод суперкласса
        dog.makeSound();     // Вызывает переопределенный метод подкласса
    }
}

//        Что будет, если тип возвращаемого значения не совпадает?
//Если тип возвращаемого значения в переопределенном методе отличается
// от типа возвращаемого значения в оригинальном методе суперкласса, то это приведет к ошибке компиляции.