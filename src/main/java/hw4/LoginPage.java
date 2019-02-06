package hw4;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.page;

public class LoginPage extends BasePage {

    @FindBy(css = "#user-icon")
    private SelenideElement btnLogin;

    @FindBy(css = "#name")
    private SelenideElement fldLogin;

    @FindBy(css = "#password")
    private SelenideElement fldPassword;

    @FindBy(css = "#login-button")
    private SelenideElement btnEnter;

    public MainPage performLogin(String user, String pass) {
        btnLogin.click();
        fldLogin.sendKeys(user);
        fldPassword.sendKeys(pass);
        btnEnter.click();
        return page(MainPage.class);
    }

}
