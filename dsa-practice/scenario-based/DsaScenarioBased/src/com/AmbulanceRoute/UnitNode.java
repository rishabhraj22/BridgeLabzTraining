package com.AmbulanceRoute;
public class UnitNode {

    String unitName;
    boolean available;
    UnitNode next;

    public UnitNode(String unitName, boolean available) {
        this.unitName = unitName;
        this.available = available;
        this.next = null;
    }
}
