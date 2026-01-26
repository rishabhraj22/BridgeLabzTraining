package com.regexandjunit.regex.validateusername;
public class TestUsername {
    public static void main(String[] args) {
        UsernameValidator v = new UsernameValidator();

        System.out.println(v.isValid("user_123")); // true
        System.out.println(v.isValid("123user"));  // false
        System.out.println(v.isValid("us"));       // false
    }
}
