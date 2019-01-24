package hw1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SimpleTests {

    protected WebDriver driver;
    private String url = "https://epam.github.io/JDI/";

@BeforeSuite
public void openBrowser(){
    System.setProperty("webdriver.chrome.driver", "c:/MikhailKuchugurin/TestAutoWinter/chromedriver.exe");
    driver = new ChromeDriver();

}

@Test
    public void openPage(){
    driver.get(url);
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
    driver.manage().window().maximize();

}


}
