import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class InputValidator {

    public int getPersonsAmount(InputStream stream) {
        int personsAmount;
        while (true) {
            Scanner source = new Scanner(stream);
            System.out.println("На какое количество гостей нужно разделить счет?");
            if (source.hasNextInt()) {
                personsAmount = source.nextInt();
                if (personsAmount > 1) {
                    break;
                }
            }
            System.out.println("Количество гостей некорректно для подсчета. Пожалуйста введите корректное количество гостей.");
        }
        return personsAmount;
    }

    public Product getProduct(InputStream stream) {
        Product product = new Product();
        do {
            Scanner source = new Scanner(stream);
            System.out.println("Введите название товара:");
            if (source.hasNextLine()) {
                String productName = source.nextLine();
                if (!productName.isEmpty()) {
                    product.setName(productName);
                    break;
                }
            }
            System.out.println("При вводе названия товара произошла ошибка. Пожалуйста, введите название товара ещё раз.");
        } while (true);
        double price;
        do {
            Scanner source = new Scanner(stream);
            System.out.println("Введите цену товара, в формате \"рубли.копейки\":");
            if (source.hasNextDouble()) {
                price = source.nextDouble();
                if (price > 0) {
                    product.setPrice(price);
                    break;
                }
            }
            System.out.println("При вводе цены товара произошла ошибка. Пожалуйста, введите цену товара ещё раз.");
        } while (true);

        return product;
    }

    public boolean stopFillingCheck(InputStream stream) {
        String command;
        while (true) {
            Scanner source = new Scanner(stream);
            System.out.println("Для продолжения ввода товаров введите любой символ, для завершения введите команду \"Завершить\"");
            if (source.hasNextLine()) {
                command = source.nextLine();
                return command.equalsIgnoreCase("Завершить");
            }
            System.out.println("Произошла ошибка при работе программы. Повторите ввод, пожалуйста");
        }
    }
}
