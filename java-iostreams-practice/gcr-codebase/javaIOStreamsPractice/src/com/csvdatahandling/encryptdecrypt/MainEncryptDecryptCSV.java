package com.csvdatahandling.encryptdecrypt;
import java.util.*;

public class MainEncryptDecryptCSV {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        SecureCSVService service = new SecureCSVService();

        System.out.print("Enter CSV path: ");
        String path = sc.nextLine();

        service.writeEncrypted(path);
        service.readDecrypted(path);
    }
}
