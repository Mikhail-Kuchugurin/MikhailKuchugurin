package hw4.enums;

// TODO Enum name has no relation with it purpose
// TODO You have 2 groups of elements
// TODO 1. 4 nature elements
// TODO 2. 4 colors
// TODO It will be better to create separate enum for each of that group
public enum ButtonsAndColors {
    WATER("Water"),
    WIND("Wind"),
    SELEN("Selen"),
    YELLOW("Yellow");

    public String params;

    ButtonsAndColors(String params) {
        this.params = params;
    }
}

