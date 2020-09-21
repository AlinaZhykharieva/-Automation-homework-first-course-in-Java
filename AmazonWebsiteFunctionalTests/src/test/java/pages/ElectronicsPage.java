package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElectronicsPage extends BasePage {
    public ElectronicsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[@class = 'a-link-normal a-text-normal']//img[contains(@alt ,'Nintendo')]")
    private WebElement productNintendoOnElectronicsPage;


    public void clickProductNintendoOnElectronicsPage() {
        productNintendoOnElectronicsPage.click();
    }
}
