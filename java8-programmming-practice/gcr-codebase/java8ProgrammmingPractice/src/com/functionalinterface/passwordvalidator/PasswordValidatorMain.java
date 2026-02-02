package com.functionalinterface.passwordvalidator;
import java.util.Scanner;

public class PasswordValidatorMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        if (SecurityUtils.isStrongPassword(password)) {
            System.out.println("✅ Strong password");
        } else {
            System.out.println("❌ Weak password");
        }

        sc.close();
    }
}
