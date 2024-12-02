//В Java переменная в конструкции switch может быть следующих типов:
//
//Примитивные целочисленные типы:
//byte, short, char, int
//Объектные типы-оболочки для целых чисел:
//Byte, Short, Character, Integer
//Перечисления (Enums):
//Типы, определённые с помощью enum.
//Строки (String):
//Поддерживаются начиная с Java 7.

public class SwitchExample {
    public static void main(String[] args) {
        // 1. Примитивные типы
        int number = 2;
        switch (number) {
            case 1:
                System.out.println("Примитивный int: 1");
                break;
            case 2:
                System.out.println("Примитивный int: 2");
                break;
            default:
                System.out.println("Примитивный int: другое значение");
        }

        // 2. Объектные типы
        Integer objNumber = 3;
        switch (objNumber) {
            case 1:
                System.out.println("Объект Integer: 1");
                break;
            case 3:
                System.out.println("Объект Integer: 3");
                break;
            default:
                System.out.println("Объект Integer: другое значение");
        }

        // 3. Перечисления (Enums)
        Day day = Day.MONDAY;
        switch (day) {
            case MONDAY:
                System.out.println("Перечисление Enum: Понедельник");
                break;
            case FRIDAY:
                System.out.println("Перечисление Enum: Пятница");
                break;
            default:
                System.out.println("Перечисление Enum: Другой день");
        }

        // 4. Строки
        String fruit = "Apple";
        switch (fruit) {
            case "Apple":
                System.out.println("Строка: Яблоко");
                break;
            case "Orange":
                System.out.println("Строка: Апельсин");
                break;
            default:
                System.out.println("Строка: Другое");
        }

        // 5. Использование switch-выражения (Java 14+)
        int result = switch (number) {
            case 1 -> 10;
            case 2 -> 20;
            case 3 -> 30;
            default -> 0;
        };
        System.out.println("Switch-выражение (Java 14+): результат = " + result);
    }

    // Определение перечисления
    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }
}
