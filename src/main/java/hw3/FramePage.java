package hw3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FramePage extends BasePage {
    @FindBy(xpath = "//img[@id='epam_logo']")
    public WebElement logo;

    public FramePage(WebDriver driver) {
        super(driver);
    }


}
