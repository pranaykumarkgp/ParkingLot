package com.pranay.parkingLot;


import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class ParkingLotTest {


    ParkingLot parkingLot = new ParkingLot();

    @Test
    public void createParkingLotTest() {


        parkingLot.createParkingLot(6);
        assertEquals(6,parkingLot.size);
        assertEquals(6,parkingLot.availableSlots);
        assertEquals(6,parkingLot.availableSlotsList.size());
        System.out.println(parkingLot.availableSlotsList.toString());
        assertEquals(0,parkingLot.slotAndCarMap.size());



    }

    @Test
    public void park(){


        Vehicle car = new Car("JH09H7346","White");
        Vehicle bike = new Bike("KA43T6071","Grey");
//        parkingLot.park(car);
//        assertEquals("Parking lot is not created");
        parkingLot.createParkingLot(6);
        parkingLot.park(car);
        parkingLot.park(bike);

        assertEquals(4,parkingLot.availableSlotsList.size());
        System.out.println(parkingLot.availableSlotsList.toString());
        assertEquals(2, parkingLot.slotAndCarMap.size());


    }

    @Test
    public void leaveTest(){
        parkingLot.createParkingLot(6);
        Vehicle car1 = new Car("JH09H7346","White");
        Vehicle car2 = new Car("JH10ST4569","White");
        Vehicle bike = new Bike("KA43T6071","Grey");

        parkingLot.park(car1);
        parkingLot.park(car2);
        parkingLot.park(bike);
        assertEquals(3,parkingLot.availableSlotsList.size());
        assertEquals(3, parkingLot.slotAndCarMap.size());

        parkingLot.leave(car1);
        assertEquals(4,parkingLot.availableSlotsList.size());
        assertEquals(2, parkingLot.slotAndCarMap.size());

        parkingLot.leave(bike);
        assertEquals(5, parkingLot.availableSlotsList.size());
        assertEquals(1, parkingLot.slotAndCarMap.size());
        System.out.println(parkingLot.slotAndCarMap.toString());
        System.out.println(parkingLot.availableSlotsList.toString());

    }

}