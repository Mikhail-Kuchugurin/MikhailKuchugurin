package hw4.utils;

import com.codeborne.selenide.ElementsCollection;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class CollectionsUtils {
    public static void compareCollections(ElementsCollection elementsCollection, List<String> expected) {
        final List<String> listOfTexts = new ArrayList<String>();
        elementsCollection.forEach(s -> listOfTexts.add(s.getText()));
        Assert.assertTrue(listOfTexts.retainAll(expected));
    }
}
