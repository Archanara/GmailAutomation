package uk.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BasePage {

    protected WebDriverWait wait;

    protected WebDriver driver;

    public BasePage(WebDriver webDriver) {
        this.driver = webDriver;
        wait = new WebDriverWait(webDriver, 30);
        PageFactory.initElements(webDriver, this);
    }
}
