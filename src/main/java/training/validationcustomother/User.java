package training.validationcustomother;

public class User {

    @ValidLoginCredentials
    private Login login;

    public User(Login login) {
        this.login = login;
    }
}
