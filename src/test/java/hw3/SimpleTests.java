package hw3;


import hw3.enums.PageTitles;
import hw3.enums.Users;
import org.testng.annotations.Test;


public class SimpleTests extends BeforeAndAfter {

    // TODO Test should be named with the reflection on it purpose
    // fixed
    @Test()
    public void loginAndVerificationJdiPage() {
        //2 Check that Browser title equals "Home Page"
        // TODO You break several "Best Practice" rules, take a look on "4. Selenide Best Practices" presentation
        // fixed
        loginPage.checkPageTitle(PageTitles.HOME_PAGE);

        //3 fill fields login and password
        MainPage mainPage = loginPage.performLogin(Users.PITER.login, Users.PITER.pass);

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
