package hw2.ex1;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SimpleTests extends BeforeAndAfter {

    private static final int THREAD_POOL_SIZE = 2;
    private static final int INVOCATION_COUNT = 2;


    @DataProvider(name = "Results", parallel = true)
    public static Object[][] elements() {
        return new Object[][]{
                {"//span[contains(text(),'To include good practices')]", "To include good practices\nand ideas from successful\nEPAM project"},
                {"//span[contains(text(),'To be flexible')]", "To be flexible and\ncustomizable"},
                {"//span[contains(text(),'To be multiplatform')]", "To be multiplatform"},
                {"//span[contains(text(),'Already have good base')]", "Already have good base\n(about 20 internal and\nsome external projects),\nwish to get more…"}};

    }


    @Test(dataProvider = "Results", threadPoolSize = THREAD_POOL_SIZE, invocationCount = INVOCATION_COUNT)
    public void checkTextsUnderImages(String actual, String expected) {
        Assert.assertEquals(webDriver.get().findElement(By.xpath(actual)).getText(), expected);
    }


}
