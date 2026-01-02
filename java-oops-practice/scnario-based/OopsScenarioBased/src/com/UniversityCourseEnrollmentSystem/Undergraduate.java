package com.UniversityCourseEnrollmentSystem;

class Undergraduate extends Student {

    public Undergraduate(int id, String name) {
        super(id, name);
    }

    public Undergraduate(int id, String name, String elective) {
        super(id, name, elective);
    }

    @Override
    public void displayCategory() {
        System.out.println("Undergraduate Student");
    }
}

