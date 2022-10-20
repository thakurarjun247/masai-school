package ja111.web20z.day8;

import java.util.Objects;

public class Car {
    double torque;
    String color;

    public Car(double torque, String color) {
        this.torque = torque;
        this.color = color;
    }

    @Override
    public boolean equals(Object that) {
        //this -> current
        if(this == that)
            return  true;

        Car car=(Car) that;
        if(this.torque==car.torque  && this.color.equals(car.color))
            return true;
        else return false;
    }



    @Override
    public int hashCode() {
        return Objects.hash(torque, color);
    }
}
