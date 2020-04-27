package com.Company;

import com.Company.Employee.Architect;
import com.Company.Employee.Employee;
import com.Company.Employee.MasterBuilder;
import com.Company.Employee.Worker;
import com.Company.Work.Work;

import java.util.ArrayList;
import java.util.List;

public class Company {
        private String name;
        private List<Employee> employeesList;
        private List<Work> worksList;

    public Company(){
        this.name="";
        this.employeesList= new ArrayList<>();
        this.worksList= new ArrayList<>();
    }

    public Company(String name){
        this.name=name;
        this.employeesList= new ArrayList<>();
        this.worksList= new ArrayList<>();
    }

    public void newEmployee(Employee newEmployee){
        this.employeesList.add(newEmployee);
    }


    public void newWork(Work newWork){
        this.worksList.add(newWork);
    }

    public void viewCompanyInfo(){
        System.out.println("Company Name: "+this.name);
        this.viewEmployeesList();
        this.viewWorkList();
    }
    public void viewEmployeesList(){
        System.out.println("Employee List: ");
        for (Employee employee : this.employeesList) {
            System.out.println(employee.personalInfo());
        }
    }

    public void viewWorkList(){
        System.out.println("Works List: ");
        for (Work work : this.worksList) {
            System.out.println(work.workInfo());
        }
    }


}
