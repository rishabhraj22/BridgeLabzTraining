package com.functionalinterface.cloningprototypeobjects;
public class Employee implements Cloneable {

    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone(); // shallow copy
    }

    public String getInfo() {
        return "Employee [id=" + id + ", name=" + name + "]";
    }
}
