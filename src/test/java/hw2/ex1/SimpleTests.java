package hw2.ex1;

import hw2.LoginPage;
import hw2.MainPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


// TODO Pay attention on imports.
// TODO Is this really necessary to specify full path to class ?
public class SimpleTests extends hw2.ex1.BeforeAndAfter {

    private static final int THREAD_POOL_SIZE = 3;
    private static final int INVOCATION_COUNT = 3;

    // TODO Could you please explain the idea of this DP ? What should you do in case the benefits on home page will be extended ?
    // TODO Read hw carefully please.
    @DataProvider(name = "LoginPass")
    public static Object[][] credentials() {
        return new Object[][]{
                {"epam", "1234"}};
    }



    @Test(dataProvider = "LoginPass",threadPoolSize = THREAD_POOL_SIZE, invocationCount = INVOCATION_COUNT)
    public void checkTextUnderImgPractice(String user, String pass) {
        MainPage mainPage = new LoginPage(webDriver.get()).performLogin(user, pass);
        Assert.assertEquals(mainPage.getTxtPractice().getText(), "To include good practices\n" + "and ideas from successful\n" + "EPAM project");
    }


    @Test(dataProvider = "LoginPass", threadPoolSize = THREAD_POOL_SIZE, invocationCount = INVOCATION_COUNT)
    public void checkTextUnderImgCustom(String user, String pass) {
        MainPage mainPage = new LoginPage(webDriver.get()).performLogin(user, pass);
        Assert.assertEquals(mainPage.getTxtCustom().getText(), "To be flexible and\n" + "customizable");
    }

    @Test(dataProvider = "LoginPass", threadPoolSize = THREAD_POOL_SIZE, invocationCount = INVOCATION_COUNT)
    public void checkTextUnderImgMulti(String user, String pass) {
        MainPage mainPage = new LoginPage(webDriver.get()).performLogin(user, pass);
        Assert.assertEquals(mainPage.getTxtMulti().getText(), "To be multiplatform");
    }

    @Test(dataProvider = "LoginPass", threadPoolSize = THREAD_POOL_SIZE, invocationCount = INVOCATION_COUNT)
    public void checkTextUnderImgBase(String user, String pass) {
        MainPage mainPage = new LoginPage(webDriver.get()).performLogin(user, pass);
        Assert.assertEquals(mainPage.getTxtBase().getText(), "Already have good base\n" + "(about 20 internal and\n" + "some external projects),\n" + "wish to get more…");
    }


}
