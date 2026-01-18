package com.javagenerics.AIDrivenResumeScreeningSystem;
public abstract class JobRole {

    private String candidateName;
    private int experience; // years

    public JobRole(String candidateName, int experience) {
        this.candidateName = candidateName;
        this.experience = experience;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public int getExperience() {
        return experience;
    }

    public abstract boolean isQualified();

    public abstract String getRoleName();

    @Override
    public String toString() {
        return "Candidate: " + candidateName +
               ", Experience: " + experience +
               " yrs, Role: " + getRoleName();
    }
}
