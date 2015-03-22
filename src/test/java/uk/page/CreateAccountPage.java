package uk.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by vrk on 3/22/2015.
 */
public class CreateAccountPage extends BasePage {





    @FindBy(how = How.ID, using = "FirstName")
    private WebElement fName;



    @FindBy(how = How.ID, using = "LastName")
    private WebElement lNAme;

    @FindBy(how = How.ID, using = "GmailAddress")
    private WebElement eAddress;

    @FindBy(how = How.ID, using = "Passwd")
    private WebElement pWd;

    @FindBy(how = How.ID, using = "PasswdAgain")
    private WebElement confirmPwd;

    @FindBy(how = How.ID, using = "BirthDay")
    private WebElement bDay;

    @FindBy(how = How.ID, using = "HiddenGender")
    private WebElement hGender;



    @FindBy(how = How.ID, using = "RecoveryPhoneNumber")
    private WebElement rPhone;


    @FindBy(how = How.ID, using = "RecoveryPhoneNumber")
    private WebElement rEmail;


    @FindBy(how = How.ID, using = "SkipCaptcha")
    private WebElement sChkbox;


    @FindBy(how = How.ID, using = "TermsOfService")
    private WebElement termService;

    public CreateAccountPage ( WebDriver webDriver) {
        super(webDriver);


    }

public void enterDetails(){

    fName.sendKeys("Archana");
    lNAme.sendKeys("Rao");
    pWd.sendKeys("Password");
    confirmPwd.sendKeys("Pasword");
    bDay.sendKeys("18");
    hGender.click();
    rPhone.sendKeys();




}

public boolean isUserNameErrVisible()
{
wait.until(ExpectedConditions.visibilityOf(By.id("").findElement(driver)));
    return true;
}
}
