package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductBoysSocksPage extends BasePage {
    public ProductBoysSocksPage(WebDriver driver) {
        super(driver);

    }

    @FindBy(xpath = "//input[@id ='add-to-cart-button']")
    private WebElement buttonAddToCartOnProductBoysSocksPage;

    public void clickButtonAddToCartOnProductBoysSocksPage() {
        buttonAddToCartOnProductBoysSocksPage.click();
    }
}
