package hw3.enums;

// TODO It is not really necessary to store whole data on one certain Enum.
// TODO You can split it with some logic.
// TODO For the example, Menu items can be stored into different Enum (related with MainPage::line64)
public enum TextOfElements {
    PRACTICE("To include good practices\nand ideas from successful\nEPAM project"),
    CUSTOM("To be flexible and\ncustomizable"),
    MULTI("To be multiplatform"),
    BASE("Already have good base\n(about 20 internal and\nsome external projects),\nwish to get more…"),
    HEADER_TITLE("EPAM FRAMEWORK WISHES…"),
    HEADER_TEXT("LOREM IPSUM DOLOR SIT AMET, CONSECTETUR ADIPISICING ELIT, SED DO EIUSMOD TEMPOR INCIDIDUNT " +
            "UT LABORE ET DOLORE MAGNA ALIQUA. UT ENIM AD MINIM VENIAM, QUIS NOSTRUD EXERCITATION ULLAMCO LABORIS " +
            "NISI UT ALIQUIP EX EA COMMODO CONSEQUAT DUIS AUTE IRURE DOLOR IN REPREHENDERIT IN VOLUPTATE VELIT ESSE " +
            "CILLUM DOLORE EU FUGIAT NULLA PARIATUR."),
    MENU_HOME("HOME"),
    MENU_CONTACT_FROM("CONTACT FORM"),
    MENU_SERVICE("SERVICE"),
    MENU_METAL_COLORS("METALS & COLORS"),
    SUB_HEADER("JDI GITHUB");


    public String elementsText;

    TextOfElements(String elementsText) {
        this.elementsText = elementsText;
    }
}
