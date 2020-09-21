package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductNintendoPage extends BasePage {
    public ProductNintendoPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@id = 'add-to-cart-button-ubb']")
    private WebElement addToCartButtonOnProductNintendoPage;


    public void clickAddToCartButtonOnProductNintendoPage() {
        addToCartButtonOnProductNintendoPage.click();
    }
}
