import java.util.Scanner;

public class InputValidator {

    public int getPersonsAmount(Scanner source) {
        int personsAmount;
        while (true) {
            System.out.println("На какое количество гостей нужно разделить счет?");
            if (source.hasNextInt()) {
                personsAmount = source.nextInt();
                if (personsAmount > 1) {
                    break;
                }
            }
            try {
                source.nextLine();
            } finally {
                System.out.println("Количество гостей некорректно для подсчета. Пожалуйста введите корректное количество гостей.");
            }
        }
        return personsAmount;
    }

    public Product getProduct(Scanner source) {
        Product product = new Product();
        do {
            System.out.println("Введите название товара:");
            if (source.hasNextLine()) {
                product.setName(source.nextLine());
                break;
            }
            try {
                source.nextLine();
            } finally {
                System.out.println("При вводе названия товара произошла ошибка. Пожалуйста, введите название товара ещё раз.");
            }
        } while (true);
        double price;
        do {
            System.out.println("Введите цену товара, в формате \"рубли.копейки\":");
            if (source.hasNextDouble()) {
                price = source.nextDouble();
                if (price > 0) {
                    product.setPrice(price);
                    break;
                }
            }
            try {
                source.nextLine();
            } finally {
                System.out.println("При вводе цены товара произошла ошибка. Пожалуйста, введите цену товара ещё раз.");
            }
        } while (true);

        return product;
    }

    public boolean stopFillingCheck(Scanner source) {
        String command;
        while (true) {
            System.out.println("Для продолжения ввода товаров введите любой символ, для завершения введите команду \"Завершить\"");
            if (source.hasNextLine()) {
                command = source.nextLine();
                return command.equalsIgnoreCase("Завершить");
            }
            try {
                source.nextLine();
            } finally {
                System.out.println("Произошла ошибка при работе программы. Повторите ввод, пожалуйста");
            }
        }
    }
}
