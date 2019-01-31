package hw2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
    private  WebDriver driver;

    @FindBy(css = "#user-name")
    public WebElement userName;

    @FindBy(xpath = "//a[contains(text(),'Home')]")
    public WebElement menuHome;

    @FindBy(xpath = "//a[contains(text(),'Contact form')]")
    public WebElement menuContactForm;

    @FindBy(xpath = "//li[@class='dropdown']//a[@class='dropdown-toggle']")
    public WebElement menuService;

    @FindBy(xpath = "//a[contains(text(),'Metals & Colors')]")
    public WebElement menuMetalColors;

    @FindBy(xpath = "//span[@class='icons-benefit icon-practise']")
    public WebElement imgPractise;

    @FindBy(xpath = "//span[@class='icons-benefit icon-custom']")
    public WebElement imgCustom;

    @FindBy(xpath = "//span[@class='icons-benefit icon-multi']")
    public WebElement imgMulti;

    @FindBy(xpath = "//span[@class='icons-benefit icon-base']")
    public WebElement imgBase;

    @FindBy(xpath = "//span[contains(text(),'To include good practices')]")
    public WebElement txtPractice;

    @FindBy(xpath = "//span[contains(text(),'To be flexible')]")
    public WebElement txtCustom;

    @FindBy(xpath = "//span[contains(text(),'To be multiplatform')]"  )
    public WebElement txtMulti;

    @FindBy(xpath = "//span[contains(text(),'Already have good base')]")
    public WebElement txtBase;

    @FindBy(xpath = "//h3[@name='main-title']")
    public WebElement headerTitle;

    @FindBy(xpath = "//p[@name='jdi-text']")
    public WebElement headerText;

    @FindBy(css = "#iframe")
    public WebElement frame;

    @FindBy(xpath = "//a[contains(text(),'JDI Github')]")
    public WebElement subHeaderElement;

    @FindBy(css = "#mCSB_1")
    public WebElement leftMenu;

    @FindBy(xpath = "//div[@class='footer-content overflow']")
    public WebElement footer;


    public MainPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }

    public FramePage goToFrame(){
        driver.switchTo().frame("iframe");
        return new FramePage(driver);
    }
}
