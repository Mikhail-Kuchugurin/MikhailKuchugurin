package hw6.StepsPart2;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import hw6.BeforeAndAfter;

import static com.codeborne.selenide.Selenide.open;

public class NavigationSteps extends BeforeAndAfter {

    @Given("I am on \"Home Page\"")
    public void openHomePage() {
        open("https://epam.github.io/JDI/");
    }
}
