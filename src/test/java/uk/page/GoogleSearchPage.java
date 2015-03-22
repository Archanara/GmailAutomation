package uk.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;


public class GoogleSearchPage  extends BasePage{

    @FindBy(how = How.ID, using = "hplogo")
    private WebElement googleLogo;

    @FindBy(how = How.XPATH, using = "/html/body/div/div[3]/div[1]/div/div/div/div[1]/div[2]/a")
    private WebElement gmailLink;

    public GoogleSearchPage(WebDriver webDriver) {
       super(webDriver);
    }

    public GmailHomePage goToGmailHomePage() {
        gmailLink.click();
        wait.until(ExpectedConditions.titleContains("Gmail"));

        return new GmailHomePage(driver);
    }


    public boolean isPageLoaded() {
        wait.until(visibilityOf(googleLogo));
        return true;
    }
}
