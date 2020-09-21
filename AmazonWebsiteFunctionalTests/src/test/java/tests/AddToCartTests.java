package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class AddToCartTests extends BaseTest {

    private Integer EXPECTED_AMOUNT_ITEM_ADDED_TO_CART = 1;

    private Double EXPECTED_SUBTOTAL_IN_CART = 14.0;

    private String EXPECTED_STRING_WHEN_UNAVAILABLE_PRODUCT_SELECTED = "Usually ships within 2 to 4 weeks.";

    private String EXPECTED_STRING_MASSAGE_WHEN_PRODUCT_DELETE_FROM_CART = "Your Amazon Cart is empty";
    private String TITLE_OF_CART_PAGE = "Amazon.com Shopping Cart";

    @Test
    public void checkAmountItemAddedToCart() {
        getHomePage().clickOnlElectronicsBlockOnHomePage();
        getElectronicsPage().clickProductNintendoOnElectronicsPage();
        getProductNintendoPage().clickAddToCartButtonOnProductNintendoPage();
        getBasePage().waitForPageReadyState(10);
        Assert.assertEquals(getQuickViewAfterAddToCartPage().amountOfItemInCartWhenProductAdded(), EXPECTED_AMOUNT_ITEM_ADDED_TO_CART);
    }

    @Test
    public void checkThatSubtotalToPayItemAddedToCartEqualsPriceThisItem() {

        getHomePage().clickBurgerMenuNavigationButton();
        getBasePage().waitForVisibilityMenuItemBaby(20, getHomePage().getMenuItemBaby());
        getHomePage().clickONMenuButtonBaby();
        getBasePage().waitForVisibilitySubMenuItemActivityAndEntertainment(20, getHomePage().getSubMenuItemActivityAndEntertainment());
        getHomePage().clickOnSubMenuItemActivityAndEntertainment();
        getBasePage().waitForPageReadyState(10);
        getBabyActivityAndEntertainmentPage().clickOnProductOnBabyActivityAndEntertainmentPage();
        getBasePage().waitForPageReadyState(10);
        getProductMattressPadCoverPage().clickButtonAddToCartInProductMattressPadCoverPage();
        getBasePage().waitForPageReadyState(10);
        getQuickViewAfterAddToCartPage().clickOnButtonCart();
        getBasePage().waitForPageReadyState(10);
        assertEquals(getCartPage().subtotalToPayInCArtWhenItemAdded(), EXPECTED_SUBTOTAL_IN_CART);

    }

    @Test
    public void checkThatWhenUnavailableProductSelectedInDescriptionOfProductAppearsInscription() {
        getHomePage().clickBurgerMenuNavigationButton();
        getBasePage().waitForVisibilityMenuItemBaby(20, getHomePage().getMenuItemBaby());
        getHomePage().clickONMenuButtonBaby();
        getBasePage().waitForVisibilitySubMenuItemActivityAndEntertainment(20, getHomePage().getSubMenuItemActivityAndEntertainment());
        getHomePage().clickOnSubMenuItemActivityAndEntertainment();
        getBasePage().waitForPageReadyState(30);
        getBabyActivityAndEntertainmentPage().clickOnProductOnBabyActivityAndEntertainmentPage();
        getBasePage().implicitWait(30);
        getProductMattressPadCoverPage().clickButtonUnavailableSize();
        getBasePage().waitForVisibilityStringWhereTheAvailabilityOfTheProductIsIndicated(10,getProductMattressPadCoverPage().getStringWhereTheAvailabilityOfTheProductIsIndicated());
        assertTrue(getProductMattressPadCoverPage().getTextFromStringWhereTheAvailabilityOfTheProductIsIndicated().contains(EXPECTED_STRING_WHEN_UNAVAILABLE_PRODUCT_SELECTED));
    }

    @Test
    public void checkDeletionProductFromCart() {
        getHomePage().clickBurgerMenuNavigationButton();
        getBasePage().waitForVisibilityMenuItemBaby(20, getHomePage().getMenuItemBaby());
        getHomePage().clickONMenuButtonBaby();
        getBasePage().waitForVisibilitySubMenuItemActivityAndEntertainment(20, getHomePage().getSubMenuItemActivityAndEntertainment());
        getHomePage().clickOnSubMenuItemActivityAndEntertainment();
        getBasePage().waitForPageReadyState(10);
        getBabyActivityAndEntertainmentPage().clickOnProductOnBabyActivityAndEntertainmentPage();
        getProductMattressPadCoverPage().clickButtonAddToCartInProductMattressPadCoverPage();
        getBasePage().waitForPageReadyState(10);
        getQuickViewAfterAddToCartPage().clickOnButtonCart();
        getCartPage().clickButtonDeleteProductFromCart();
        getBasePage().implicitWait(20);
        Assert.assertEquals(getCartPage().getStringWithMassageThatCartIsEmpty(), EXPECTED_STRING_MASSAGE_WHEN_PRODUCT_DELETE_FROM_CART);
    }

    @Test
    public void checkThatWhenProductSizeDoesNotSelectedAndAddToCartButtonClickedNoTransitionToTheQuickViewAfterAddToCartPage() {
        getHomePage().selectItemFromDropdownBoxInSearch();
        getHomePage().clickButtonForSearch();
        getBoysFashionPage().clickOnLinkBoysClothing();
        getBoysClothingPage().clickOnProductOnBoysClothingPage();
        getProductBoysSocksPage().clickButtonAddToCartOnProductBoysSocksPage();
        Assert.assertFalse(getDriver().getTitle().contains(TITLE_OF_CART_PAGE));


    }
}
