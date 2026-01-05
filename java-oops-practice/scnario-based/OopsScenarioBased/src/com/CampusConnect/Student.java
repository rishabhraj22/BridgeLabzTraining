package com.CampusConnect;
import java.util.ArrayList;
import java.util.List;

class Student extends Person implements ICourseActions {

    private List<Course> courses = new ArrayList<>();
    private List<Integer> grades = new ArrayList<>(); // private for security

    public Student(int id, String name, String email) {
        super(id, name, email);
    }

    @Override
    public void enrollCourse(Course course) {
        courses.add(course);
        grades.add(0);
        course.addStudent(this);
        System.out.println(name + " enrolled in " + course.getCourseName());
    }

    @Override
    public void dropCourse(Course course) {
        int index = courses.indexOf(course);
        if (index != -1) {
            courses.remove(index);
            grades.remove(index);
            course.removeStudent(this);
            System.out.println(name + " dropped " + course.getCourseName());
        }
    }

    public void assignGrade(int courseIndex, int grade) {
        grades.set(courseIndex, grade);
    }

    public double calculateGPA() {
        int sum = 0;
        for (int g : grades) sum += g;
        return grades.isEmpty() ? 0 : (double) sum / grades.size();
    }

    @Override
    public void printDetails() {
        System.out.println("Student: " + name + " | GPA: " + calculateGPA());
    }
}
