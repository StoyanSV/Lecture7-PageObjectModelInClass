package frontend;

import adminarea.core.BaseTest;
import org.testng.annotations.Test;
import pages.userarea.UserRegistration;

public class UserRegisterTests extends BaseTest {

    @Test
    public void successfulRegistration(){
        UserRegistration.navigate();

        UserRegistration.registration("john2","doe2","john2@doe.com","01020304","123!","123!");

        UserRegistration.verifySuccessfulRegistrationText("Your Account Has Been Created!","Your registration failed!");

    }
}
