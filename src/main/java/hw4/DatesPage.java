package hw4;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class DatesPage extends BasePage {
    @FindBy(css = "div#mCSB_2_container li")
    public SelenideElement lastLog;

    @FindBy(css = "div:nth-child(4) > div:nth-child(2) > div > a")
    public ElementsCollection sliders;

    @FindBy(css = "div:nth-child(4) > div:nth-child(2) > div")
    public SelenideElement track;

    public void moveSlidersAndCheckLogs(double xFrom, String resultFrom, double xTo, String resultTo) {
        Actions builder = new Actions(getWebDriver());

        double trackWidth = track.getSize().width;

        builder.clickAndHold(sliders.get(0)).moveToElement(track, (int) (trackWidth * (xFrom)), 0).release().build().perform();
        lastLog.should(Condition.text(resultFrom + " link clicked"));

        builder.clickAndHold(sliders.get(1)).moveToElement(track, (int) (trackWidth * (xTo)), 0).release().build().perform();
        lastLog.should(Condition.text(resultTo + " link clicked"));

    }


}
