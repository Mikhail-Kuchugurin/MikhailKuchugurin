package hw4;


import hw4.enums.*;
import org.testng.annotations.Test;


public class DifferentPageCheck extends BeforeAndAfter {

    @Test
    public void loginAndVerificationDifElementsPage() {

        //2 Check that Browser title equals "Home Page"
        loginPage.checkPageTitle(PageTitles.HOME_PAGE);

        //3 fill fields login and password
        MainPage mainPage = loginPage.performLogin(Users.PITER);

        //4 check user name
        mainPage.checkUserNameAfterLogin(Users.PITER);

        // TODO It will be quite better if you create one single method that can be used for open any page on the portal.
        //5 Click on "Service" subcategory in the header and check that drop down contains options
        mainPage.headerService.click();
        mainPage.checkHeaderServiceMenu(ServiceElements.getValues());

        //6 Click on Service subcategory in the left section and check that drop down contains options
        mainPage.leftMenuService.click();
        mainPage.checkLeftServiceMenu(ServiceElements.getValues());

        //7 Open through the header menu Service -> Different Elements Page
        DifferentElementsPage differentElementsPage = mainPage.openDifferentElements();

        //8 Check interface on Different elements page, it contains all needed elements
        differentElementsPage.verifyElements();

        //9 Assert that there is Right Section
        differentElementsPage.checkRightSection();

        //10 Assert that there is Left Section
        differentElementsPage.checkLeftSection();


        // TODO You should not mix up action and verification in one single method
        //11-12 Select checkboxes and check logs 
        differentElementsPage.selectObjectAndCheckLog(ButtonsAndColors.WATER, ExpectedLogs.WATER_TRUE);
        differentElementsPage.selectObjectAndCheckLog(ButtonsAndColors.WIND, ExpectedLogs.WIND_TRUE);

        //13-14 Select radioBtn and check logs 
        differentElementsPage.selectObjectAndCheckLog(ButtonsAndColors.SELEN, ExpectedLogs.SELEN);

        //15-16 Select dropdown and check logs 
        differentElementsPage.selectColorAndCheckLog(ButtonsAndColors.YELLOW, ExpectedLogs.YELLOW);

        //17-18 Unselect checkboxes and check logs
        differentElementsPage.selectObjectAndCheckLog(ButtonsAndColors.WATER, ExpectedLogs.WATER_FALSE);
        differentElementsPage.selectObjectAndCheckLog(ButtonsAndColors.WIND, ExpectedLogs.WIND_FALSE);

    }

}

