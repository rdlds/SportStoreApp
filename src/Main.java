import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Введите имя покупателя:");
            String name = scanner.nextLine();

            System.out.println("Введите возраст покупателя:");
            int age = Integer.parseInt(scanner.nextLine());

            if (age < 0) { // Проверяем отрицательное значение возраста
                throw new IllegalArgumentException("Возраст не может быть отрицательным.");
            }

            System.out.println("Введите email покупателя:");
            String email = scanner.nextLine();


            Customer customer = new Customer(name, age, email);
            System.out.println("Покупатель успешно создан: " + customer);

        } catch (NumberFormatException e) {
            System.out.println("Ошибка: возраст должен быть числом.");
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Произошла ошибка: " + e.getMessage());
        }
    }
}
