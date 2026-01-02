package com.CourseManagement;

import java.util.HashSet;
import java.util.Set;

public class PaidOnlineCourse extends OnlineCourse {

    private double fee;
    private double discount; // %
    private Set<String> enrolledStudents; // uniqueness

    public PaidOnlineCourse(String courseName, int duration,
                            String platform, boolean isRecorded,
                            double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
        this.enrolledStudents = new HashSet<>();
    }

    public double calculateFinalFee() {
        return fee - (fee * discount / 100);
    }

    public void enrollStudent(String studentName) {
        enrolledStudents.add(studentName);
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Fee: ₹" + fee);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Final Fee: ₹" + calculateFinalFee());
        System.out.println("Enrolled Students: " + enrolledStudents.size());
    }
}

