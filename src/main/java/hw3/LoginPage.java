package hw3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    private WebDriver driver;


    @FindBy(xpath = "//img[@id='user-icon']")
    private WebElement btnLogin;

    @FindBy(id = "name")
    private WebElement fldLogin;

    @FindBy(id = "password")
    private WebElement fldPassword;

    @FindBy(xpath = "//span[contains(text(),'Enter')]")
    private WebElement btnEnter;


    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public MainPage performLogin(String user, String pass) {
        btnLogin.click();
        fldLogin.sendKeys(user);
        fldPassword.sendKeys(pass);
        btnEnter.click();
        return new MainPage(driver);
    }

}
