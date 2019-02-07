package hw4.enums;

import java.util.ArrayList;
import java.util.List;

public enum ServiceElements {
    SUPPORT("Support"),
    DATES("Dates"),
    COMPLEX_TABLE("Complex Table"),
    SIMPLE_TABLE("Simple Table"),
    TABLES_WITH_PAGES("Tables With Pages"),
    DIFFERENT_ELEMENTS("Different Elements");

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


