package hw6;

import com.codeborne.selenide.Selenide;
import hw6.enums.PageTitles;
import org.testng.Assert;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public abstract class BasePage {

    public BasePage() {
        Selenide.page(this);
    }

    public void checkPageTitle(PageTitles pageTitles) {
        Assert.assertEquals(getWebDriver().getTitle(), pageTitles.pageTitle);
    }

}
