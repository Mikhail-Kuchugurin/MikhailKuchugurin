package hw3;

import hw3.enums.PageTitles;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public abstract class BasePage {
    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void checkPageTitle(PageTitles pageTitles) {
        Assert.assertEquals(driver.getTitle(), pageTitles.pageTitle);
    }
}
