package com.UniversityCourseEnrollmentSystem;

class Postgraduate extends Student {

    public Postgraduate(int id, String name) {
        super(id, name);
    }

    @Override
    public void displayCategory() {
        System.out.println("Postgraduate Student");
    }
}

