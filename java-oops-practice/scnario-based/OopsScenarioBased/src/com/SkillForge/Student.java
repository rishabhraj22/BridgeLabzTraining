package com.SkillForge;
class Student extends User implements ICertifiable {

    private int completedModules = 0;
    private int totalModules = 0;
    private double progress = 0;

    public Student(int userId, String name) {
        super(userId, name);
    }

    public void setTotalModules(int totalModules) {
        this.totalModules = totalModules;
    }

    public void completeModule() {
        if (completedModules < totalModules) {
            completedModules++;
            progress = ((double) completedModules / totalModules) * 100;
            System.out.println("Module completed! Progress: " + progress + "%");
        } else {
            System.out.println("All modules already completed.");
        }
    }

    public double getProgress() {
        return progress;
    }

    @Override
    public void generateCertificate() {
        if (progress == 100) {
            System.out.println("🎓 Certificate Generated for " + name);
        } else {
            System.out.println("❌ Complete all modules to get certificate.");
        }
    }

    @Override
    public void showProfile() {
        System.out.println("Student: " + name + " (ID: " + userId + ")");
        System.out.println("Progress: " + progress + "%");
    }
}
