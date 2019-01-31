package hw1;

import hw1.PageObjects.LoginPage;
import org.testng.Assert;
import hw1.PageObjects.MainPage;

import org.testng.annotations.Test;


public class SimpleTests extends BeforeAndAfter {

    private String user = "epam";
    private String pass = "1234";

    @Test()
    public void asserts() {
        //2 Check that Browser title equals "Home Page"
        Assert.assertEquals(driver.getTitle(), "Home Page");

        //3 fill fields login and password
        MainPage mainPage = new LoginPage(driver).performLogin(user, pass);

        //4 check user name
        Assert.assertEquals(mainPage.userName.getText(), "PITER CHAILOVSKII");

        //5 Check that Browser title equals "Home Page"
        Assert.assertEquals(driver.getTitle(), "Home Page");

        //6 Header buttons are displayed
        Assert.assertTrue(mainPage.menuHome.isDisplayed());
        Assert.assertTrue(mainPage.menuContactForm.isDisplayed());
        Assert.assertTrue(mainPage.menuService.isDisplayed());
        Assert.assertTrue(mainPage.menuMetalColors.isDisplayed());

        //6 Header buttons texts have equal values to expected
        Assert.assertEquals(mainPage.menuHome.getText(), "HOME");
        Assert.assertEquals(mainPage.menuContactForm.getText(), "CONTACT FORM");
        Assert.assertEquals(mainPage.menuService.getText(), "SERVICE");
        Assert.assertEquals(mainPage.menuMetalColors.getText(), "METALS & COLORS");

        //7 Images are displayed
        Assert.assertTrue(mainPage.imgBase.isDisplayed());
        Assert.assertTrue(mainPage.imgCustom.isDisplayed());
        Assert.assertTrue(mainPage.imgMulti.isDisplayed());
        Assert.assertTrue(mainPage.imgPractise.isDisplayed());

        //8 Texts are displayed
        Assert.assertTrue(mainPage.txtPractice.isDisplayed());
        Assert.assertTrue(mainPage.txtCustom.isDisplayed());
        Assert.assertTrue(mainPage.txtMulti.isDisplayed());
        Assert.assertTrue(mainPage.txtBase.isDisplayed());

        //8 Texts have equal values to expected
        Assert.assertEquals(mainPage.txtPractice.getText(), "To include good practices\n" + "and ideas from successful\n" + "EPAM project");
        Assert.assertEquals(mainPage.txtCustom.getText(), "To be flexible and\n" + "customizable");
        Assert.assertEquals(mainPage.txtMulti.getText(), "To be multiplatform");
        Assert.assertEquals(mainPage.txtBase.getText(), "Already have good base\n" + "(about 20 internal and\n" + "some external projects),\n" + "wish to get more…");

        //9 Texts are displayed
        Assert.assertTrue(mainPage.headerTitle.isDisplayed());
        Assert.assertTrue(mainPage.headerText.isDisplayed());

        //9 Texts have equals values to expected result
        Assert.assertEquals(mainPage.headerTitle.getText(), "EPAM FRAMEWORK WISHES…");
        Assert.assertEquals(mainPage.headerText.getText(), "LOREM IPSUM DOLOR SIT AMET, CONSECTETUR ADIPISICING ELIT, SED DO EIUSMOD TEMPOR INCIDIDUNT UT LABORE ET DOLORE MAGNA ALIQUA. UT ENIM AD MINIM VENIAM, QUIS NOSTRUD EXERCITATION ULLAMCO LABORIS NISI UT ALIQUIP EX EA COMMODO CONSEQUAT DUIS AUTE IRURE DOLOR IN REPREHENDERIT IN VOLUPTATE VELIT ESSE CILLUM DOLORE EU FUGIAT NULLA PARIATUR.");

        //10 The iframe exists
        Assert.assertTrue(mainPage.frame.isDisplayed());

        //11 switch to frame and check logo
        Assert.assertTrue(mainPage.goToFrame().logo.isDisplayed());

        //12 switch to original window
        driver.switchTo().defaultContent();

        //13 check text of sub header
        Assert.assertEquals(mainPage.subHeaderElement.getText(), "JDI GITHUB");

        //14 Link is displayed and has proper value
        Assert.assertTrue(mainPage.subHeaderElement.isEnabled());
        Assert.assertEquals(mainPage.subHeaderElement.getAttribute("href"), "https://github.com/epam/JDI");

        //15 Left section is displayed
        Assert.assertTrue(mainPage.leftMenu.isDisplayed());

        //16 Footer is displayed
        Assert.assertTrue(mainPage.footer.isDisplayed());

    }



}
