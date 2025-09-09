package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import pages.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PurchaseTest {
    WebDriver driver;
    LoginPage loginPage;
    InventoryPage inventoryPage;
    CartPage cartPage;
    CheckoutPage checkoutPage;
    CheckoutCompletePage completePage;

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        loginPage = new LoginPage(driver);
        inventoryPage = new InventoryPage(driver);
        cartPage = new CartPage(driver);
        checkoutPage = new CheckoutPage(driver);
        completePage = new CheckoutCompletePage(driver);
        loginPage.login("standard_user", "secret_sauce");
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void shouldCompletePurchaseFlowSuccessfully() {
        inventoryPage.addRandomProductToCart(); // debe usar selección aleatoria
        inventoryPage.goToCart();
        cartPage.checkout();
        checkoutPage.fillPersonalDataAndContinue("Jhon", "Olivares", "12345");
        checkoutPage.finishPurchase();
        Assert.assertTrue(completePage.isThankYouPageDisplayed(), "Thank you page not displayed!");
    }
}
