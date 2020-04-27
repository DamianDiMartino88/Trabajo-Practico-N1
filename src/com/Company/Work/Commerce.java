package com.Company.Work;

import java.util.Objects;

public class Commerce extends CommercialWork {
    private String businessArea;

    public Commerce(){
        super();
        this.businessArea="";
    }

    public Commerce(String adress, int squareMeters, int duration, int costPerSquareMeter, String workName, String businessarea){
        super(adress, squareMeters, duration, costPerSquareMeter, workName);
        this.businessArea=businessarea;
    }

    @Override
    public String workInfo() {
        return "Comercial Work, Commerce, Business Area: "+this.businessArea+", "+super.workInfo();
    }

    public String getBusinessArea() {
        return businessArea;
    }

    public void setBusinesArea(String businessArea) {
        this.businessArea = businessArea;
    }

}
