package hw2.ex3;

import hw1.BeforeAndAfter;
import hw1.PageObjects.LoginPage;
import hw1.PageObjects.MainPage;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;


public class SimpleTests extends hw2.ex3.BeforeAndAfter {

    private String user = "epam";
    private String pass = "1234";


    @Test(priority = 1)
    public void checkBrowserTitleFirst() {
        //2 Check that Browser title equals "Home Page"
        MainPage mainPage = new MainPage(driver);
        Assert.assertEquals(mainPage.getBrowserTitle(), "Home Page");
    }

    @Test(priority = 2)
    public void performLogin() {
        //3 fill fields login and password
        MainPage mainPage = new LoginPage(driver).performLogin(user, pass);
        //4 check user name
        Assert.assertEquals(mainPage.getUserName(), "PITER CHAILOVSKII");
    }

    @Test(priority = 3)
    public void checkBrowserTitleSecond() {
        //5 Check that Browser title equals "Home Page"
        MainPage mainPage = new MainPage(driver);
        Assert.assertEquals(mainPage.getBrowserTitle(), "Home Page");
    }

    @Test(priority = 4)
    public void isHeaderNamesDisplayed() {
        MainPage mainPage = new MainPage(driver);
        //6 "HOME" is displayed
        Assert.assertTrue(mainPage.getMenuHome().isDisplayed());
        //6 "CONTACT FORM" is displayed
        Assert.assertTrue(mainPage.getMenuContactForm().isDisplayed());
        //6 "SERVICE" is displayed
        Assert.assertTrue(mainPage.getMenuService().isDisplayed());
        //6 "METALS & COLORS" is displayed
        Assert.assertTrue(mainPage.getMenuMetalColors().isDisplayed());


    }

    @Test(priority = 4)
    public void checkHeaderNamesText() {
        //6 "HOME" has proper text
        MainPage mainPage = new MainPage(driver);
        Assert.assertEquals(mainPage.getMenuHome().getText(), "HOME");
        //6 "CONTACT FORM" has proper text
        Assert.assertEquals(mainPage.getMenuContactForm().getText(), "CONTACT FORM");
        //6 "SERVICE" has proper text
        Assert.assertEquals(mainPage.getMenuService().getText(), "SERVICE");
        //6 "METALS & COLORS" has proper text
        Assert.assertEquals(mainPage.getMenuMetalColors().getText(), "METALS & COLORS");

    }

    @Test(priority = 5)
    public void isImagesDisplayed() {
        MainPage mainPage = new MainPage(driver);
        //7 Images are displayed
        Assert.assertTrue(mainPage.getImgBase().isDisplayed());
        Assert.assertTrue(mainPage.getImgCustom().isDisplayed());
        Assert.assertTrue(mainPage.getImgMulti().isDisplayed());
        Assert.assertTrue(mainPage.getImgPractise().isDisplayed());
    }

    @Test(priority = 6)
    public void isTextUnderImagesDisplayed(){
        MainPage mainPage = new MainPage(driver);
        //8 Texts are displayed
        Assert.assertTrue(mainPage.getTxtPractice().isDisplayed());
        Assert.assertTrue(mainPage.getTxtCustom().isDisplayed());
        Assert.assertTrue(mainPage.getTxtMulti().isDisplayed());
        Assert.assertTrue(mainPage.getTxtBase().isDisplayed());


    }

    @Test(priority = 6)
    public void checkTextUnderImages() {
        MainPage mainPage = new MainPage(driver);
        //8 Texts have equal values to expected
        Assert.assertEquals(mainPage.getTxtPractice().getText(), "To include good practices\n" + "and ideas from successful\n" + "EPAM project");
        Assert.assertEquals(mainPage.getTxtCustom().getText(), "To be flexible and\n" + "customizable");
        Assert.assertEquals(mainPage.getTxtMulti().getText(), "To be multiplatform");
        Assert.assertEquals(mainPage.getTxtBase().getText(), "Already have good base\n" + "(about 20 internal and\n" + "some external projects),\n" + "wish to get more…");
    }

    @Test(priority = 7)
    public void isMainHeaderTextDisplayed(){
        MainPage mainPage = new MainPage(driver);
        //9 Texts are displayed
        Assert.assertTrue(mainPage.getHeaderTitle().isDisplayed());
        Assert.assertTrue(mainPage.getHeaderText().isDisplayed());

    }

    @Test(priority = 7)
    public void checkMainHeaderText() {
        MainPage mainPage = new MainPage(driver);
        //9 Texts have equals values to expected result
        Assert.assertEquals(mainPage.getHeaderTitle().getText(), "EPAM FRAMEWORK WISHES…");
        Assert.assertEquals(mainPage.getHeaderText().getText(), "LOREM IPSUM DOLOR SIT AMET, CONSECTETUR ADIPISICING ELIT, SED DO EIUSMOD TEMPOR INCIDIDUNT UT LABORE ET DOLORE MAGNA ALIQUA. UT ENIM AD MINIM VENIAM, QUIS NOSTRUD EXERCITATION ULLAMCO LABORIS NISI UT ALIQUIP EX EA COMMODO CONSEQUAT DUIS AUTE IRURE DOLOR IN REPREHENDERIT IN VOLUPTATE VELIT ESSE CILLUM DOLORE EU FUGIAT NULLA PARIATUR.");

    }

    @Test(priority = 8)
    public void isFrameDisplayed() {
        MainPage mainPage = new MainPage(driver);
        //10 The iframe exists
        Assert.assertTrue(mainPage.getFrame().isDisplayed());
    }

    @Test(priority = 9)
    public void checkLogoInFrame() {
        MainPage mainPage = new MainPage(driver);
        //11 switch to frame and check logo
        Assert.assertTrue(mainPage.goToFrame().getLogo().isDisplayed());
        //12 switch to original window
        driver.switchTo().defaultContent();
    }

    @Test(priority = 10)
    public void checkSubHeaderText() {
        MainPage mainPage = new MainPage(driver);
        //13 check text of sub header
        Assert.assertEquals(mainPage.getSubHeaderElement().getText(), "JDI GITHUB");
    }

    @Test(priority = 11)
    public void isSubHeaderLink() {
        MainPage mainPage = new MainPage(driver);
        //14 Link is displayed and has proper value
        Assert.assertTrue(mainPage.getSubHeaderElement().isEnabled());
        Assert.assertEquals(mainPage.getSubHeaderElement().getAttribute("href"), "https://github.com/epam/JDI");
    }

    @Test(priority = 12)
    public void isLeftMenuPresent() {
        MainPage mainPage = new MainPage(driver);
        //15 Left section is displayed
        Assert.assertTrue(mainPage.getLeftMenu().isDisplayed());

    }

    @Test(priority = 14)
    public void isFooterPresent() {
        MainPage mainPage = new MainPage(driver);
        //16 Footer is displayed
        Assert.assertTrue(mainPage.getFooter().isDisplayed());

    }


}
