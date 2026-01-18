package com.javagenerics.AIDrivenResumeScreeningSystem;
public class ResumeScreeningUtil {

    public static <T extends JobRole> void screenResume(Resume<T> resume) {
        System.out.println("\nScreening resume for: " + resume.getJobRole().getCandidateName());

        if (resume.getJobRole().isQualified()) {
            System.out.println("✅ Shortlisted for " + resume.getJobRole().getRoleName());
        } else {
            System.out.println("❌ Not qualified for " + resume.getJobRole().getRoleName());
        }
    }
}
