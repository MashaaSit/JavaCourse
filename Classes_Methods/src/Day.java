public enum Day {
    MONDAY("Начало недели"),
    TUESDAY("Рабочий день"),
    WEDNESDAY("Рабочий день"),
    THURSDAY("Рабочий день"),
    FRIDAY("Пятница, почти выходной"),
    SATURDAY("Выходной"),
    SUNDAY("Выходной");

    private final String description; // Описание дня

    // Конструктор перечисления
    Day(String description) {
        this.description = description;
    }
}
