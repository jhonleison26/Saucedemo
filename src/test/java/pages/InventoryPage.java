package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.Random;

public class InventoryPage extends BasePage {

    @FindBy(css = ".inventory_item")
    List<WebElement> products;

    @FindBy(css = ".shopping_cart_link")
    WebElement cartButton;

    public InventoryPage(WebDriver driver) {
        super(driver);
    }

    public void addRandomProductToCart() {
        Random rand = new Random();
        WebElement product = products.get(rand.nextInt(products.size()));
        product.findElement(org.openqa.selenium.By.tagName("button")).click();
    }

    public void addMultipleProductsToCart(int count) {
        for (int i = 0; i < count; i++) {
            products.get(i).findElement(org.openqa.selenium.By.tagName("button")).click();
        }
    }

    public void goToCart() {
        cartButton.click();
    }
}
