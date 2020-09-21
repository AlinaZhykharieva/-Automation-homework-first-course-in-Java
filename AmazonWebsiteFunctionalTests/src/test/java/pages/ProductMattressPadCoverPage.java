package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductMattressPadCoverPage extends BasePage {
    public ProductMattressPadCoverPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@id ='add-to-cart-button']")
    private WebElement buttonAddToCartInProductMattressPadCoverPage;

    @FindBy(xpath = "//button[@id = 'a-autoid-12-announce']")
    private WebElement buttonUnavailableSize;


    @FindBy(xpath = "//div[@id ='availability']/span[@class='a-size-medium a-color-state']")
    private WebElement stringWhereTheAvailabilityOfTheProductIsIndicated;


    public WebElement getStringWhereTheAvailabilityOfTheProductIsIndicated(){
        return stringWhereTheAvailabilityOfTheProductIsIndicated;
    }

    public void clickButtonAddToCartInProductMattressPadCoverPage() {
        buttonAddToCartInProductMattressPadCoverPage.click();
    }

    public void clickButtonUnavailableSize() {
        buttonUnavailableSize.click();
    }

    public String getTextFromStringWhereTheAvailabilityOfTheProductIsIndicated() {
        return stringWhereTheAvailabilityOfTheProductIsIndicated.getText();
    }


}
