package tests;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;


public class SearchTests extends BaseTest {

    private String SEARCH_KEYWORD = "Crayola broad line markers";
    private String EXPECTED_SEARCH_QUERY = "fashion-boys";

    @Test
    public void checkThatSearchResultsContainsSearchWord() {
        getHomePage().searchByKeyword(SEARCH_KEYWORD);
        getBasePage().waitForPageReadyState(60);
        for (WebElement webElement : getSearchResultsPage().getSearchResultsList()) {
            assertTrue(webElement.getText().contains(SEARCH_KEYWORD));
        }
    }

    @Test
    void checkThatURlContainsWordSelectedInDropdownListInSearch() {
        getHomePage().selectItemFromDropdownBoxInSearch();
        getHomePage().clickButtonForSearch();
        getBasePage().waitForPageReadyState(10);
        assertTrue(getDriver().getCurrentUrl().contains(EXPECTED_SEARCH_QUERY));

    }
}
