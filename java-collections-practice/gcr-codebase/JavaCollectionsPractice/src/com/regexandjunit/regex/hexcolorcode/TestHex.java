package com.regexandjunit.regex.hexcolorcode;
public class TestHex {
    public static void main(String[] args) {
        HexColorValidator v = new HexColorValidator();

        System.out.println(v.isValid("#FFA500")); // true
        System.out.println(v.isValid("#ff4500")); // true
        System.out.println(v.isValid("#123"));    // false
    }
}
