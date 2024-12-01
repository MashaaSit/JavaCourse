import java.util.Formatter;
import java.util.Date;

public class DateFormatterExample {
    public static void main(String[] args) {
        // Создание объекта Formatter
        Formatter formatter = new Formatter();

        // Текущая дата и время
        Date currentDate = new Date();

        // Использование различных спецификаторов формата

        // %tH — Час (00–23)
        formatter.format("Час (24-часовой формат): %tH%n", currentDate);

        // %tM — Минуты как десятичное целое (00–59)
        formatter.format("Минуты: %tM%n", currentDate);

        // %tS — Секунды как десятичное целое (00–59)
        formatter.format("Секунды: %tS%n", currentDate);

        // %tB — Полное название месяца (например, «январь»)
        formatter.format("Месяц: %tB%n", currentDate);

        // %tA — Полное название дня недели (например, «пятница»)
        formatter.format("День недели: %tA%n", currentDate);

        // Вывод форматированного текста
        System.out.println(formatter.toString());

        // Закрытие объекта Formatter
        formatter.close();
    }
}