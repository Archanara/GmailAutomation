package uk.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;


public class GmailHomePage extends BasePage {


    @FindBy(how = How.ID, using = "link-signup")
    private WebElement signUpLink;

    public GmailHomePage(WebDriver webDriver) {
        super(webDriver);
    }

    public boolean isPageLoaded() {
        wait.until(visibilityOf(signUpLink));
        return true;
    }

    public void goToAccountCreatePage() {
        signUpLink.click();
    }
}
