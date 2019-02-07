package hw4;

import hw4.enums.PageTitles;
import hw4.enums.Users;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class DatesPageCheck extends BeforeAndAfter {


    @DataProvider(name = "SlidersAndResults")
    public static Object[][] SlidersAndResults() {
        return new Object[][]{
                {0.0, "0", 1.0, "100"},
                {0.0, "0", 0.0, "0"},
                {1.0, "100", 1.0, "100"},
                {0.305, "30", 0.7, "70"}};

    }

    @Test
    public void loginAndVerificationDatesPage() {
        //2 Check that Browser title equals "Home Page"
        loginPage.checkPageTitle(PageTitles.HOME_PAGE);

        //3 fill fields login and password
        MainPage mainPage = loginPage.performLogin(Users.PITER);

        //4 check user name
        mainPage.checkUserNameAfterLogin(Users.PITER);

        //5 Open through the header menu Service -> Dates Page
        mainPage.openDatesPage();

    }

    //steps 6-13 move sliders and check logs
    @Test(dependsOnMethods = "loginAndVerificationDatesPage", dataProvider = "SlidersAndResults")
    public void moveSlidersAndCheckLogs(double xFrom, String resultFrom, double xTo, String resultTo) {
        new DatesPage().moveSlidersAndCheckLogs(xFrom, resultFrom, xTo, resultTo);
    }


}
