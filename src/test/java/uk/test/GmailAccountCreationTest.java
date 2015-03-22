package uk.test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import uk.page.CreateAccountPage;
import uk.page.GmailHomePage;
import uk.page.GoogleSearchPage;


public class GmailAccountCreationTest {

    static WebDriver driver;

    @BeforeClass
    public static void setup() {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
    }

    @AfterClass
    public static void cleanup() {
        driver.quit();
    }

    @Test
    public void shouldNavigateToCreateAccountPageAndValidateAccountCreationWithoutUsername() throws InterruptedException {
        driver.navigate().to("https://www.google.co.uk/?gws_rd=ssl");

        GoogleSearchPage googleSearchPage = new GoogleSearchPage(driver);
        assert googleSearchPage.isPageLoaded();
        GmailHomePage gmailHomePage = googleSearchPage.goToGmailHomePage();
        assert gmailHomePage.isPageLoaded();
        gmailHomePage.goToAccountCreatePage();
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        createAccountPage.enterDetails();
        createAccountPage.clickNext();
        assert createAccountPage.isUserNameErrVisible();
    }

}
