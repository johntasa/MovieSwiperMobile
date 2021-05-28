package ar.com.wolox.models;

public class Credentials {

    private String email;
    private String password;
    private String message;

    public Credentials(String email, String password, String message) {
        this.email = email;
        this.password = password;
        this.message = message;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getMessage() {
        return message;
    }
}
