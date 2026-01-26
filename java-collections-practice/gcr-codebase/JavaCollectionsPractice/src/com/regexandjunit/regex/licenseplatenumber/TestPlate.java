package com.regexandjunit.regex.licenseplatenumber;
public class TestPlate {
    public static void main(String[] args) {
        LicensePlateValidator v = new LicensePlateValidator();

        System.out.println(v.isValid("AB1234")); // true
        System.out.println(v.isValid("A12345")); // false
    }
}
