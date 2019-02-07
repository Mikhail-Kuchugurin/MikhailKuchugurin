package hw4;


import hw4.enums.PageTitles;
import hw4.enums.ServiceElements;
import hw4.enums.Users;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class DifferentPageCheck extends BeforeAndAfter {

    @DataProvider(name = "BtnAndResults")
    public static Object[][] BtnAndResults() {
        return new Object[][]{
                {"div.main-content > div > div:nth-child(2) > label:nth-child(1)", "div#mCSB_2_container li:nth-child(1)",
                        "Water: condition changed to true"},
                {"div:nth-child(2) > label:nth-child(3)", "div#mCSB_2_container li:nth-child(1)", "Wind: condition changed to true"},
                {"div:nth-child(3) > label:nth-child(4)", "div#mCSB_2_container li:nth-child(1)", "metal: value changed to Selen"},
                {"div.colors > select > option:nth-child(4)", "div#mCSB_2_container li:nth-child(1)", "Colors: value changed to Yellow"},
                {"div.main-content > div > div:nth-child(2) > label:nth-child(1)", "div#mCSB_2_container li:nth-child(1)",
                        "Water: condition changed to false"},
                {"div:nth-child(2) > label:nth-child(3)", "div#mCSB_2_container li:nth-child(1)", "Wind: condition changed to false"}};

    }


    @Test
    public void loginAndVerificationDifElementsPage() {

        //2 Check that Browser title equals "Home Page"
        loginPage.checkPageTitle(PageTitles.HOME_PAGE);

        //3 fill fields login and password
        MainPage mainPage = loginPage.performLogin(Users.PITER);

        //4 check user name
        mainPage.checkUserNameAfterLogin(Users.PITER);

        //5 Click on "Service" subcategory in the header and check that drop down contains options
        mainPage.headerService.click();
        mainPage.checkHeaderServiceMenu(ServiceElements.getValues());

        //6 Click on Service subcategory in the left section and check that drop down contains options
        mainPage.leftMenuService.click();
        mainPage.checkLeftServiceMenu(ServiceElements.getValues());

        //7 Open through the header menu Service -> Different Elements Page
        DifferentElementsPage differentElementsPage = mainPage.openDifferentElements();

        //8 Check interface on Different elements page, it contains all needed elements
        differentElementsPage.doElementsExist();

        //9 Assert that there is Right Section
        differentElementsPage.isRightSectionDisplayed();

        //10 Assert that there is Left Section
        differentElementsPage.isLeftSectionDisplayed();
    }

    //Steps 11-18. Click button and check log
    @Test(dependsOnMethods = "loginAndVerificationDifElementsPage", dataProvider = "BtnAndResults")
    public void selectCheckBoxAndCheckLogs(String btnLct, String actualResultLocator, String expectedResult) {
        new DifferentElementsPage().selectObjectAndCheckLog(btnLct, actualResultLocator, expectedResult);
    }

}

