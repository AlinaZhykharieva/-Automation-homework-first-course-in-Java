package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class BabyActivityAndEntertainmentPage extends BasePage {
    public BabyActivityAndEntertainmentPage(WebDriver driver) {
        super(driver);
    }

    private Double LIMIT_MAX_FILTERED_PRICE = 5.;
    private Integer EXPECTED_AMOUNT_OF_FILTERED_PRODUCT_BY_BRAND_AND_AGE = 8;

    @FindBy(xpath = "//h2[@class = 'a-size-mini a-spacing-none a-color-base s-line-clamp-4']//a[contains(@href, \"American\" )]")
    private WebElement productOnBabyActivityAndEntertainmentPage;

    @FindBy(xpath = "//input[@id ='high-price']")
    private WebElement inputForEnterMaximumLimitOfPrice;


    @FindBy(xpath = "//span[@class='a-price-whole']")
    private List<WebElement> pricesFilteredProducts;

    @FindBy(xpath = "//li[@aria-label='American Baby Company']//a")
    private WebElement checkBoxInBrandsFilter;

    @FindBy(xpath = "//li[@aria-label='Birth to 3 Months']//a")
    private WebElement checkBoxInAgeFilter;

    @FindBy(xpath = "//div[@class='a-section a-spacing-medium']")
    private List<WebElement> filteredProductsByBrandsAdnAge;

    @FindBy(xpath = "//div[@class ='a-section a-spacing-small a-spacing-top-small']")
    private WebElement filterResultString;


    public void clickOnProductOnBabyActivityAndEntertainmentPage() {

        productOnBabyActivityAndEntertainmentPage.click();

    }

    public void sendMaximumLimitOfPrice() {
        inputForEnterMaximumLimitOfPrice.sendKeys("5", Keys.ENTER);
    }

    public List<WebElement> getPrisesFilteredProducts() {
        return pricesFilteredProducts;
    }

    public Boolean isThePriceOfFilteredProductsLessThanTheBoundingSizeOfTheValue() {
        boolean price = false;
        for (WebElement webElement : getPrisesFilteredProducts()) {
            if (Double.parseDouble(webElement.getText()) < LIMIT_MAX_FILTERED_PRICE) {
                price = true;
            }
        }
        return price;
    }

    public void clickItemInFilterByBrand() {
        checkBoxInBrandsFilter.click();
    }

    public void clickItemInFilterByAge() {
        checkBoxInAgeFilter.click();
    }

    public List<WebElement> getFilteredProductsByBrandsAdnAge() {
        return filteredProductsByBrandsAdnAge;
    }


    public Boolean isAmountOfFilteredProductsByPriceAndAgeEqualsFilterResult() {

        if (EXPECTED_AMOUNT_OF_FILTERED_PRODUCT_BY_BRAND_AND_AGE == Integer.parseInt(filterResultString.getText().substring(0, 1))) {
            return true;
        } else {
            return false;
        }
    }
}
