package com.pranay.parkingLot;

public abstract class Vehicle {
    private String regNumber;
    private int slotNumber;
    private String colour;

    public Vehicle(String regNumber, String colour) {
        this.regNumber = regNumber;
        this.colour = colour;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public int getSlotNumber() {
        return slotNumber;
    }

    public void setSlotNumber(int slotNumber) {
        this.slotNumber = slotNumber;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
