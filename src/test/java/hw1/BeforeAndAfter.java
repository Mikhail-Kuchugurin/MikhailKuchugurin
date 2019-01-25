package hw1;

import PageObjects.LoginPage;
import PageObjects.MainPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

public class BeforeAndAfter {
    protected WebDriver driver;
    private String url = "https://epam.github.io/JDI/";



    @BeforeSuite
    public void openBrowser() {
        //1 Run browser and open test site
        System.setProperty("webdriver.chrome.driver", "\\src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }


    @AfterSuite
    public void closeBrowser(){
        //17 close browser
        driver.close();
    }
}
