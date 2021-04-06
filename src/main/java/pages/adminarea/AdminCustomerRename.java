package pages.adminarea;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static utils.Browser.driver;

public class AdminCustomerRename {

    /**
     * This method navigates from admin Dashboard to Customers section.
     * Then filter for customer by e-mail.
     * @param email search for customer by e-mail(unique value)
     */
    public static void search(String email) {
        driver.findElement(By.cssSelector("#menu-customer > a")).click();
        driver.findElement(By.cssSelector("#collapse5 > li:nth-of-type(1)")).click();
        driver.findElement(By.id("input-email")).sendKeys(email);
        driver.findElement(By.id("button-filter")).click();



    }

    /**
     * This method click EDIT button. Then cleans the fields of first and last name of customer.
     * After that fills the new values in the name fields.
     * and then
     * @param firstname Put the new First name here.
     * @param lastname  Put the new Last name here.
     */
    public static void rename(String firstname, String lastname) {

        driver.findElement(By.cssSelector(".fa-pencil")).click();
        driver.findElement(By.id("input-firstname")).clear();
        driver.findElement(By.id("input-firstname")).sendKeys(firstname);
        driver.findElement(By.id("input-lastname")).clear();
        driver.findElement(By.id("input-lastname")).sendKeys(lastname);

        driver.findElement(By.cssSelector(".pull-right .btn-primary")).click();
    }

    /**
     * This method verifies the text for successful editing of user names.
     */
    public static void verifyAlertSuccessText(String expectedText, String failureTextMsg) {
        String actualText = driver.findElement(By.cssSelector("div.alert-success")).getText();
        Assert.assertTrue(actualText.contains(expectedText),failureTextMsg);
    }
}
