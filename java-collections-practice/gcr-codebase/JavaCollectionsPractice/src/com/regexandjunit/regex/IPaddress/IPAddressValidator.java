package com.regexandjunit.regex.IPaddress;

public class IPAddressValidator {

    private static final String IP_REGEX =
            "^((25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)\\.){3}" +
            "(25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)$";

    public boolean isValid(String ip) {
        return ip != null && ip.matches(IP_REGEX);
    }
}
