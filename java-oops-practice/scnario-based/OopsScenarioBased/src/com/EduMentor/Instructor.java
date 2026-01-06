package com.EduMentor;
class Instructor extends User {

    public Instructor(int userId, String name, String email) {
        super(userId, name, email);
    }

    @Override
    public void printDetails() {
        System.out.println("Instructor: " + name + " | Email: " + email);
    }
}
