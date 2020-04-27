package com.Company.Work;

public class Hotel extends CommercialWork {
    private int floorsNumber;

    public Hotel(){
        super();
        this.floorsNumber=0;
    }

    public Hotel(String adress, int squareMeters, int duration, int costPerSquareMeter, String workName, int floorsNumber){
        super(adress,squareMeters,duration,costPerSquareMeter, workName);
        this.floorsNumber=floorsNumber;
    }

    @Override
    public String workInfo() {
        return "Comercial Work, Hotel, Floors Number: "+this.floorsNumber+", "+super.workInfo();
    }

    public int getFloorsNumber() {
        return floorsNumber;
    }

    public void setFloorsNumber(int floorsNumber) {
        this.floorsNumber = floorsNumber;
    }
}
