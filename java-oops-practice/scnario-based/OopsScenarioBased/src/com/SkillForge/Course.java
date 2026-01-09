package com.SkillForge;
class Course {
    private String title;
    private Instructor instructor;
    private String[] modules;
    private double rating; // protected logic
    private String[] reviews; // read-only externally

    public Course(String title, Instructor instructor) {
        this.title = title;
        this.instructor = instructor;
        this.modules = new String[]{"Introduction", "Basics", "Advanced"};
        this.reviews = new String[5];
        this.rating = 0;
    }

    public Course(String title, Instructor instructor, String[] modules) {
        this.title = title;
        this.instructor = instructor;
        this.modules = modules;
        this.reviews = new String[5];
        this.rating = 0;
    }

    public int getModuleCount() {
        return modules.length;
    }

    public void showCourse() {
        System.out.println("\nCourse: " + title);
        System.out.println("Instructor: " + instructor.name);
        System.out.println("Modules:");
        for (int i = 0; i < modules.length; i++) {
            System.out.println((i + 1) + ". " + modules[i]);
        }
        System.out.println("Rating: " + rating);
    }

    // Encapsulated rating logic
    protected void updateRating(double newRating) {
        rating = (rating + newRating) / 2;
    }

    // Read-only access to reviews
    public void showReviews() {
        System.out.println("\n--- Course Reviews ---");
        for (String r : reviews) {
            if (r != null) System.out.println(r);
        }
    }

    public void addReview(String review) {
        for (int i = 0; i < reviews.length; i++) {
            if (reviews[i] == null) {
                reviews[i] = review;
                break;
            }
        }
    }
}
