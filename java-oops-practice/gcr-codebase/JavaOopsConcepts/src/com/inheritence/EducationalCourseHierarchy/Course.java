package com.inheritence.EducationalCourseHierarchy;

//Base class
class Course {
 String courseName;
 int duration; // in hours

 Course(String courseName, int duration) {
     this.courseName = courseName;
     this.duration = duration;
 }

 void displayDetails() {
     System.out.println("Course Name: " + courseName);
     System.out.println("Duration: " + duration + " hours");
 }
}

