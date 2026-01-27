package com.annotationsandreflection.annotations.rolebasedaccesscontrol;

public class UserContext {

    private static String currentRole;

    public static void setRole(String role) {
        currentRole = role;
    }

    public static String getRole() {
        return currentRole;
    }
}
