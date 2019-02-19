package hw6;

import com.codeborne.selenide.ElementsCollection;
import org.openqa.selenium.support.FindBy;

public class UserPage extends BasePage {
    @FindBy(xpath = "//tbody//tr//td//select[1]")
    public ElementsCollection dropdowns;

    @FindBy(xpath = "//tbody//tr//td//a")
    public ElementsCollection names;

    @FindBy(xpath = "//td/img")
    public ElementsCollection descImages;

    @FindBy(xpath = "//td/div/span")
    public ElementsCollection descTexts;

    @FindBy(xpath = "//td/div/input")
    public ElementsCollection checkBoxes;

    @FindBy(xpath = "//tbody//tr[2]//td[2]//select/option")
    public ElementsCollection droplist;

    @FindBy(xpath = "//tbody//tr//td[1]")
    public ElementsCollection numbers;


}
