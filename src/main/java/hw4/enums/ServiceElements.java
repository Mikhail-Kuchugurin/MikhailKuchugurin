package hw4.enums;

import java.util.ArrayList;
import java.util.List;

public enum ServiceElements {
    SUPPORT("SUPPORT"),
    DATES("DATES"),
    COMPLEX_TABLE("COMPLEX TABLE"),
    SIMPLE_TABLE("SIMPLE TABLE"),
    TABLES_WITH_PAGES("TABLES WITH PAGES"),
    DIFFERENT_ELEMENTS("DIFFERENT ELEMENTS");

    String parameter;

    ServiceElements(String parameter) {
        this.parameter = parameter;
    }

    public static List<String> getValues() {
        List<String> values = new ArrayList<>();
        for (ServiceElements i : ServiceElements.values()) {
            values.add(i.parameter);
        }
        return values;
    }

}


