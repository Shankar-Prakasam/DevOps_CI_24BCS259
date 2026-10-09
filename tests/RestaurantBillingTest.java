
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RestaurantBillingTest {

    @Test
    void testSubtotal() {
        RestaurantBilling bill = new RestaurantBilling();
        bill.addItem(120, 2);
        bill.addItem(200, 1);

        assertEquals(440.0, bill.calculateSubtotal(), 0.001);
    }

    @Test
    void testGST() {
        RestaurantBilling bill = new RestaurantBilling();
        bill.addItem(200, 1);

        assertEquals(10.0, bill.calculateGST(), 0.001);
    }

    @Test
    void testTotal() {
        RestaurantBilling bill = new RestaurantBilling();
        bill.addItem(200, 1);

        assertEquals(210.0, bill.calculateTotal(), 0.001);
    }

    @Test
    void testInvalidQuantity() {
        RestaurantBilling bill = new RestaurantBilling();

        assertThrows(
            IllegalArgumentException.class,
            () -> bill.addItem(100, 0)
        );
    }
}