package hw6.utils;

import com.codeborne.selenide.ElementsCollection;

import java.util.List;
import java.util.stream.Collectors;

public class CollectionsUtils {
    public static boolean compareCollections(ElementsCollection elementsCollection, List<String> expected) {
        final List<String> listOfTexts = elementsCollection
                .stream()
                .map(selenideElement -> selenideElement.getText())
                .collect(Collectors.toList());
        if (listOfTexts.containsAll(expected)) {
            return true;
        }
        return false;
    }
}
