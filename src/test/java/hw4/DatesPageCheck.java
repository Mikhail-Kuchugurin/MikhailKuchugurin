package hw4;

import hw4.enums.PageTitles;
import hw4.enums.Users;
import org.testng.annotations.Test;


public class DatesPageCheck extends BeforeAndAfter {

    @Test
    public void loginAndVerificationDatesPage() {
        //2 Check that Browser title equals "Home Page"
        loginPage.checkPageTitle(PageTitles.HOME_PAGE);

        //3 fill fields login and password
        MainPage mainPage = loginPage.performLogin(Users.PITER);

        //4 check user name
        mainPage.checkUserNameAfterLogin(Users.PITER);
        //5 Open through the header menu Service -> Dates Page
        DatesPage datesPage = mainPage.openDatesPage();

        // TODO You should not mix up action and verification in one single method
        // TODO Slider works in [0 : 100] integer range, therefore this method should take the values from it only.
        // TODO It is not make sense to pass numbers and strings in one time.
        // TODO In general, you have to pass integers only
        //6-7 move sliders and assert that for "From" and "To" sliders there are logs rows with corresponding values
        datesPage.moveSlidersAndCheckLogs(0.0, "0", 1.0, "100");

        //8-9 move sliders and assert that for "From" and "To" sliders there are logs rows with corresponding values
        datesPage.moveSlidersAndCheckLogs(0.0, "0", 0.0, "0");

        //10-11 move sliders and assert that for "From" and "To" sliders there are logs rows with corresponding values
        datesPage.moveSlidersAndCheckLogs(1.0, "100", 1.0, "100");

        //10-11 move sliders and assert that for "From" and "To" sliders there are logs rows with corresponding values
        datesPage.moveSlidersAndCheckLogs(0.305, "30", 0.7, "70");

    }

}
