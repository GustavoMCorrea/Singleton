package org.example.singleton;

public class Loggers {
    private Loggers() {};
    private static Loggers instance = new Loggers();
    public static Loggers getInstance() {
        return instance;
    }
    private String usario;
    private String login;
    private String logout;
    private String message;

    public String getUsario() {
        return usario;
    }

    public void setUsario(String usario) {
        this.usario = usario;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getLogout() {
        return logout;
    }

    public void setLogout(String logout) {
        this.logout = logout;
    }

    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
}
