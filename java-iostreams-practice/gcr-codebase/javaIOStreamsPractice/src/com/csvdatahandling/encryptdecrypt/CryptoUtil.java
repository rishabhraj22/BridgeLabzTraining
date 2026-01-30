package com.csvdatahandling.encryptdecrypt;
import java.util.Base64;

public class CryptoUtil {

    public static String encrypt(String data) {
        return Base64.getEncoder().encodeToString(data.getBytes());
    }

    public static String decrypt(String data) {
        return new String(Base64.getDecoder().decode(data));
    }
}
