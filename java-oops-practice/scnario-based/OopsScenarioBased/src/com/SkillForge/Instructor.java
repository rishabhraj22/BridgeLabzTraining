package com.SkillForge;
class Instructor extends User {

    public Instructor(int userId, String name) {
        super(userId, name);
    }

    @Override
    public void showProfile() {
        System.out.println("Instructor: " + name + " (ID: " + userId + ")");
    }
}
