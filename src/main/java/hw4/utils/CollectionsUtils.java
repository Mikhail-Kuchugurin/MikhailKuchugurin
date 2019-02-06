package hw4.utils;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class CollectionsUtils {
    public static void compareCollections(ElementsCollection elementsCollection, List<String> expected) {
        List<String> listOfTexts = new ArrayList<String>();
        for (SelenideElement i : elementsCollection) {
            i.exists();
            listOfTexts.add(i.getText());
        }
        Assert.assertTrue(listOfTexts.retainAll(expected));
    }
}
