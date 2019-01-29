package hw2.ex3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class BeforeAndAfter {
    protected WebDriver driver;
    private String url = "https://epam.github.io/JDI/";



    @BeforeSuite
    public void runBeforeSuite() {
        //1 Run browser and open test site
        System.setProperty("webdriver.chrome.driver", "\\src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);


    }
    @BeforeClass
    public void runBeforeClass (){
        driver.get(url);

    }
    @BeforeMethod
    public void runBeforeMethod(){
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void runAfterMethod(){
        System.out.println(System.currentTimeMillis());
    }

    @AfterClass
    public void runAfterClass(){
        System.out.println(driver.getTitle());
    }

    @AfterSuite
    public void runAfterSuite(){
        //17 close browser
        driver.close();

    }
}
