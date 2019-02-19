package hw6.enums;

public enum Users {
    PITER("epam", "1234", "PITER CHAILOVSKII");
    public String login;
    public String pass;
    public String firstAndLastName;

    Users(String login, String pass, String firstAndLastName) {
        this.login = login;
        this.pass = pass;
        this.firstAndLastName = firstAndLastName;
    }

}
