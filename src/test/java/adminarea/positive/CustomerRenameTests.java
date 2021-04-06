package adminarea.positive;

import adminarea.core.BaseTest;
import org.testng.annotations.Test;
import pages.adminarea.AdminCustomerRename;
import pages.adminarea.AdminLogin;

public class CustomerRenameTests extends BaseTest {

    @Test
    public void customerRename() {
        AdminLogin.navigate();
        AdminLogin.login("admin", "parola123!");

        AdminCustomerRename.search("john@doe.com");
        AdminCustomerRename.rename("Johnie","Does");
        AdminCustomerRename.verifyAlertSuccessText("Success: You have modified customers!","Failed to change names");
    }
}
