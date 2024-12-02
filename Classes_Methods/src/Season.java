public enum Season {
    SPRING("Весна", 15),
    SUMMER("Лето", 30),
    AUTUMN("Осень", 10),
    WINTER("Зима", -5);

    private final String russianName; // Название сезона на русском
    private final int averageTemperature; // Средняя температура

    // Конструктор перечисления
    Season(String russianName, int averageTemperature) {
        this.russianName = russianName;
        this.averageTemperature = averageTemperature;
    }

    // Метод для получения русского названия сезона
    public String getRussianName() {
        return russianName;
    }

    // Метод для получения средней температуры
    public int getAverageTemperature() {
        return averageTemperature;
    }

    // Дополнительный метод для описания сезона
    public String describeSeason() {
        return "Сезон " + russianName + " со средней температурой " + averageTemperature + "°C.";
    }
}
