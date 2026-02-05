package com.functionalinterface.sensitivedatatagging;
public class SensitiveDataMain {

    public static void main(String[] args) {
        CustomerRecord customer = new CustomerRecord("Ravi", "1234-5678-9999");
        PublicNotice notice = new PublicNotice("Office will be closed tomorrow");

        SecurityProcessor.process(customer);
        SecurityProcessor.process(notice);
    }
}
