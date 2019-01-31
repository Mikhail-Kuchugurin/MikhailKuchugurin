package hw2.ex2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BeforeAndAfter {

    private static final String url = "https://epam.github.io/JDI/";
    protected static ThreadLocal<WebDriver> webDriver = new ThreadLocal<WebDriver>();

    public static WebDriver getDriver() {
        return webDriver.get();
    }

    @BeforeMethod(groups = {"Smoke", "Regression"})
    public void openBrowser() {
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
        webDriver.set(new ChromeDriver());
        //1 Run browser and open test site
        getDriver().get(url);
        getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        getDriver().manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        getDriver().manage().window().maximize();


    }

    @AfterMethod(groups = {"Smoke", "Regression"})
    public void closeBrowser() {
        //17 close browser
        webDriver.get().close();
        webDriver.remove();
    }


}
