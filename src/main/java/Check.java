import java.util.ArrayList;

public class Check {
    ArrayList<String> products = new ArrayList<>();
    double totalAmount;

    public double getTotalAmount() {
        return totalAmount;
    }

     public void addProduct(Product product) {
        totalAmount += product.getPrice();
        products.add(product.getName());
        System.out.println("Товар успешно добавлен.");
     }

     public void showProducts() {
        for(int i = 0; i < products.size(); i++) {
            System.out.println("Добавленные товары: ");
            System.out.println(products.get(i));
        }
     }

     public void showSplittedAmount(int personAmount) {
        double amountPerPerson = totalAmount / personAmount;
        String currencyLabel;
        switch ((int) Math.floor(amountPerPerson)) {
            case 1:
                currencyLabel = "рубль";
                break;
            case 2, 3, 4:
                currencyLabel = "рубля";
                break;
            default:
                currencyLabel = "рублей";
                break;
        }
        System.out.printf("%.2f " + currencyLabel + "с каждого гостя", amountPerPerson);
     }
}
