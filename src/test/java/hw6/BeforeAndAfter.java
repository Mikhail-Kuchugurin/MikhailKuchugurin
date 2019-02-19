package hw6;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static com.codeborne.selenide.Selenide.clearBrowserCookies;
import static com.codeborne.selenide.Selenide.close;


public class BeforeAndAfter {

    @BeforeMethod
    public void setParams() {
        //1 Run browser and open test site
        Configuration.startMaximized = true;
        Configuration.timeout = 5000;
        Configuration.pollingInterval = 500;
    }

    @AfterMethod
    public void closeBrowser() {
        //17 close browser
        clearBrowserCookies();
        close();
    }

}
