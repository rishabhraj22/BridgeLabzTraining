package com.annotationsandreflection.annotations.rolebasedaccesscontrol;

public class Main {
    public static void main(String[] args) throws Exception {

        AdminService service = new AdminService();

        UserContext.setRole("USER");
        SecurityProcessor.execute(service, "deleteUser"); // denied

        UserContext.setRole("ADMIN");
        SecurityProcessor.execute(service, "deleteUser"); // allowed
    }
}
