package hw1.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FramePage {
    private static WebDriver driver;

    @FindBy(xpath = "//img[@id='epam_logo']")
    private WebElement logo;

    public FramePage(WebDriver driver) {
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }

    public WebElement getLogo() {
        return logo;
    }

}
