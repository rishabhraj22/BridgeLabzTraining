package com.functionalinterface.sensitivedatatagging;
public class PublicNotice {

    private String message;

    public PublicNotice(String message) {
        this.message = message;
    }

    public String getInfo() {
        return "PublicNotice [message=" + message + "]";
    }
}
