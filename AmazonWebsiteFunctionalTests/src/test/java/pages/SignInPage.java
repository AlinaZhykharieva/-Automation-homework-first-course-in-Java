package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends BasePage {
    public SignInPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@type = 'submit']")
    WebElement buttonContinueAfterInputEmailOnSignInPage;

    @FindBy(xpath = "//div[@id = 'auth-email-missing-alert']")
    WebElement alertTextUnderInputEmailWhenUserDoNotEnterEmailOrPhone;


    public void clickButtonContinueAfterInputEmailOnSignInPage() {
        buttonContinueAfterInputEmailOnSignInPage.click();
    }

    public String getAlertTextUnderInputEmailWhenUserDoNotEnterEmailOrPhone() {
        return alertTextUnderInputEmailWhenUserDoNotEnterEmailOrPhone.getText();
    }

}
