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
    Actions builder = new Actions(getWebDriver());
    int locX = sliders.get(0).getLocation().x;
    int trackCenter = track.getLocation().x;


    public void testing() {
        System.out.println("slider from " + locX);
        System.out.println("track " + trackCenter);
        builder.clickAndHold(sliders.get(0)).moveByOffset(-50, 0).release().build().perform();
        System.out.println("slider from new center " + sliders.get(0).getLocation().x);
        System.out.println("slider from " + sliders.get(0).getText());
        System.out.println("track " + trackCenter);

        builder.clickAndHold(sliders.get(0)).moveToElement(track, (int) ((track.getSize().width) * (0.15)), 0).release().build().perform();
        lastLog.should(Condition.text("Range 2(From):" + 0 + " link clicked"));


    }

    public void moveSlidersAndCheckLogs(double xFrom, String resultFrom, double xTo, String resultTo) {
        builder.clickAndHold(sliders.get(0)).moveToElement(track, (int) ((track.getSize().width) * (xFrom)), 0).release().build().perform();
        lastLog.should(Condition.text(resultFrom + " link clicked"));
        builder.clickAndHold(sliders.get(1)).moveToElement(track, (int) ((track.getSize().width) * (xTo)), 0).release().build().perform();
        lastLog.should(Condition.text(resultTo + " link clicked"));
    }


}
