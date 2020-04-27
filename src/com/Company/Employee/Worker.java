package com.Company.Employee;

public class Worker extends Employee implements IEmployee {
    private int age;

    public Worker(){
        super();
        this.age=0;
        super.setCostPerDay(1500);
    }

    public Worker(String name, int document, int phone, int age){
        super(name, document, phone, 1500);
        this.age=age;
    }

    @Override
    public void build() {
        System.out.println("i'm Builder, and i Build");
    }

    @Override
    public String personalInfo(){
        return "Worker, Age: "+this.age+", "+super.personalInfo();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
