
import java.util.ArrayList;
import java.util.List;

public class RestaurantBilling {
    private final List<Double> itemTotals = new ArrayList<>();

    public void addItem(double price, int quantity) {
        if (price < 0 || quantity <= 0) {
            throw new IllegalArgumentException("Invalid price or quantity");
        }
        itemTotals.add(price * quantity);
    }

    public double calculateSubtotal() {
        double subtotal = 0;
        for (double amount : itemTotals) {
            subtotal += amount;
        }
        return subtotal;
    }

    public double calculateGST() {
        return calculateSubtotal() * 0.05;
    }

    public double calculateTotal() {
        return calculateSubtotal() + calculateGST();
    }

    public static void main(String[] args) {
        RestaurantBilling bill = new RestaurantBilling();
        bill.addItem(120, 2);
        bill.addItem(200, 1);

        System.out.println("Restaurant Ordering and Billing System");
        System.out.println("Subtotal: Rs. " + bill.calculateSubtotal());
        System.out.println("GST (5%): Rs. " + bill.calculateGST());
        System.out.println("Total: Rs. " + bill.calculateTotal());
    }
}