package com.functionalinterface.sensitivedatatagging;
public class CustomerRecord implements SensitiveData {

    private String name;
    private String accountNumber;

    public CustomerRecord(String name, String accountNumber) {
        this.name = name;
        this.accountNumber = accountNumber;
    }

    public String getInfo() {
        return "CustomerRecord [name=" + name + ", accountNumber=" + accountNumber + "]";
    }
}
