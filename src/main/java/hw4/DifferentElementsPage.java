package hw4;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import hw4.enums.ButtonsAndColors;
import hw4.enums.ExpectedLogs;
import org.openqa.selenium.support.FindBy;


public class DifferentElementsPage extends BasePage {

    @FindBy(css = "div.main-content > div > button")
    public SelenideElement defaultBtn;

    @FindBy(css = "div.main-content > div > input")
    public SelenideElement inputBtn;

    @FindBy(css = "#mCSB_2")
    public SelenideElement rightSection;

    @FindBy(css = "#mCSB_1")
    public SelenideElement leftSection;

    @FindBy(css = "div#mCSB_2_container li:nth-child(1)")
    public SelenideElement lastLog;

    @FindBy(css = "select.uui-form-element")
    public SelenideElement dropDown;

    @FindBy(css = ".uui-form-element > option")
    public ElementsCollection dropDownColors;

    @FindBy(css = "div.checkbox-row > label")
    public ElementsCollection checkAndRadioBtn;

    private void clickBtn(ElementsCollection elementsCollection, ButtonsAndColors buttons) {
        elementsCollection.stream()
                .filter(selenideElement -> selenideElement.getText().equals(buttons.params))
                .findFirst()
                .orElse(null)
                .click();
    }


    //8 Check interface on Different elements page, it contains all needed elements
    public void verifyElements() {
        //fixed
        // TODO Take a look on IDEA warning.
        //Verify checkbox and radio buttons
        checkAndRadioBtn.forEach(SelenideElement::exists);

        //Verify dropdown
        dropDown.exists();

        //Verify buttons
        defaultBtn.exists();
        inputBtn.exists();
    }

    //9 Assert that there is Right Section
    public void checkRightSection() {
        rightSection.isDisplayed();
    }

    //10 Assert that there is Left Section
    public void checkLeftSection() {
        leftSection.isDisplayed();
    }

    //Click button and check log
    public void selectObjectAndCheckLog(ButtonsAndColors buttons, ExpectedLogs logs) {
        clickBtn(checkAndRadioBtn, buttons);
        lastLog.should(Condition.text(logs.parameter));
    }

    //Open dropdown, select color and check log
    public void selectColorAndCheckLog(ButtonsAndColors buttons, ExpectedLogs logs) {
        dropDown.click();
        clickBtn(dropDownColors, buttons);
        lastLog.should(Condition.text(logs.parameter));
    }

}
