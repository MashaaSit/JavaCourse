class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    // Неправильное переопределение метода (ошибка в параметре)
    @Override
    public void makeSound(String sound) {  // Ошибка: метод в Dog не переопределяет метод в Animal
        System.out.println("Dog makes a " + sound);
    }
}

public class OverrideError {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound("bark");
    }
}
