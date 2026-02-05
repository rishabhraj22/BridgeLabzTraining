package com.functionalinterface.dataserialization;
public class TempCache {

    private String cacheName;

    public TempCache(String cacheName) {
        this.cacheName = cacheName;
    }

    public String getInfo() {
        return "TempCache [cacheName=" + cacheName + "]";
    }
}
