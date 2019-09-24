package com.example.EmployeeRegistration.Entity;

public class Employee {
    int id;
    String name,Desg;

    public Employee(int id,String name,String Desg) {
        this.id = id;
        this.name=name;
        this.Desg=Desg;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesg() {
        return Desg;
    }

    public void setDesg(String desg) {
        Desg = desg;
    }

    public Employee()
    {

    }

}
