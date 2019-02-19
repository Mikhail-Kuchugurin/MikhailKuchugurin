package hw6.StepsPart1;

import com.codeborne.selenide.Condition;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import hw6.DifferentElementsPage;
import hw6.LoginPage;
import hw6.MainPage;
import hw6.enums.ExpectedLogs;
import hw6.enums.PageTitles;
import hw6.enums.Users;

public class AssertSteps {

    LoginPage loginPage = new LoginPage();
    MainPage mainPage = new MainPage();
    DifferentElementsPage differentElementsPage = new DifferentElementsPage();

    @Then("Page title is '([^\"]*)'")
    public void checkTitle(PageTitles pageTitles) {
        loginPage.checkPageTitle(pageTitles);
    }

    @And("^I am logged as '([^\"]*)'$")
    public void iAmLoggedAsPITER(Users user) {
        mainPage.checkUserNameAfterLogin(user);
    }

    @And("^Images on the main page are displayed$")
    public void iCheckHomePageSImages() {
        mainPage.checkifElemetsExist(mainPage.images);
    }

    @And("^Texts under images on the main page are displayed$")
    public void textsUnderImagesOnTheMainPageAreDisplayed() {
        mainPage.checkifElemetsExist(mainPage.textsUnderImages);
    }

    @And("^Headline is displayed$")
    public void headlineIsDisplayed() {
        mainPage.checkElement(mainPage.headline);
    }

    @And("^Description under headline is displayed$")
    public void descriptionUnderHeadlineIsDisplayed() {
        mainPage.checkElement(mainPage.textUnderHeadline);
    }

    @And("^Service header menu is displayed$")
    public void iCheckServiceHeaderMenu() {
        mainPage.headerService.click();
        mainPage.checkifElemetsExist(mainPage.headerServiceMenu);
    }

    @And("^Left service menu is displayed$")
    public void iCheckLeftServiceMenu() {
        mainPage.leftMenuService.click();
        mainPage.checkifElemetsExist(mainPage.leftServiceMenu);

    }

    @Then("^I check checkboxes/radiobtns/dropdown/defaultbtn/inputbtn$")
    public void iCheckNecessaryElements() {
        differentElementsPage.verifyElements();
    }

    @And("^Right section is displayed$")
    public void rightSectionIsDisplayed() {
        differentElementsPage.checkRightSection();
    }

    @And("^Left section is displayed$")
    public void leftSectionIsDisplayed() {
        differentElementsPage.checkLeftSection();
    }

    @Then("^<log> matches the element$")
    public void logMatchesTheElement(ExpectedLogs expectedLogs) {
        differentElementsPage.lastLog.should(Condition.text(expectedLogs.parameter));
    }

    @Then("^Log for '([^\"]*)' color is correct$")
    public void logIsCorrect(ExpectedLogs expectedLogs) {
        differentElementsPage.lastLog.should(Condition.text(expectedLogs.parameter));
    }

    @Then("^Log is corresponding to selected '([^\"]*)'$")
    public void logIsCorrespondingToSelected(ExpectedLogs expectedLogs) {
        differentElementsPage.lastLog.should(Condition.text(expectedLogs.parameter));
    }
}
