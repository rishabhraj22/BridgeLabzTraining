package com.functionalinterface.dataserialization;
public class BackupMain {

    public static void main(String[] args) {
        UserData user = new UserData("Rishabh", 23);
        TempCache cache = new TempCache("SessionCache");

        BackupProcessor.processBackup(user);
        BackupProcessor.processBackup(cache);
    }
}
