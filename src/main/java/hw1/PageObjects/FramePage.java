package hw1.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FramePage {
    @FindBy(xpath = "//img[@id='epam_logo']")
    public WebElement logo;
    private WebDriver driver;

    public FramePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }


}
