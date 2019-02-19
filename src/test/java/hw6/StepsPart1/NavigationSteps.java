package hw6.StepsPart1;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import hw6.BeforeAndAfter;
import hw6.MainPage;

import static com.codeborne.selenide.Selenide.open;

public class NavigationSteps extends BeforeAndAfter {

    @Given("I am on \"Home Page\"")
    public void openHomePage() {
        open("https://epam.github.io/JDI/");
    }


    @Given("^I open Different Elements Page$")
    public void iOpenDifferentElementsPage() {
        MainPage mainPage = new MainPage();
        mainPage.headerService.click();
        mainPage.headerServiceMenu.get(6).click();
    }

    @And("^I click on \"User Table\" button in Service dropdown$")
    public void iClickOnButtonInServiceDropdown() {
        MainPage mainPage = new MainPage();
        mainPage.headerServiceMenu.get(4).click();
    }
}
