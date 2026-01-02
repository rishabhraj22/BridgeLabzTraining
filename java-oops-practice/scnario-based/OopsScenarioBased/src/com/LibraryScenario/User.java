package com.LibraryScenario;

class User {
    private String userId;
    private String name;

    User(String userId, String name) {
        this.userId = userId;
        this.name = name;
    }

    String getName() {
        return name;
    }
}

