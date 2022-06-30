package os101.web16.LLDProblems.ParkingLot;

import java.util.List;

//Design a parking lot using OOP.
/*
* Steps
* clarifying questions and state assumptions
* identify the core objects = Person, Lot, floors, levels, vehicle, vehicleType, spot, row.
* Identify the relationships.
* Design Patterns
* Implementation - full working code (identify abstractions, relationships, concrete classes and methods
* with signature and not with the full implementation)
* */


abstract class Vehicle{
     VehicleSize vehicleSize;
     boolean isParked;
     String licencePlate;
     int spotsNeeded;
     List<ParkingSpot> parkingSpots;

     //methods?
    public void parkInSpot(ParkingSpot parkingSpot){
        if(!isParked) {
            parkingSpots.add(parkingSpot);
            isParked = true;
        }
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
//TODO: complete this
public class ParkingLot {
    Level[] levels;
    final int NUM_LEVELS=5;

}
class Level{
    int floor;
    ParkingSpot[] spots;
    boolean isAvailable;
    int findAvailableSpot(Vehicle vehicle){
        return 0;
    }
}
class ParkingSpot{ //11
    VehicleSize vehicleSize;
    int spotNumber;
    int row;
    Level level;
    boolean isAvailable;
    Vehicle vehicleParkedThere;
    ParkingSpot(Level level, int row, VehicleSize vehicleSize, int spotNumber ){
        row=2;
        isAvailable=true;
    }
    boolean park(Vehicle vehicle){
        if(!isAvailable || !vehicle.canFitInSpot(this))
            return  false;
        isAvailable=false;
        this.vehicleParkedThere=vehicle;

        vehicle.isParked=true;
        return true;
    }
    boolean removeVehicle(Vehicle vehicle){
        vehicle.isParked=false;
        this.isAvailable=true;
        this.vehicleParkedThere=null;
        vehicle.clearSpots();
        return true;
    }


}

