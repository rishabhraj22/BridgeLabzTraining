package com.functionalinterface.sensitivedatatagging;
public class SecurityProcessor {

    public static void process(Object obj) {
        if (obj instanceof SensitiveData) {
            System.out.println("🔒 Encrypting sensitive object: " + obj.getClass().getSimpleName());
        } else {
            System.out.println("✅ No encryption needed for: " + obj.getClass().getSimpleName());
        }
    }
}
