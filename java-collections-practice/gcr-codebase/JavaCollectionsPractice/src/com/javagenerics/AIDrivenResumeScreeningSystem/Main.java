package com.javagenerics.AIDrivenResumeScreeningSystem;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<JobRole> pipeline = new ArrayList<>();

        System.out.print("Enter number of candidates: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {

            System.out.println("\nChoose Role:");
            System.out.println("1. Software Engineer");
            System.out.println("2. Data Scientist");
            System.out.println("3. Product Manager");

            int choice = sc.nextInt();
            sc.nextLine();

            System.out.print("Candidate name: ");
            String name = sc.nextLine();

            System.out.print("Experience (years): ");
            int exp = sc.nextInt();
            sc.nextLine();

            JobRole role = null;

            switch (choice) {
                case 1: role = new SoftwareEngineer(name, exp); break;
                case 2: role = new DataScientist(name, exp); break;
                case 3: role = new ProductManager(name, exp); break;
                default:
                    System.out.println("Invalid choice");
                    i--;
                    continue;
            }

            pipeline.add(role);

            ResumeScreeningUtil.screenResume(new Resume<>(role));
        }

        System.out.println("\n📋 Screening Pipeline Summary:");
        PipelineUtil.processPipeline(pipeline);

        sc.close();
    }
}
