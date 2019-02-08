package hw4.utils;

import com.codeborne.selenide.ElementsCollection;

import java.util.List;
import java.util.stream.Collectors;

public class CollectionsUtils {
    public static void compareCollections(ElementsCollection elementsCollection, List<String> expected) {
        //fixed
        // TODO This can be improved, take a look on List::containsAll or compare it by cycle.
        // TODO Basically, you should not use lambda expressions in this way.
        // TODO If you want to transform collection use stream.map method
        final List<String> listOfTexts = elementsCollection
                .stream()
                .map(selenideElement -> selenideElement.getText())
                .collect(Collectors.toList());
        listOfTexts.containsAll(expected);
    }
}
