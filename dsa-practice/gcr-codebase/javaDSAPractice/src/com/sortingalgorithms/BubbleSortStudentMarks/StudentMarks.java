package com.sortingalgorithms.BubbleSortStudentMarks;
public class StudentMarks {
    private int[] marks;

    public StudentMarks(int[] marks) {
        this.marks = marks;
    }

    public int[] getMarks() {
        return marks;
    }

    public void displayMarks() {
        for (int mark : marks) {
            System.out.print(mark + " ");
        }
        System.out.println();
    }
}
