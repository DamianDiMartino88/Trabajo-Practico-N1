package com.Company.Work;

import com.Company.Company;
import com.Company.Employee.Architect;
import com.Company.Employee.Employee;
import com.Company.Employee.MasterBuilder;
import com.Company.Employee.Worker;

import java.util.ArrayList;
import java.util.List;

public class Work extends Company {

    private String adress;
    private int squareMeters;
    private int duration;
    private int costPerSquareMeter;
    private List<Employee> workEmployeesList;

    public Work(){
        this.adress = "";
        this.squareMeters = 0;
        this.duration = 0;
        this.costPerSquareMeter = 0;
        this.workEmployeesList = new ArrayList<>();
    }

    public Work(String adress, int squareMeters, int duration, int costPerSquareMeter){
        this.adress = adress;
        this.squareMeters = squareMeters;
        this.duration = duration;
        this.costPerSquareMeter = costPerSquareMeter;
        this.workEmployeesList = new ArrayList<>();
    }

    public int workCost(){
        int workCost=(this.costPerSquareMeter*this.squareMeters)+(this.workCostPerDay()*duration);

        return workCost;
    }

    public int workCostPerDay(){
        int totalCost=0;
        for (Employee employee : this.workEmployeesList) {
            totalCost=totalCost+employee.getCostPerDay();
        }
        return totalCost;
    }

    public void addToEmployeeList(Employee newEmployee){
        int architect=0,masterBuilder=0,worker=0;
        if(newEmployee instanceof Architect){
            addArchitectsOnList(newEmployee);
        }
        if(newEmployee instanceof MasterBuilder){
            addMasterBuildersOnList(newEmployee);
        }
        if(newEmployee instanceof Worker){
            addWorkersOnList(newEmployee);
        }
    }

    public void verifyEmployeeList(){
        int architect=0,masterBuilder=0,worker=0;
        for (Employee employee : this.workEmployeesList) {
            architect=(employee instanceof Architect)?architect+1:architect+0;
            masterBuilder=(employee instanceof MasterBuilder)?masterBuilder+1:masterBuilder+0;
            worker=(employee instanceof Worker)?worker+1:worker+0;
        }
        System.out.println((architect<1)?"Architects: "+architect+", This Work don't have any Architect":"This Work has 1 Architect on the list");
        System.out.println((masterBuilder<1)?"Master Builders: "+masterBuilder+", This Work can't have 0 Master Builder":"This Work has "+masterBuilder+" Master Builders on the list");
        System.out.println((worker<2)?"Workers: "+worker+", This Work don't have enought Workers, at leats you need 2":"This Work has "+worker+" Workers on the list");
    }

    public int addArchitectsOnList(Employee newEmployee){
        int architect=0;
        for (Employee employee : this.workEmployeesList) {
            architect=(employee instanceof Architect)?architect+1:architect+0;
        }
        if(architect<1){
            this.workEmployeesList.add(newEmployee);
            System.out.println("Architect has been added to Employe List for this Work");
        }else{
            System.out.println("Can't be more than one Architect in this Project");
        }
        return architect;
    }

    public int addMasterBuildersOnList(Employee newEmployee){
        int masterBuilder=0;
        for (Employee employee : this.workEmployeesList) {
            masterBuilder=(employee instanceof MasterBuilder)?masterBuilder+1:masterBuilder+0;
        }
        if(masterBuilder<3){
            this.workEmployeesList.add(newEmployee);
            System.out.println("Master Builder has been added to Employe List for this Work");
        }else{
            System.out.println("Can't be more than three Master Builders in this Project");
        }
        return masterBuilder;
    }

    public int addWorkersOnList(Employee newEmployee){
        int worker=0;
        for (Employee employee : this.workEmployeesList) {
            worker=(employee instanceof Worker)?worker+1:worker+0;
        }
            this.workEmployeesList.add(newEmployee);
        System.out.println("Worker has been added to Employe List for this Work");
        return worker;
    }


    public void viewEmployeesList(){
        for (Employee employee : this.workEmployeesList) {
            System.out.println(employee.personalInfo());
        }
    }

    public String workInfo(){
        return " Adress: "+this.adress+", Duration: "+this.duration+" Square Metter: "
                +this.squareMeters+" Cost Per Square Metter: $"
                +this.costPerSquareMeter+" Total Cost: $"+this.workCost();
    }


    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getSquareMeters() {
        return squareMeters;
    }

    public void setSquareMeters(int squareMeters) {
        this.squareMeters = squareMeters;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getCostPerSquareMeter() {
        return costPerSquareMeter;
    }

    public void setCostPerSquareMeter(int costPerSquareMeter) {
        this.costPerSquareMeter = costPerSquareMeter;
    }

    public List<Employee> getWorkEmployeesList() {
        return workEmployeesList;
    }

    public void setWorkEmployeesList(List<Employee> workEmployeesList) {
        this.workEmployeesList = workEmployeesList;
    }
}
