package hw3;

import hw3.enums.TextOfElements;
import hw3.enums.Users;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class MainPage extends BasePage {
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
    @FindBy(xpath = "//span[contains(text(),'To be multiplatform')]")
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
        super(driver);
    }

    public FramePage goToFrame() {
        driver.switchTo().frame("iframe");
        return new FramePage(driver);
    }

    //4 check user name
    public void checkUserNameAfterLogin() {
        Assert.assertEquals(userName.getText(), Users.PITER.firstAndLastName);
    }

    // TODO This method should be parametrised
    //6 Header buttons are displayed and texts have equal values to expected
    public void checkHeadersElements() {
        // TODO I assume that it will be easier with for loop. In order to do that you can:
        // TODO 1. to create locator that provide you with the list of an WebElements
        // TODO 2. create the collection that contains all the menu-elements
        Assert.assertTrue(menuHome.isDisplayed());
        Assert.assertTrue(menuContactForm.isDisplayed());
        Assert.assertTrue(menuService.isDisplayed());
        Assert.assertTrue(menuMetalColors.isDisplayed());
        Assert.assertEquals(menuHome.getText(), TextOfElements.MENU_HOME.elementsText);
        Assert.assertEquals(menuContactForm.getText(), TextOfElements.MENU_CONTACT_FROM.elementsText);
        Assert.assertEquals(menuService.getText(), TextOfElements.MENU_SERVICE.elementsText);
        Assert.assertEquals(menuMetalColors.getText(), TextOfElements.MENU_METAL_COLORS.elementsText);
    }

    //7 Images in the centre of page are displayed
    public void checkImgsCentreOfPage() {
        Assert.assertTrue(imgBase.isDisplayed());
        Assert.assertTrue(imgCustom.isDisplayed());
        Assert.assertTrue(imgMulti.isDisplayed());
        Assert.assertTrue(imgPractise.isDisplayed());
    }

    //8 Texts under images are displayed and have equal values to expected
    // TODO Similar situation like MainPage::checkHeadersElements
    public void checkTextsUnderImages() {
        Assert.assertTrue(txtPractice.isDisplayed());
        Assert.assertTrue(txtCustom.isDisplayed());
        Assert.assertTrue(txtMulti.isDisplayed());
        Assert.assertTrue(txtBase.isDisplayed());
        Assert.assertEquals(txtPractice.getText(), TextOfElements.PRACTICE.elementsText);
        Assert.assertEquals(txtCustom.getText(), TextOfElements.CUSTOM.elementsText);
        Assert.assertEquals(txtMulti.getText(), TextOfElements.MULTI.elementsText);
        Assert.assertEquals(txtBase.getText(), TextOfElements.BASE.elementsText);

    }

    //9 Header texts are displayed and have equals values to expected result
    // TODO This method should be parametrised as well
    public void checkHeaderTexts() {
        Assert.assertTrue(headerTitle.isDisplayed());
        Assert.assertTrue(headerText.isDisplayed());
        Assert.assertEquals(headerTitle.getText(), TextOfElements.HEADER_TITLE.elementsText);
        Assert.assertEquals(headerText.getText(), TextOfElements.HEADER_TEXT.elementsText);

    }

    //10 The iframe exists
    public void doesFrameExist() {
        Assert.assertTrue(frame.isDisplayed());
    }

    //11 switch to frame and check logo
    public void switchToFrameAndCheckLogo() {
        Assert.assertTrue(goToFrame().logo.isDisplayed());
    }

    //13 check text of sub header
    public void checkOfSubHeaderText() {
        Assert.assertEquals(subHeaderElement.getText(), TextOfElements.SUB_HEADER.elementsText);
    }

    //14 Link is displayed and has proper value
    public void isLinkDisplayedAndCorrect() {
        Assert.assertTrue(subHeaderElement.isEnabled());
        Assert.assertEquals(subHeaderElement.getAttribute("href"), "https://github.com/epam/JDI");
    }

    //15 Left section is displayed
    public void isLeftMenuDisplayed() {
        Assert.assertTrue(leftMenu.isDisplayed());
    }

    //16 Footer is displayed
    public void isFooterDisplayed() {
        Assert.assertTrue(footer.isDisplayed());
    }

}
