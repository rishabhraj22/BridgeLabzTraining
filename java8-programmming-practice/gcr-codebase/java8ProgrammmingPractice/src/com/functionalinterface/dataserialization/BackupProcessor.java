package com.functionalinterface.dataserialization;
public class BackupProcessor {

    public static void processBackup(Object obj) {
        if (obj instanceof java.io.Serializable) {
            System.out.println("Backing up object: " + obj.getClass().getSimpleName());
        } else {
            System.out.println("❌ Object is NOT eligible for backup: " + obj.getClass().getSimpleName());
        }
    }
}
