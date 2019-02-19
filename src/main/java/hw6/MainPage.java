package hw6;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import hw6.enums.Users;
import hw6.utils.CollectionsUtils;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.page;

public class MainPage extends BasePage {

    @FindBy(css = "#user-name")
    public SelenideElement userName;

    @FindBy(css = "ul.uui-navigation.nav.navbar-nav.m-l8 > li.dropdown > a")
    public SelenideElement headerService;

    @FindBy(css = "div#mCSB_1_container ul > li:nth-child(3) > a > span")
    public SelenideElement leftMenuService;

    @FindBy(css = "li.dropdown.open > ul > li")
    public ElementsCollection headerServiceMenu;

    @FindBy(css = "li[index='3']  > ul.sub > li")
    public ElementsCollection leftServiceMenu;

    @FindBy(css = ".benefit-icon")
    public ElementsCollection images;

    @FindBy(css = ".benefit-txt")
    public ElementsCollection textsUnderImages;

    @FindBy(css = ".main-title")
    public SelenideElement headline;

    @FindBy(css = ".main-txt")
    public SelenideElement textUnderHeadline;


    public void checkUserNameAfterLogin(Users user) {
        userName.should(text(user.firstAndLastName));
    }


    public void checkifElemetsExist(ElementsCollection elementsCollection) {
        elementsCollection.forEach(SelenideElement::exists);
    }

    public void checkElement(SelenideElement selenideElement) {
        selenideElement.exists();
    }


}
