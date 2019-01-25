package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class MainPage {
    private static WebDriver driver;

    @FindBy(css = "#user-name")
    private WebElement userName;

    @FindBy(xpath = "//a[contains(text(),'Home')]")
    private WebElement menuHome;

    @FindBy(xpath = "//a[contains(text(),'Contact form')]")
    private WebElement menuContactForm;

    @FindBy(xpath = "//li[@class='dropdown']//a[@class='dropdown-toggle']")
    private WebElement menuService;

    @FindBy(xpath = "//a[contains(text(),'Metals & Colors')]")
    private WebElement menuMetalColors;

    @FindBy(xpath = "//span[@class='icons-benefit icon-practise']")
    private WebElement imgPractise;

    @FindBy(xpath = "//span[@class='icons-benefit icon-custom']")
    private WebElement imgCustom;

    @FindBy(xpath = "//span[@class='icons-benefit icon-multi']")
    private WebElement imgMulti;


    @FindBy(xpath = "//span[@class='icons-benefit icon-base']")
    private WebElement imgBase;

    @FindBy(xpath = "//span[contains(text(),'To include good practices')]")
    private WebElement txtPractice;

    @FindBy(xpath = "//span[contains(text(),'To be flexible')]")
    private WebElement txtCustom;

    @FindBy(xpath = "//span[contains(text(),'To be multiplatform')]"  )
    private WebElement txtMulti;

    @FindBy(xpath = "//span[contains(text(),'Already have good base')]")
    private WebElement txtBase;

    @FindBy(xpath = "//h3[@name='main-title']")
    private WebElement headerTitle;

    @FindBy(xpath = "//p[@name='jdi-text']")
    private WebElement headerText;

    @FindBy(css = "#iframe")
    private WebElement frame;

    @FindBy(xpath = "//a[contains(text(),'JDI Github')]")
    private WebElement subHeaderElement;

    @FindBy(css = "#mCSB_1")
    private WebElement leftMenu;

    @FindBy(xpath = "//div[@class='footer-content overflow']")
    private WebElement footer;


    public MainPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }



    public String getUserName(){
        return userName.getText();
    }

    public String getBrowserTitle(){
        return driver.getTitle();
    }

    public WebElement getMenuHome() {
        return menuHome;
    }

    public WebElement getMenuContactForm() {
        return menuContactForm;
    }

    public WebElement getMenuService() {
        return menuService;
    }

    public WebElement getMenuMetalColors() {
        return menuMetalColors;
    }

    public WebElement getImgPractise() {
        return imgPractise;
    }

    public WebElement getImgCustom() {
        return imgCustom;
    }

    public WebElement getImgMulti() {
        return imgMulti;
    }

    public WebElement getImgBase() {
        return imgBase;
    }

    public WebElement getTxtPractice() {
        return txtPractice;
    }

    public WebElement getTxtCustom() {
        return txtCustom;
    }

    public WebElement getTxtMulti() {
        return txtMulti;
    }

    public WebElement getTxtBase() {
        return txtBase;
    }

    public WebElement getHeaderTitle() {
        return headerTitle;
    }

    public WebElement getHeaderText() {
        return headerText;
    }

    public WebElement getSubHeaderElement() {
        return subHeaderElement;
    }

    public WebElement getFrame() {
        return frame;
    }

    public WebElement getLeftMenu() {
        return leftMenu;
    }

    public WebElement getFooter() {
        return footer;
    }

    public FramePage goToFrame(){
        driver.switchTo().frame("iframe");
        return new FramePage(driver);
    }
}
