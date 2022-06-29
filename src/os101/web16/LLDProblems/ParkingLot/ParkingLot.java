package os101.web16.LLDProblems.ParkingLot;

import PL.ParkingSpot;

import java.util.List;

//Design a parking lot using OOP.
/*
* Steps
* clarifying questions and state assumptions
* identify the core objects = Person, Lot, floors, levels, vehicle, vehicleType, spot, row.
* Identify the relationships.
* Design Patterns
* Implementation - full working code (two parts - tomorrow )
* */
public class ParkingLot {
}

abstract class Vehicle{
     VehicleSize vehicleSize;
     String licencePlate;
     int spotsNeeded;
     List<ParkingSpot> parkingSpots;

     //methods?
    public void parkInSpot(ParkingSpot parkingSpot){
        parkingSpots.add(parkingSpot);
    }

    public void clearSpots(){
        //parkingSpots.clear();
    }

    public abstract boolean canFitInSpot(ParkingSpot spot);
}

class Car extends Vehicle{
    Car(){ //as soon as the car is created or enters into the parking lot.
        spotsNeeded=1;
        vehicleSize=VehicleSize.COMPACT;
    }
    @Override
    public boolean canFitInSpot(ParkingSpot spot) {
        return false;
    }
}

//TODO: create bus and mc classes.

enum VehicleSize{
    MOTORCYCLE, COMPACT, LARGE
}
class ParkingSpot{}

