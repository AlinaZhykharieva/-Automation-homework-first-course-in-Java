package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage {
    public CartPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//span[@id = 'sc-subtotal-amount-buybox']/span[@class ='a-size-medium a-color-base sc-price sc-white-space-nowrap']")
    private WebElement subTotalToPayInCart;

    @FindBy(xpath = "//input[@aria-label = 'Delete American Baby Company Waterproof Fitted Crib and Toddler Protective Mattress Pad Cover, White (1 Count), for Boys and Girls']")
    private WebElement buttonDeleteProductFromCart;

    @FindBy(xpath = "//div[@class ='a-row sc-your-amazon-cart-is-empty']/h2")
    private WebElement stringWithMassageThatCartIsEmpty;

    public Double subtotalToPayInCArtWhenItemAdded() {
        return Double.parseDouble(subTotalToPayInCart.getText().substring(1));
    }

    public void clickButtonDeleteProductFromCart() {
        buttonDeleteProductFromCart.click();
    }

    public String getStringWithMassageThatCartIsEmpty() {
        return stringWithMassageThatCartIsEmpty.getText();
    }
}
