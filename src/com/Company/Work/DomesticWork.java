package com.Company.Work;

public class DomesticWork extends Work {
        private int roomsNumber;

    public DomesticWork(){
        super();
        this.roomsNumber=0;
    }

    public DomesticWork(String adress, int squareMeters, int duration, int costPerSquareMeter,int roomsNumber){
        super(adress, squareMeters, duration, costPerSquareMeter);
        this.roomsNumber=roomsNumber;
    }

    @Override
    public String workInfo() {
        return "Domestic Work, Rooms Number: "+this.roomsNumber+", "+super.workInfo();
    }

    public int getRoomsNumber() {
        return roomsNumber;
    }

    public void setRoomsNumber(int roomsNumber) {
        this.roomsNumber = roomsNumber;
    }
}
