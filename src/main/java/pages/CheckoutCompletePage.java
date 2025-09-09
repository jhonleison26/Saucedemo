package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutCompletePage extends BasePage {

    @FindBy(css = ".complete-header")
    WebElement completeHeader;

    public CheckoutCompletePage(WebDriver driver) {
        super(driver);
    }

    public boolean isThankYouPageDisplayed() {
        return completeHeader.isDisplayed() && completeHeader.getText().contains("Thank you for your order");
    }
}