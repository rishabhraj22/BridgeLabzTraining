package com.regexandjunit.regex.creditcardnumber;

public class CreditCardValidator {

    private static final String VISA = "^4\\d{15}$";
    private static final String MASTER = "^5\\d{15}$";

    public boolean isValid(String card) {
        return card != null && (card.matches(VISA) || card.matches(MASTER));
    }
}
