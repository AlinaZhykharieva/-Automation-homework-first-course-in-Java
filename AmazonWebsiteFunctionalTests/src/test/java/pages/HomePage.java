package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[@id ='nav-link-accountList']")
    private WebElement signInButtonInHeader;

    @FindBy(xpath = "//input[@id = 'twotabsearchtextbox']")
    private WebElement searchInputInHeader;

    @FindBy(xpath = "//a[@class= 'a-link-normal center-image aok-block image-window']//img[@alt='Electronics']")
    private WebElement electronicsBlockOnHomePage;

    @FindBy(xpath = "//a[@id ='nav-hamburger-menu']")
    private WebElement burgerMenuNavigationButton;

    @FindBy(xpath = "//a[@class ='hmenu-item']/div[contains(string(), \"Baby\" )]")
    private WebElement menuItemBaby;

    @FindBy(xpath = "//a[contains(string(), \"Activity & Entertainment\" )]")
    private WebElement subMenuItemActivityAndEntertainment;

    @FindBy(xpath = "//select")
    private WebElement selectSearchDropDownBox;

    @FindBy(xpath = "//option[@value='search-alias=fashion-boys-intl-ship']")
    private WebElement optionFromDropDownBox;

    @FindBy(xpath = "//input[@value='Go']")
    private WebElement buttonForSearch;


    public void clickSignInButtonInHeaderOnMainPage() {
        signInButtonInHeader.click();
    }

    public void searchByKeyword(String keyword) {
        searchInputInHeader.sendKeys(keyword, Keys.ENTER);
    }

    public void clickOnlElectronicsBlockOnHomePage() {
        electronicsBlockOnHomePage.click();
    }

    public void clickBurgerMenuNavigationButton() {
        burgerMenuNavigationButton.click();

    }

    public void clickONMenuButtonBaby() {

        menuItemBaby.click();
    }

    public void clickOnSubMenuItemActivityAndEntertainment() {
        subMenuItemActivityAndEntertainment.click();

    }

    public void selectItemFromDropdownBoxInSearch() {
        selectSearchDropDownBox.click();
        optionFromDropDownBox.click();
    }

    public void clickButtonForSearch() {
        buttonForSearch.click();
    }

    public WebElement getMenuItemBaby() {
        return menuItemBaby;
    }

    public WebElement getSubMenuItemActivityAndEntertainment() {
        return subMenuItemActivityAndEntertainment;
    }

}
