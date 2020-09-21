package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import pages.*;

public class BaseTest {
    private WebDriver driver;
    private static final String AMAZON_URL = "https://www.amazon.com/";

    @BeforeTest
    public void profilesSetUp() {
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
    }

    @BeforeMethod
    public void testsSetUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(AMAZON_URL);

    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }

    public WebDriver getDriver() {
        return driver;
    }

    public BasePage getBasePage() {
        return new BasePage(getDriver());
    }

    public HomePage getHomePage() {
        return new HomePage(getDriver());
    }

    public SignInPage getSignInPage() {
        return new SignInPage(getDriver());
    }

    public SearchResultsPage getSearchResultsPage() {
        return new SearchResultsPage(getDriver());
    }

    public ElectronicsPage getElectronicsPage() {
        return new ElectronicsPage(getDriver());
    }

    public ProductNintendoPage getProductNintendoPage() {
        return new ProductNintendoPage(getDriver());
    }

    public QuickViewAfterAddToCartPage getQuickViewAfterAddToCartPage() {
        return new QuickViewAfterAddToCartPage(getDriver());
    }

    public BabyActivityAndEntertainmentPage getBabyActivityAndEntertainmentPage() {
        return new BabyActivityAndEntertainmentPage(getDriver());

    }

    public CartPage getCartPage() {
        return new CartPage(getDriver());

    }

    public ProductMattressPadCoverPage getProductMattressPadCoverPage() {
        return new ProductMattressPadCoverPage(getDriver());
    }

    public BoysFashionPage getBoysFashionPage() {
        return new BoysFashionPage(getDriver());
    }

    public BoysClothingPage getBoysClothingPage() {
        return new BoysClothingPage(getDriver());
    }

    public ProductBoysSocksPage getProductBoysSocksPage() {
        return new ProductBoysSocksPage(getDriver());
    }
}
