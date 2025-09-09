package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CartPage extends BasePage {

    @FindBy(css = ".cart_item")
    List<WebElement> cartItems;

    @FindBy(css = ".cart_button")
    List<WebElement> removeButtons;

    @FindBy(id = "checkout")
    WebElement checkoutButton;

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public int getCartItemsCount() {
        return cartItems.size();
    }

    public void removeAllItems() {
        for (WebElement btn : removeButtons) {
            btn.click();
        }
    }

    public void checkout() {
        checkoutButton.click();
    }
}
