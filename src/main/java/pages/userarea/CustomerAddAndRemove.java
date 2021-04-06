package pages.userarea;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import static utils.Browser.driver;

public class CustomerAddAndRemove {
    

    public static void navigate() {
        driver.get("http://shop.pragmatic.bg/");
    }

    /**
     * This method add item "Iphone" to cart from front page.
     * Then enters in the cart.
     */
    public static void addItemToCart() {
        driver.findElement(By.cssSelector(".row > div:nth-of-type(2) .hidden-md")).click();
        driver.findElement(By.id("cart-total")).click();
        driver.findElement(By.cssSelector(".text-right > a:nth-of-type(1)")).click();
    }

    /**
     * This method remove the item from cart with REMOVE button.
     */
    public static void removeItemFromCart() {
        driver.findElement(By.cssSelector(".input-group-btn .btn-danger")).click();

    }

    /**
     * This method verifies the text that tells us that cart is empty.
     */
    public static void checkCartIsEmptyText(String expectedEmptyCartMsg, String msgOnFailure) {

        String actualEmptyCartMsg = driver.findElement(By.cssSelector("#content > p")).getText();
        Assert.assertTrue(actualEmptyCartMsg.contains(expectedEmptyCartMsg), msgOnFailure);


    }
}
