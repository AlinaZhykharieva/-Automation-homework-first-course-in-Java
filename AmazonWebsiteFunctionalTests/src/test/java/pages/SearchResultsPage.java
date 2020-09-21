package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchResultsPage extends BasePage {
    public SearchResultsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[@class= 'a-link-normal a-text-normal']")
    private List<WebElement> searchResultsProductsListText;


    public List<WebElement> getSearchResultsList() {
        return searchResultsProductsListText;
    }

}
