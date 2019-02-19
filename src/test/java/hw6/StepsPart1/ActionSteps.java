package hw6.StepsPart1;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import hw6.DifferentElementsPage;
import hw6.LoginPage;
import hw6.MainPage;
import hw6.UserPage;
import hw6.enums.ButtonsAndColors;
import hw6.enums.Users;


public class ActionSteps {
    MainPage mainPage = new MainPage();
    DifferentElementsPage differentElementsPage = new DifferentElementsPage();
    UserPage userPage = new UserPage();

    @When("^I login as user '([^\"]*)'$")
    public void login(Users user) {
        new LoginPage().performLogin(user);
    }

    @And("^I select color '([^\"]*)'$")
    public void iSelectColor(ButtonsAndColors buttonsAndColors) {
        differentElementsPage.dropDown.click();
        differentElementsPage.clickBtn(differentElementsPage.dropDownColors, buttonsAndColors);
    }

    @When("^i select '([^\"]*)'$")
    public void iSelectElement(ButtonsAndColors buttonsAndColors) {
        differentElementsPage.clickBtn(differentElementsPage.checkAndRadioBtn, buttonsAndColors);
    }

    @When("^I unselect '([^\"]*)'$")
    public void iUnselect(ButtonsAndColors buttonsAndColors) {
        differentElementsPage.clickBtn(differentElementsPage.checkAndRadioBtn, buttonsAndColors);
    }

    @When("^I click on \"Service\" button in Header$")
    public void iClickOnButtonInHeader() {
        mainPage.headerService.click();
    }

    @When("^I select 'vip' checkbox for \"Sergey Ivan\"$")
    public void iSelectVipCheckboxFor() {
        userPage.checkBoxes.get(1).click();
    }

    @When("^I click on dropdown in column Type for user Roman$")
    public void iClickOnDropdownInColumnTypeForUserRoman() {
        userPage.dropdowns.get(0).click();
    }
}
