package org.example.singleton;

public class Loggers {
    private Loggers() {};
    private static Loggers instance = new Loggers();
    public static Loggers getInstance() {
        return instance;
    }
    private String message;

    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
}
