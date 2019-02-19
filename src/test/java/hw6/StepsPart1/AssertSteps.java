package hw6.StepsPart1;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import hw6.DifferentElementsPage;
import hw6.LoginPage;
import hw6.MainPage;
import hw6.UserPage;
import hw6.enums.ExpectedLogs;
import hw6.enums.PageTitles;
import hw6.enums.Users;
import org.testng.Assert;

import java.util.List;
import java.util.Map;

import static hw6.utils.CollectionsUtils.compareCollections;

public class AssertSteps {

    LoginPage loginPage = new LoginPage();
    MainPage mainPage = new MainPage();
    DifferentElementsPage differentElementsPage = new DifferentElementsPage();
    UserPage userPage = new UserPage();

    @Then("^Page title is '([^\"]*)'$")
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

    @And("^6 NumberType Dropdowns are displayed on Users Table on User Table Page$")
    public void numbertypeDropdownsAreDisplayedOnUsersTableOnUserTablePage() {
        userPage.dropdowns.forEach(SelenideElement::exists);
    }


    @And("^6 User names are displayed on Users Table on User Table Page$")
    public void userNamesAreDisplayedOnUsersTableOnUserTablePage() {
        userPage.names.forEach(SelenideElement::exists);
    }

    @And("^6 Description images are displayed on Users Table on User Table Page$")
    public void descriptionImagesAreDisplayedOnUsersTableOnUserTablePage() {
        userPage.descImages.forEach(SelenideElement::exists);
    }


    @And("^6 Description texts under images are displayed on Users Table on User Table Page$")
    public void descriptionTextsUnderImagesAreDisplayedOnUsersTableOnUserTablePage() {
        userPage.descTexts.forEach(SelenideElement::exists);
    }

    @And("^6 checkboxes are displayed on Users Table on User Table Page$")
    public void checkboxesAreDisplayedOnUsersTableOnUserTablePage() {
        userPage.checkBoxes.forEach(SelenideElement::exists);
    }

    @And("^User table contains following values:$")
    public void userTableContainsFollowingValues(DataTable arg) {
        List<Map<String, String>> table = arg.asMaps(String.class, String.class);
        for (int i = 0; i < table.size(); i++) {
            userPage.numbers.get(i).should(Condition.text(table.get(i).get("Number")));
            userPage.names.get(i).should(Condition.text(table.get(i).get("User")));
            userPage.descTexts.get(i).should(Condition.text(table.get(i).get("Description")));
        }

    }

    @Then("^droplist contains values$")
    public void droplistContainsValues(List<String> list) {
        Assert.assertTrue(compareCollections(userPage.droplist, list));
    }
}
