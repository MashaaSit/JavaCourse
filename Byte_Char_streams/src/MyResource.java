//Интерфейс AutoCloseable служит для того, чтобы объекты,
// которые требуют явного закрытия, могли автоматически освобождать свои ресурсы,
// когда они больше не нужны, например, при завершении работы программы или выходе из блока кода.
// Этот интерфейс реализует метод close(),
// который можно вызвать для освобождения ресурсов.
// Главным преимуществом является использование конструкции try-with-resources,
// которая позволяет автоматически закрывать объекты,
// реализующие этот интерфейс, когда блок кода завершает выполнение.



public class MyResource implements AutoCloseable {
    private String resourceName;

    public MyResource(String resourceName) {
        this.resourceName = resourceName;
        System.out.println("Ресурс " + resourceName + " открыт.");
    }

    @Override
    public void close() {
        System.out.println("Ресурс " + resourceName + " закрыт.");
    }

    public static void main(String[] args) {
        try (MyResource resource = new MyResource("MyFile")) {
            System.out.println("Используем ресурс " + resource.resourceName);
        } catch (Exception e) {
            System.out.println("Произошла ошибка: " + e.getMessage());
        }
    }
}