package com.EduMentor;
class Learner extends User implements ICertifiable {

    private String courseType; // short / full-time
    private double percentage;

    public Learner(int userId, String name, String email, String courseType) {
        super(userId, name, email);
        this.courseType = courseType;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    @Override
    public void generateCertificate() {
        if (courseType.equalsIgnoreCase("short")) {
            System.out.println("📜 Short Course Certificate generated for " + name);
        } else {
            System.out.println("🎓 Full-Time Course Certificate generated for " + name);
        }
    }

    @Override
    public void printDetails() {
        System.out.println("Learner: " + name + " | Course Type: " + courseType + " | Score: " + percentage + "%");
    }
}
