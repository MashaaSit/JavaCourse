import java.util.Objects;

class Person {
    private String name;
    private int age;

    // Конструктор
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Переопределение метода equals()
    @Override
    public boolean equals(Object obj) {
        // Проверка на самопроверку
        if (this == obj) {
            return true;
        }

        // Проверка на null и сравнение типов
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        // Преобразование obj в Person
        Person person = (Person) obj;

        // Сравнение полей
        return age == person.age && Objects.equals(name, person.name);
    }

    // Переопределение метода hashCode() для совместимости с equals()
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    // Переопределение метода toString()
    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }

    // Геттеры и сеттеры
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class Obj_Eq {
    public static void main(String[] args) {
        Person person1 = new Person("Alice", 30);
        Person person2 = new Person("Alice", 30);
        Person person3 = new Person("Bob", 25);

        // Сравнение объектов
        System.out.println(person1.equals(person2));  // true
        System.out.println(person1.equals(person3));  // false
    }
}

//Соглашения, которым должен следовать метод equals():
//  Рефлексивность: Для любого ненулевого объекта x должно быть x.equals(x) == true.
//  Симметричность: Для любых объектов x и y, если x.equals(y) == true, то должно быть y.equals(x) == true.
//  Транзитивность: Для любых объектов x, y и z, если x.equals(y) == true и y.equals(z) == true, то должно быть x.equals(z) == true.
//  Согласованность: Если два объекта x и y равны, то повторные вызовы x.equals(y) должны всегда возвращать одно и то же значение.
//  Невозвращение false для сравнения с null: Для любого объекта x, x.equals(null) должно возвращать false.