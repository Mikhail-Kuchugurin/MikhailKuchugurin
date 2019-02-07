package hw4;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;


public class DifferentElementsPage extends BasePage {

    @FindBy(css = "div.colors > select")
    public SelenideElement dropDownList;

    @FindBy(css = "div.main-content > div > button")
    public SelenideElement defaultBtn;

    @FindBy(css = "div.main-content > div > input")
    public SelenideElement inputBtn;

    @FindBy(css = "#mCSB_2")
    public SelenideElement rightSection;

    @FindBy(css = "#mCSB_1")
    public SelenideElement leftSection;

    @FindBy(css = ".label-checkbox")
    public ElementsCollection checkBoxes;

    @FindBy(css = ".label-radio")
    public ElementsCollection radioBtns;

    //8 Check interface on Different elements page, it contains all needed elements
    public void doElementsExist() {
        //Verify checkbox
        checkBoxes.forEach(s -> s.exists());

        //Verify radio buttons
        radioBtns.forEach(s -> s.exists());

        //Verify dropdown
        dropDownList.exists();

        //Verify buttons
        defaultBtn.exists();
        inputBtn.exists();

    }

    //9 Assert that there is Right Section
    public void isRightSectionDisplayed() {
        rightSection.isDisplayed();
    }

    //10 Assert that there is Left Section
    public void isLeftSectionDisplayed() {
        leftSection.isDisplayed();
    }

    //Steps 11-18. Click button and check log
    public void selectObjectAndCheckLog(String btnLct, String actualResultLocator, String expectedResult) {
        $(By.cssSelector(btnLct)).click();
        $(By.cssSelector(actualResultLocator)).should(text(expectedResult));
    }


}
