package hw3;

public enum Users {
    PITER("epam" , "1234" , "PITER CHAILOVSKII");
    public String login;
    public String pass;
    public String FirstAndLastName;

    Users(String login, String pass, String firstAndLastName) {
        this.login = login;
        this.pass = pass;
        this.FirstAndLastName = firstAndLastName;
    }

}
