package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class QuickViewAfterAddToCartPage extends BasePage {
    public QuickViewAfterAddToCartPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//span[@id = 'nav-cart-count']")
    private WebElement amountOfItemInCart;

    @FindBy(xpath = "//a[@id ='hlb-view-cart-announce']")
    private WebElement buttonCart;

    public Integer amountOfItemInCartWhenProductAdded() {
        return Integer.parseInt(amountOfItemInCart.getText());
    }

    public void clickOnButtonCart() {
        buttonCart.click();

    }
}
