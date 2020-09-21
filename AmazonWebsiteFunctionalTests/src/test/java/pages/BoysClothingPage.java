package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BoysClothingPage extends BasePage {
    public BoysClothingPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@class='a-row']//a[contains(@href,\"Fruit-Loom-Little-10-Pair-Cushion\")]")
    private WebElement productOnBoysClothingPage;

    public void clickOnProductOnBoysClothingPage() {
        productOnBoysClothingPage.click();
    }
}
