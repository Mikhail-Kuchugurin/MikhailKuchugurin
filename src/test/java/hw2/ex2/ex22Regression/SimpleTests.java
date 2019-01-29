package hw2.ex2.ex22Regression;

import hw2.LoginPage;
import hw2.MainPage;
import hw2.ex2.BeforeAndAfter;
import org.testng.Assert;
import org.testng.annotations.Test;


public class SimpleTests extends BeforeAndAfter {

    private String user = "epam";
    private String pass = "1234";

    @Test(priority = 1, groups = "Regression")
    public void checkBrowserTitleFirst() {
        //2 Check that Browser title equals "Home Page"
        MainPage mainPage = new LoginPage(webDriver.get()).performLogin(user, pass);
        Assert.assertEquals(mainPage.getBrowserTitle(), "Home Page");
    }

    @Test(priority = 2, groups = "Regression")
    public void performLogin() {
        //3 fill fields login and password
        MainPage mainPage = new LoginPage(webDriver.get()).performLogin(user, pass);
        //4 check user name
        Assert.assertEquals(mainPage.getUserName(), "PITER CHAILOVSKII");
    }

    @Test(priority = 3, groups = "Regression")
    public void checkBrowserTitleSecond() {
        //5 Check that Browser title equals "Home Page"
        MainPage mainPage = new LoginPage(webDriver.get()).performLogin(user, pass);
        Assert.assertEquals(mainPage.getBrowserTitle(), "Home Page");
    }

    @Test(priority = 4, groups = "Regression")
    public void isHeaderNamesDisplayed() {
        MainPage mainPage = new LoginPage(webDriver.get()).performLogin(user, pass);
        //6 "HOME" is displayed
        Assert.assertTrue(mainPage.getMenuHome().isDisplayed());
        //6 "CONTACT FORM" is displayed
        Assert.assertTrue(mainPage.getMenuContactForm().isDisplayed());
        //6 "SERVICE" is displayed
        Assert.assertTrue(mainPage.getMenuService().isDisplayed());
        //6 "METALS & COLORS" is displayed
        Assert.assertTrue(mainPage.getMenuMetalColors().isDisplayed());


    }

    @Test(priority = 4, groups = "Regression")
    public void checkHeaderNamesText() {
        //6 "HOME" has proper text
        MainPage mainPage = new LoginPage(webDriver.get()).performLogin(user, pass);
        Assert.assertEquals(mainPage.getMenuHome().getText(), "HOME");
        //6 "CONTACT FORM" has proper text
        Assert.assertEquals(mainPage.getMenuContactForm().getText(), "CONTACT FORM");
        //6 "SERVICE" has proper text
        Assert.assertEquals(mainPage.getMenuService().getText(), "SERVICE");
        //6 "METALS & COLORS" has proper text
        Assert.assertEquals(mainPage.getMenuMetalColors().getText(), "METALS & COLORS");

    }

    @Test(priority = 5, groups = "Regression")
    public void isImagesDisplayed() {
        MainPage mainPage = new LoginPage(webDriver.get()).performLogin(user, pass);
        //7 Images are displayed
        Assert.assertTrue(mainPage.getImgBase().isDisplayed());
        Assert.assertTrue(mainPage.getImgCustom().isDisplayed());
        Assert.assertTrue(mainPage.getImgMulti().isDisplayed());
        Assert.assertTrue(mainPage.getImgPractise().isDisplayed());
    }

    @Test(priority = 6, groups = "Regression")
    public void isTextUnderImagesDisplayed(){
        MainPage mainPage = new LoginPage(webDriver.get()).performLogin(user, pass);
        //8 Texts are displayed
        Assert.assertTrue(mainPage.getTxtPractice().isDisplayed());
        Assert.assertTrue(mainPage.getTxtCustom().isDisplayed());
        Assert.assertTrue(mainPage.getTxtMulti().isDisplayed());
        Assert.assertTrue(mainPage.getTxtBase().isDisplayed());


    }

    @Test(priority = 6, groups = "Regression")
    public void checkTextUnderImages() {
        MainPage mainPage = new LoginPage(webDriver.get()).performLogin(user, pass);
        //8 Texts have equal values to expected
        Assert.assertEquals(mainPage.getTxtPractice().getText(), "To include good practices\n" + "and ideas from successful\n" + "EPAM project");
        Assert.assertEquals(mainPage.getTxtCustom().getText(), "To be flexible and\n" + "customizable");
        Assert.assertEquals(mainPage.getTxtMulti().getText(), "To be multiplatform");
        Assert.assertEquals(mainPage.getTxtBase().getText(), "Already have good base\n" + "(about 20 internal and\n" + "some external projects),\n" + "wish to get more…");
    }

    @Test(priority = 7, groups = "Regression")
    public void isMainHeaderTextDisplayed(){
        MainPage mainPage = new LoginPage(webDriver.get()).performLogin(user, pass);
        //9 Texts are displayed
        Assert.assertTrue(mainPage.getHeaderTitle().isDisplayed());
        Assert.assertTrue(mainPage.getHeaderText().isDisplayed());

    }

    @Test(priority = 7, groups = "Regression")
    public void checkMainHeaderText() {
        MainPage mainPage = new LoginPage(webDriver.get()).performLogin(user, pass);
        //9 Texts have equals values to expected result
        Assert.assertEquals(mainPage.getHeaderTitle().getText(), "EPAM FRAMEWORK WISHES…");
        Assert.assertEquals(mainPage.getHeaderText().getText(), "LOREM IPSUM DOLOR SIT AMET, CONSECTETUR ADIPISICING ELIT, SED DO EIUSMOD TEMPOR INCIDIDUNT UT LABORE ET DOLORE MAGNA ALIQUA. UT ENIM AD MINIM VENIAM, QUIS NOSTRUD EXERCITATION ULLAMCO LABORIS NISI UT ALIQUIP EX EA COMMODO CONSEQUAT DUIS AUTE IRURE DOLOR IN REPREHENDERIT IN VOLUPTATE VELIT ESSE CILLUM DOLORE EU FUGIAT NULLA PARIATUR.");

    }

    @Test(priority = 8, groups = "Regression")
    public void isFrameDisplayed() {
        MainPage mainPage = new LoginPage(webDriver.get()).performLogin(user, pass);
        //10 The iframe exists
        Assert.assertTrue(mainPage.getFrame().isDisplayed());
    }

    @Test(priority = 9, groups = "Regression")
    public void checkLogoInFrame() {
        MainPage mainPage = new LoginPage(webDriver.get()).performLogin(user, pass);
        //11 switch to frame and check logo
        Assert.assertTrue(mainPage.goToFrame().getLogo().isDisplayed());
        //12 switch to original window
        webDriver.get().switchTo().defaultContent();
    }

    @Test(priority = 10, groups = "Regression")
    public void checkSubHeaderText() {
        MainPage mainPage = new LoginPage(webDriver.get()).performLogin(user, pass);
        //13 check text of sub header
        Assert.assertEquals(mainPage.getSubHeaderElement().getText(), "JDI GITHUB");
    }

    @Test(priority = 11, groups = "Regression")
    public void isSubHeaderLink() {
        MainPage mainPage = new LoginPage(webDriver.get()).performLogin(user, pass);
        //14 Link is displayed and has proper value
        Assert.assertTrue(mainPage.getSubHeaderElement().isEnabled());
        Assert.assertEquals(mainPage.getSubHeaderElement().getAttribute("href"), "https://github.com/epam/JDI");
    }

    @Test(priority = 12, groups = "Regression")
    public void isLeftMenuPresent() {
        MainPage mainPage = new LoginPage(webDriver.get()).performLogin(user, pass);
        //15 Left section is displayed
        Assert.assertTrue(mainPage.getLeftMenu().isDisplayed());

    }

    @Test(priority = 14, groups = "Regression")
    public void isFooterPresent() {
        MainPage mainPage = new LoginPage(webDriver.get()).performLogin(user, pass);
        //16 Footer is displayed
        Assert.assertTrue(mainPage.getFooter().isDisplayed());

    }


}
