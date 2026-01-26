package com.regexandjunit.junit.stringutilitymethods;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    private StringUtils utils;

    @BeforeEach
    void setUp() {
        utils = new StringUtils();
    }

    @Test
    @DisplayName("Reverse should return reversed string")
    void testReverse() {
        assertEquals("avaJ", utils.reverse("Java"));
    }

    @Test
    @DisplayName("Palindrome check should return true for palindrome")
    void testPalindromeTrue() {
        assertTrue(utils.isPalindrome("madam"));
    }

    @Test
    @DisplayName("Palindrome check should return false for non-palindrome")
    void testPalindromeFalse() {
        assertFalse(utils.isPalindrome("hello"));
    }

    @Test
    @DisplayName("Uppercase conversion should work correctly")
    void testToUpperCase() {
        assertEquals("HELLO", utils.toUpperCase("hello"));
    }

    @Test
    @DisplayName("Reverse null should return null")
    void testReverseNull() {
        assertNull(utils.reverse(null));
    }
}
