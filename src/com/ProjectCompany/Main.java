package com.ProjectCompany;

import com.Company.Company;
import com.Company.Employee.Architect;
import com.Company.Employee.Employee;
import com.Company.Employee.MasterBuilder;
import com.Company.Employee.Worker;
import com.Company.Work.*;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Architect a1 = new Architect("Juan Fernandez",3225544,223123456,987412542);
        Architect a2 = new Architect("Jose Garcia",6546215,223584561,4562456);
        MasterBuilder m1 = new MasterBuilder("Carlos Sanchez",626916,115552465,56);
        MasterBuilder m2 = new MasterBuilder("Hector Perez",18963412,115552465,52);
        MasterBuilder m3 = new MasterBuilder("Gustavo Marquez",25965412,223552465,48);
        MasterBuilder m4 = new MasterBuilder("German Pique",37963412,221554855,51);
        Worker w1 = new Worker("Marcelo Ortiz", 31256321,221548666,32);
        Worker w2 = new Worker("Victor Martinez",32148966,223156152,33);
        Worker w3 = new Worker("Rodrigo Diaz",36423155,223556596,26);
        Worker w4 = new Worker("Armando Paredes", 30591959,1122255566,35);
        System.out.println(" ");
        System.out.println(" ");
        a1.createPlans();
        m1.build();
        w1.build();
        Thread.sleep(2000);
        Work c = new Commerce();
        System.out.println(" ");
        System.out.println(" ");

        Company c1 = new Company("The New Company");
        c1.newEmployee(a1);
        c1.newEmployee(a2);
        c1.newEmployee(m1);
        c1.newEmployee(m2);
        c1.newEmployee(m3);
        c1.newEmployee(m4);
        c1.newEmployee(w1);
        c1.newEmployee(w2);
        c1.newEmployee(w3);
        c1.newEmployee(w4);
        c1.viewEmployeesList();
        Thread.sleep(2000);
        System.out.println(" ");
        System.out.println(" ");

        Commerce wc1 = new Commerce("San Lorenzo 2800",52,15,250,"Bruder","Bar");
        wc1.verifyEmployeeList();
        wc1.addArchitectsOnList(a1);
        wc1.addArchitectsOnList(a2);
        Thread.sleep(2000);
        System.out.println(" ");
        System.out.println(" ");
        wc1.addMasterBuildersOnList(m1);
        wc1.addWorkersOnList(w1);
        wc1.addWorkersOnList(w2);
        Thread.sleep(2000);

        System.out.println(" ");
        System.out.println(" ");
        wc1.verifyEmployeeList();
        wc1.viewEmployeesList();
        Thread.sleep(2000);

        System.out.println(" ");
        System.out.println(" ");

       Hotel wh1 = new Hotel("Boulevard Maritimo 1234",320,45,120,"Hotel Costa del Sol",7);

        wh1.addArchitectsOnList(a2);
        wh1.addMasterBuildersOnList(m1);
        wh1.addMasterBuildersOnList(m2);
        wh1.addMasterBuildersOnList(m3);
        wh1.addMasterBuildersOnList(m4);
        Thread.sleep(2000);

        System.out.println(" ");
        System.out.println(" ");

        wh1.addWorkersOnList(w3);
        wh1.addWorkersOnList(w4);
        wh1.verifyEmployeeList();
        wh1.viewEmployeesList();
        Thread.sleep(2000);

        System.out.println(" ");
        System.out.println(" ");

        DomesticWork dw1 = new DomesticWork("Lopez de Gomara 4546",78,10,320,4);

        dw1.addMasterBuildersOnList(m4);
        dw1.addWorkersOnList(w3);
        dw1.addWorkersOnList(w4);
        Thread.sleep(2000);

        System.out.println(" ");
        System.out.println(" ");

        dw1.verifyEmployeeList();
        dw1.viewEmployeesList();


        Thread.sleep(2000);

        System.out.println(" ");
        System.out.println(" ");

        c1.newWork(wc1);

        c1.newWork(wh1);

        c1.newWork(dw1);

        Thread.sleep(2000);

        System.out.println(" ");
        System.out.println(" ");
        c1.viewWorkList();

        Thread.sleep(2000);

        System.out.println(" ");
        System.out.println(" ");
        c1.viewEmployeesList();

        Thread.sleep(2000);

        System.out.println(" ");
        System.out.println(" ");

        c1.viewCompanyInfo();
    }
}
