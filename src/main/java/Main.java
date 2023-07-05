import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InputValidator inputValidator = new InputValidator();
        Check check = new Check();

        int persons = inputValidator.getPersonsAmount(System.in);
        do {
            Product product = inputValidator.getProduct(System.in);
            check.addProduct(product);
        } while (!inputValidator.stopFillingCheck(System.in));
        check.showProducts();
        check.showSplittedAmount(persons);
    }
}