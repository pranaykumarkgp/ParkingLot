package com.pranay.parkingLot;

import java.util.HashMap;
import java.util.Map;
import java.util.*;

//import lombok.*;
public class ParkingLot {

    public int size = 0;
    public List<Integer> availableSlotsList = new ArrayList<>();
    public Map<Integer,Vehicle> slotAndCarMap = new HashMap<>();

    public void createParkingLot(int i) {
        this.size = i;
        for(int j = 0;j<i;j++){
            availableSlotsList.add(j);
        }

    }

    public void park(Vehicle vehicle) {
        if(this.size == 0){
            System.out.println("Parking lot is not created");
        }
        if(this.availableSlotsList.size() == 0){
            System.out.println("Parking lot is full");
        }

        Collections.sort(availableSlotsList);
        int temp = availableSlotsList.get(0);
        this.slotAndCarMap.put(temp,vehicle);
        vehicle.setSlotNumber(temp);
        this.availableSlotsList.remove(0);

    }

    public void leave(Vehicle vehicle){
        if(!slotAndCarMap.containsValue(vehicle)){
            System.out.println("No such car present in the parking lot");
        }
        if(this.availableSlotsList.size() == this.size){
            System.out.println("Sorry parking lot is already empty");
        }
        int slotNumber = vehicle.getSlotNumber();
        this.slotAndCarMap.remove(slotNumber);
        availableSlotsList.add(slotNumber);

    }
}
