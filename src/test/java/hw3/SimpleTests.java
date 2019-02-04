package hw3;


import hw3.enums.PageTitles;
import hw3.enums.Users;
import org.testng.annotations.Test;


public class SimpleTests extends BeforeAndAfter {

    @Test
    public void loginAndVerificationJdiPage() {
        //2 Check that Browser title equals "Home Page"
        // TODO You can simplified this by static import
        loginPage.checkPageTitle(PageTitles.HOME_PAGE);

        //3 fill fields login and password
        // TODO Why don't you pass the whole User into this method ?
        MainPage mainPage = loginPage.performLogin(Users.PITER.login, Users.PITER.pass);

        // TODO You have passed arguments in method from step 3, but you have not passed it here. Why ?
        // TODO From my perspective, this method should be parametrised as well.
        //4 check user name
        mainPage.checkUserNameAfterLogin();

        //5 Check that Browser title equals "Home Page"
        mainPage.checkPageTitle(PageTitles.HOME_PAGE);

        //6 Header buttons are displayed and texts have equal values to expected
        mainPage.checkHeadersElements();

        //7 Images in the centre of page are displayed
        mainPage.checkImgsCentreOfPage();

        //8 Texts under images are displayed and have equal values to expected
        mainPage.checkTextsUnderImages();

        //9 Header texts are displayed and have equals values to expected result
        mainPage.checkHeaderTexts();

        //10 The iframe exists
        mainPage.doesFrameExist();

        //11 switch to frame and check logo
        mainPage.switchToFrameAndCheckLogo();

        //12 switch to original window
        driver.switchTo().defaultContent();

        //13 check text of sub header
        mainPage.checkOfSubHeaderText();

        //14 Link is displayed and has proper value
        mainPage.isLinkDisplayedAndCorrect();

        //15 Left section is displayed
        mainPage.isLeftMenuDisplayed();

        //16 Footer is displayed
        mainPage.isFooterDisplayed();

    }


}
