package hw4.enums;

public enum ExpectedLogs {
    WATER_TRUE("Water: condition changed to true"),
    WIND_TRUE("Wind: condition changed to true"),
    SELEN("metal: value changed to Selen"),
    YELLOW("Colors: value changed to Yellow"),
    WATER_FALSE("Water: condition changed to false"),
    WIND_FALSE("Wind: condition changed to false");

    public String parameter;

    ExpectedLogs(String parameter) {
        this.parameter = parameter;
    }
}
