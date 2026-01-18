package com.javagenerics.AIDrivenResumeScreeningSystem;
public class ProductManager extends JobRole {

    public ProductManager(String name, int exp) {
        super(name, exp);
    }

    @Override
    public boolean isQualified() {
        return getExperience() >= 4;
    }

    @Override
    public String getRoleName() {
        return "Product Manager";
    }
}
