package com.javagenerics.AIDrivenResumeScreeningSystem;
public class SoftwareEngineer extends JobRole {

    public SoftwareEngineer(String name, int exp) {
        super(name, exp);
    }

    @Override
    public boolean isQualified() {
        return getExperience() >= 2;
    }

    @Override
    public String getRoleName() {
        return "Software Engineer";
    }
}
