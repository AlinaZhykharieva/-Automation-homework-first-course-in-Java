package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductFiltersTest extends BaseTest {

    private Double LIMIT_MAX_FILTERED_PRICE = 5.;

    @Test
    public void checkProductFilterByPrice() {
        getHomePage().clickBurgerMenuNavigationButton();
        getBasePage().waitForVisibilityMenuItemBaby(20, getHomePage().getMenuItemBaby());
        getHomePage().clickONMenuButtonBaby();
        getBasePage().waitForVisibilitySubMenuItemActivityAndEntertainment(20, getHomePage().getSubMenuItemActivityAndEntertainment());
        getHomePage().clickOnSubMenuItemActivityAndEntertainment();
        getBasePage().waitForPageReadyState(20);
        getBabyActivityAndEntertainmentPage().sendMaximumLimitOfPrice();
        getBasePage().implicitWait(10);
        Assert.assertTrue(getBabyActivityAndEntertainmentPage().isThePriceOfFilteredProductsLessThanTheBoundingSizeOfTheValue());

    }

    @Test
    public void checkProductFiltersByBrandsAndAge() {
        getHomePage().clickBurgerMenuNavigationButton();
        getBasePage().waitForVisibilityMenuItemBaby(20, getHomePage().getMenuItemBaby());
        getHomePage().clickONMenuButtonBaby();
        getBasePage().waitForVisibilitySubMenuItemActivityAndEntertainment(20, getHomePage().getSubMenuItemActivityAndEntertainment());
        getHomePage().clickOnSubMenuItemActivityAndEntertainment();
        getBasePage().waitForPageReadyState(10);
        getBabyActivityAndEntertainmentPage().clickItemInFilterByBrand();
        getBasePage().waitForPageReadyState(20);
        getBabyActivityAndEntertainmentPage().clickItemInFilterByAge();
        getBasePage().implicitWait(10);
        Assert.assertTrue(getBabyActivityAndEntertainmentPage().isAmountOfFilteredProductsByPriceAndAgeEqualsFilterResult());

    }
}
