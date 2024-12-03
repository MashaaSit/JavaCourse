//Принцип подстановки Барбары Лисков (Liskov Substitution Principle, LSP)
//Принцип подстановки Лисков гласит, что если класс B является подклассом
//класса A, то объекты класса B могут быть использованы вместо объектов класса
//A без нарушения функциональности программы. Это означает, что подклассы
//должны сохранять поведение, определенное в суперклассе, и не изменять
//его таким образом, чтобы нарушать ожидания кода, использующего суперкласс.

// Суперкласс Animal
class Animal {
    public void makeSound() {
        System.out.println("Животное издает звук");
    }
}

// Подкласс Dog
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Собака лает");
    }
}

// Подкласс Cat
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Кошка мяукает");
    }
}

// Тест программы
public class Test {
    public static void main(String[] args) {
        // Массив животных
        Animal[] animals = {
                new Dog(), // Собака
                new Cat()  // Кошка
        };

        // Вызываем метод makeSound для каждого животного
        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}
