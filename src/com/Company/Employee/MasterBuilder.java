package com.Company.Employee;

public class MasterBuilder extends Employee implements IEmployee {
    private int age;

    public  MasterBuilder(){
        super();
        this.age=0;
        super.setCostPerDay(1800);
    }

    public MasterBuilder(String name, int document, int phone, int age){
        super(name, document, phone, 1800);
        this.age=age;
    }


    @Override
    public void build() {
        System.out.println("i'm Master, and i Build");
    }

    @Override
    public String personalInfo(){
        return "Master Builder, Age: "+this.age+", "+super.personalInfo();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
