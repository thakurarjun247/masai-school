package ja111.web17.day7;
/*
* Creating a class Vehicle as a parent class that has a
* run method, lets create another class call Bike as child
* of this Vehicle class and override the run method from
* the parent class.*/
public class _6IProblemBikeVehicle {
    public static void main(String[] args) {
        Bike bike=new Bike();
        bike.run();
    }
}
class Vehicle{
    public void run(){
        System.out.println("vehicle running..");
    }
}
class Bike extends Vehicle{
    @Override
    public void run() {
        System.out.println("bike running...");
    }
}