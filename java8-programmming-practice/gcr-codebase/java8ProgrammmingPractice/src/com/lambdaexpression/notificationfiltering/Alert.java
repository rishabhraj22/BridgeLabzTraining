package com.lambdaexpression.notificationfiltering;
public class Alert {

    private String message;
    private String type;

    public Alert(String message, String type) {
        this.message = message;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "[" + type + "] " + message;
    }
}
