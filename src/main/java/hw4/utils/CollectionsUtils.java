package hw4.utils;

import com.codeborne.selenide.ElementsCollection;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class CollectionsUtils {
    public static void compareCollections(ElementsCollection elementsCollection, List<String> expected) {
        // TODO This can be improved, take a look on List::containsAll or compare it by cycle.
        // TODO Basically, you should not use lambda expressions in this way.
        // TODO If you want to transform collection use stream.map method
        final List<String> listOfTexts = new ArrayList<>();
        elementsCollection.forEach(s -> listOfTexts.add(s.getText()));
        Assert.assertTrue(listOfTexts.retainAll(expected));
    }
}
