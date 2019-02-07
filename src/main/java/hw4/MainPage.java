package hw4;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import hw4.enums.Users;
import hw4.utils.CollectionsUtils;
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


    //4 check user name
    public void checkUserNameAfterLogin(Users user) {
        userName.should(text(user.firstAndLastName));
    }

    //part 1, step 5 check that Header Service drop down contains options
    public void checkHeaderServiceMenu(List<String> list) {
        CollectionsUtils.compareCollections(headerServiceMenu, list);
    }

    //6 check that Left Service drop down contains options
    public void checkLeftServiceMenu(List<String> list)  {
        CollectionsUtils.compareCollections(leftServiceMenu, list);
    }

    //7 Open through the header menu Service -> Different Elements Page
    public DifferentElementsPage openDifferentElements() {
        headerService.click();
        headerServiceMenu.get(6).click();
        return page(DifferentElementsPage.class);
    }

    //part 2, step 5 Open through the header menu Service -> Dates Page
    public DatesPage openDatesPage() {
        headerService.click();
        headerServiceMenu.get(1).click();
        return page(DatesPage.class);
    }


}
