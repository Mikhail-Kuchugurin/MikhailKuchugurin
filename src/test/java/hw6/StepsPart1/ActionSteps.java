package hw6.StepsPart1;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import hw6.DifferentElementsPage;
import hw6.LoginPage;
import hw6.enums.ButtonsAndColors;
import hw6.enums.Users;


public class ActionSteps {
    DifferentElementsPage differentElementsPage = new DifferentElementsPage();

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
}
