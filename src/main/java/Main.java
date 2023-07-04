import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InputValidator inputValidator = new InputValidator();
        Check check = new Check();

        int persons = inputValidator.getPersonsAmount(new Scanner(System.in));
        do {
            Product product = inputValidator.getProduct(new Scanner(System.in));
            check.addProduct(product);
        } while (!inputValidator.stopFillingCheck(new Scanner(System.in)));
        check.showProducts();
        check.showSplittedAmount(persons);
    }
}