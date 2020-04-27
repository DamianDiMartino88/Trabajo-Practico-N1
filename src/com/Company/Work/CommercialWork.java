package com.Company.Work;

public class CommercialWork extends Work{
    private String workName;

    public CommercialWork(){
        super();
        this.workName="";
    }

    public CommercialWork(String adress, int squareMeters, int duration, int costPerSquareMeter, String workName){
        super(adress, squareMeters, duration, costPerSquareMeter);
        this.workName=workName;
    }

    public String getWorkName() {
        return workName;
    }

    public void setWorkName(String workName) {
        this.workName = workName;
    }

    @Override
    public String workInfo() {
        return "Work Name: "+this.workName+", "+super.workInfo();
    }
}
