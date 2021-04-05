package pages.userarea;

import org.openqa.selenium.By;
import org.testng.Assert;
import utils.Browser;

import static utils.Browser.driver;

public class UserRegistration {


    /**
     * Invoking this method will navigate you to the user area of the project
     */
    public static void navigate() {
        driver.get("http://shop.pragmatic.bg/index.php?route=account/register");
    }

    /**
     * This method register new user with provided parameters.
     * @param firstname First name of user you want to register
     * @param lastname Last name of user you want to register
     * @param email E-mail of user you want to register
     * @param telephone Telephone number of user
     * @param password Password of user you want to register(minimum 4 characters!)
     * @param confirmpassword Confirm password (must be same with password)
     */
    public static void registration(String firstname, String lastname, String email, String telephone, String password, String confirmpassword) {
        driver.findElement(By.id("input-firstname")).sendKeys(firstname);
        driver.findElement(By.id("input-lastname")).sendKeys(lastname);
        driver.findElement(By.id("input-email")).sendKeys(email);
        driver.findElement(By.id("input-telephone")).sendKeys(telephone);
        driver.findElement(By.id("input-password")).sendKeys(password);
        driver.findElement(By.id("input-confirm")).sendKeys(confirmpassword);

        driver.findElement(By.xpath("//input[@name='agree']")).click();
        driver.findElement(By.cssSelector(".btn-primary")).click();
    }
    /**
     * Asserts the heading in successful registration page that it
     * equals the provided as parameter text
     *
     * @param expectedHeader the expected successful register heading text
     * @param errorMsg the message that will appear in your test reports in case of failure
     */
    public static void verifySuccessfulRegistrationText(String expectedHeader, String errorMsg) {
        String actualHeader = driver.findElement(By.cssSelector("#content > h1")).getText();

        Assert.assertTrue(actualHeader.contains(expectedHeader), errorMsg);
    }
}
