package hw2.ex1;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class BeforeAndAfter {

    private String url = "https://epam.github.io/JDI/";
    protected static ThreadLocal<WebDriver> webDriver = new ThreadLocal<WebDriver>();


    @BeforeMethod()
    public void openBrowser() {
        webDriver.set(new ChromeDriver());
        //1 Run browser and open test site
        getDriver().get(url);
        getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        getDriver().manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        getDriver().manage().window().maximize();

    }

    @AfterMethod()
    public void closeBrowser(){
        //17 close browser
      webDriver.get().close();
      webDriver.remove();
    }

    public static WebDriver getDriver() {
        return webDriver.get();
    }


}
