package com.Company.Employee;

public class Employee {
    private String name;
    private int document;
    private int phone;
    private int costPerDay;

    public Employee(){
        this.name="";
        this.document=0;
        this.phone=0;
        this.costPerDay=0;
    }

    public Employee(String name, int document, int phone, int costPerDay){
        this.name=name;
        this.document=document;
        this.phone=phone;
        this.costPerDay=costPerDay;
    }

    public String personalInfo(){
        return "Name: "+this.getName()+" Document: "+this.getDocument()+
                " Phone: "+this.getPhone()+" Cost Per Day: $"+getCostPerDay();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDocument() {
        return document;
    }

    public void setDocument(int document) {
        this.document = document;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getCostPerDay() {
        return costPerDay;
    }

    public void setCostPerDay(int costPerDay) {
        this.costPerDay = costPerDay;
    }
}
