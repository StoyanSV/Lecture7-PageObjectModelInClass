package frontend;

import adminarea.core.BaseTest;
import org.testng.annotations.Test;
import pages.userarea.CustomerAddAndRemove;

public class AddAndRemoveItemInCart extends BaseTest {

    @Test
    public void addAndRemoveItem() {
        CustomerAddAndRemove.navigate();
        CustomerAddAndRemove.addItemToCart();
        CustomerAddAndRemove.removeItemFromCart();
        CustomerAddAndRemove.checkCartIsEmptyText("Your shopping cart is empty!","Something goes wrong!");
    }
}
