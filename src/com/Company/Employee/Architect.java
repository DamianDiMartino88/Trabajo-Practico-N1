package com.Company.Employee;

public class Architect extends Employee {
    private int registrationNumber;

    public Architect(){
        super();
        this.registrationNumber=0;
        super.setCostPerDay(2000);
    }

    public Architect(String name, int document, int phone, int registrationNumber){
        super(name, document, phone, 2000);
        this.registrationNumber=registrationNumber;
    }

    public void createPlans(){
        System.out.println("Creating my next Shot");
    }

    @Override
    public String personalInfo(){
        return "Architect, Registrarion Number: "+this.registrationNumber+", "+super.personalInfo();
    }

    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(int registrationNumber) {
        this.registrationNumber = registrationNumber;
    }
}
