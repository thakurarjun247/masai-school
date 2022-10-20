package ja111.web20z.day8;

import ja111.web20.day14.Plant;

public class _6equalsmethod {
    public static void main(String[] args) {
        Object o;
        Integer i=10;
        Integer j=10;
        System.out.println(i.equals(j));
        Car car1= new Car(245.0, "white");
        Car car2= new Car(234.0, "red");
        Car car3= new Car(234.0, "red");



        System.out.println(car2.equals(car3));
        //by default the equals() method uses == operator
        // == checks whether the location in the m/m is
        // same for the object.

        //There are some general principles defined by Java.
        //
        //that must be followed while implementing the equals() method in Java. The equals() method must be:
        //
        //- ***reflexive***: x. x.equals(x) true;
        System.out.println(car1.equals(car1));
        //- ***symmetric***: x.equals(y) true; y.equals(x)?

        //- ***transitive***: for any objects x, y, and z, if x.equals(y) returns true and y.equals(z) returns true, then x.equals(z) should return true.
        // x, y, z => x, y   y, z  => x z

        //- ***consistent***: for any objects x and y, the value of x.equals(y) should change, only if the property in equals() changes.
        //- For any object x, the *equals(null)* must return false.
    }
}
