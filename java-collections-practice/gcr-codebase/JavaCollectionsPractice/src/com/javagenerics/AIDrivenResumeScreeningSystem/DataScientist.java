package com.javagenerics.AIDrivenResumeScreeningSystem;
public class DataScientist extends JobRole {

    public DataScientist(String name, int exp) {
        super(name, exp);
    }

    @Override
    public boolean isQualified() {
        return getExperience() >= 3;
    }

    @Override
    public String getRoleName() {
        return "Data Scientist";
    }
}
