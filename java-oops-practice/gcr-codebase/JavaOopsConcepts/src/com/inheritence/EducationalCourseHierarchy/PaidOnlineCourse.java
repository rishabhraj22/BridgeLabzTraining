package com.inheritence.EducationalCourseHierarchy;

//Final subclass
class PaidOnlineCourse extends OnlineCourse {
 double fee;
 double discount; // percentage

 PaidOnlineCourse(String courseName, int duration,
                  String platform, boolean isRecorded,
                  double fee, double discount) {
     super(courseName, duration, platform, isRecorded);
     this.fee = fee;
     this.discount = discount;
 }

 @Override
 void displayDetails() {
     super.displayDetails();
     System.out.println("Course Fee: ₹" + fee);
     System.out.println("Discount: " + discount + "%");
     System.out.println("Final Price: ₹" + (fee - (fee * discount / 100)));
 }
}

