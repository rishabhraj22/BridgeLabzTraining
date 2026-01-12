package com.CallCenter;
import java.util.Comparator;

public class VIPComparator implements Comparator<Customer> {

    @Override
    public int compare(Customer c1, Customer c2) {
        // VIP customers should come first
        if (c1.isVIP() && !c2.isVIP()) {
            return -1;
        } else if (!c1.isVIP() && c2.isVIP()) {
            return 1;
        } else {
            return 0;
        }
    }
}
