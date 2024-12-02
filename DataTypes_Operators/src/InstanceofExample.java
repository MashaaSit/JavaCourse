public class InstanceofExample {
    public static void main(String[] args) {
        // Примеры классов
        class Animal {
        }

        class Dog extends Animal {
        }

        class Cat extends Animal {
        }

        // Объекты
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();
        Animal unknown = dog; // Полиморфизм: ссылка на объект Dog, но типа Animal
        Animal nullAnimal = null;

        // Применение instanceof
        System.out.println("Пример использования instanceof:");
        System.out.println("animal instanceof Animal: " + (animal instanceof Animal)); // true
        System.out.println("dog instanceof Animal: " + (dog instanceof Animal));     // true
        System.out.println("cat instanceof Animal: " + (cat instanceof Animal));     // true
        System.out.println("dog instanceof Dog: " + (dog instanceof Dog));           // true
        System.out.println("unknown instanceof Dog: " + (unknown instanceof Dog));   // true
        System.out.println("unknown instanceof Cat: " + (unknown instanceof Cat));   // false

        // Применение instanceof к null
        System.out.println("nullAnimal instanceof Animal: " + (nullAnimal instanceof Animal)); // false

        // Пример с интерфейсами
        interface Flyable {
        }

        class Bird extends Animal implements Flyable {
        }

        Bird bird = new Bird();
        System.out.println("bird instanceof Flyable: " + (bird instanceof Flyable)); // true
        System.out.println("dog instanceof Flyable: " + (dog instanceof Flyable));  // false
    }
}