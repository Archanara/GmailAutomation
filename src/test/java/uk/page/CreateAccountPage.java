package uk.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;


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

    @FindBy(how = How.ID, using = ":0")
    private WebElement bMonth;

    @FindBy(how = How.ID, using = ":1")
    private WebElement bMonthVal;

    @FindBy(how = How.ID, using = "BirthYear")
    private WebElement bYear;

    @FindBy(how = How.ID, using = ":d")
    private WebElement hGender;

    @FindBy(how = How.ID, using = ":e")
    private WebElement hGenderVal;

    @FindBy(how = How.ID, using = "RecoveryPhoneNumber")
    private WebElement rPhone;


    @FindBy(how = How.ID, using = "RecoveryPhoneNumber")
    private WebElement rEmail;

    @FindBy(how = How.ID, using = "SkipCaptcha")
    private WebElement sChkbox;

    @FindBy(how = How.ID, using = "TermsOfService")
    private WebElement termService;

    @FindBy(how = How.ID, using = "submitbutton")
    private WebElement submitBtn;

    public CreateAccountPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void enterDetails() {
        fName.sendKeys("Archana");
        lNAme.sendKeys("Rao");
        pWd.sendKeys("Password");
        confirmPwd.sendKeys("Password");
        bMonth.click();
        bMonthVal.click();

        bDay.sendKeys("18");
        bYear.sendKeys("1986");
        hGender.click();
        hGenderVal.click();

        rPhone.sendKeys("1234567892");
        sChkbox.click();
        termService.click();
    }

    public void clickNext() {
        submitBtn.click();
    }

    public boolean isUserNameErrVisible() {
        wait.until(ExpectedConditions.visibilityOf(By.id("errormsg_0_GmailAddress").findElement(driver)));
        return true;
    }
}
