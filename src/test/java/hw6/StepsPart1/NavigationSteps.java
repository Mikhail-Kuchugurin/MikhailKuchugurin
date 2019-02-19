package hw6.StepsPart1;

import cucumber.api.java.en.Given;
import hw6.BeforeAndAfter;
import hw6.MainPage;

import static com.codeborne.selenide.Selenide.open;

public class NavigationSteps extends BeforeAndAfter {


    @Given("Test page is opened")
    public void openHomePage() {
        open("https://epam.github.io/JDI/");
    }

    @Given("^I open Different Elements Page$")
    public void iOpenDifferentElementsPage() {
        MainPage mainPage = new MainPage();
        mainPage.headerService.click();
        mainPage.headerServiceMenu.get(6).click();
    }
}
