package hw4;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import static com.codeborne.selenide.Selenide.*;


public class BeforeAndAfter {
    protected LoginPage loginPage;


    @BeforeSuite
    public void setParams() {
        //1 Run browser and open test site
        Configuration.startMaximized = true;
        Configuration.timeout = 5000;
        Configuration.pollingInterval = 500;
        open("https://epam.github.io/JDI/");
        loginPage = page(LoginPage.class);

    }

    @AfterSuite
    public void closeBrowser() {
        //17 close browser
        close();
    }

}
