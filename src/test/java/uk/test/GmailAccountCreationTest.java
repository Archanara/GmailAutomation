package uk.test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import uk.page.CreateAccountPage;
import uk.page.GmailHomePage;
import uk.page.GoogleSearchPage;

import java.io.File;
import java.net.URISyntaxException;

public class GmailAccountCreationTest {

    static WebDriver driver;

    @BeforeClass
    public static void setup() {

//        try {
//            System.setProperty("webdriver.chrome.driver", new File(ClassLoader.getSystemResource("driver/chrome/windows/chromedriver.exe").toURI()).getAbsolutePath());
//        } catch (URISyntaxException e) {
//            e.printStackTrace();
//        }


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

        assert createAccountPage.isUserNameErrVisible();



    }

}
