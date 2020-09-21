package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BoysFashionPage extends BasePage {
    public BoysFashionPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[@aria-label ='CLOTHING']")
    private WebElement linkBoysClothing;

    public void clickOnLinkBoysClothing() {
        linkBoysClothing.click();
    }
}
