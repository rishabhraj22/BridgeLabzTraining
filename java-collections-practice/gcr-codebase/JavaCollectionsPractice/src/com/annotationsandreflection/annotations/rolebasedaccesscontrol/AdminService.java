package com.annotationsandreflection.annotations.rolebasedaccesscontrol;

public class AdminService {

    @RoleAllowed("ADMIN")
    public void deleteUser() {
        System.out.println("User deleted successfully!");
    }

    public void viewUser() {
        System.out.println("Viewing user data...");
    }
}
