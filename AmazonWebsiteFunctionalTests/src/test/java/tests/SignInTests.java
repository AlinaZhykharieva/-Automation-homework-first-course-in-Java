package tests;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class SignInTests extends BaseTest {
    private String EXPECTED_ALERT_TEXT_UNDER_INPUT_EMAIL = "Enter your email or mobile phone number";

    @Test
    public void signInWithEmptyEmailInput() {
        getHomePage().clickSignInButtonInHeaderOnMainPage();
        getSignInPage().clickButtonContinueAfterInputEmailOnSignInPage();
        assertEquals(getSignInPage().getAlertTextUnderInputEmailWhenUserDoNotEnterEmailOrPhone(), EXPECTED_ALERT_TEXT_UNDER_INPUT_EMAIL);
    }
}
