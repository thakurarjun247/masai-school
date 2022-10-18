package ja111.web20z.day7.object;

public class _1UpcastingDowncasting {
    public static void main(String[] args) {
        //B b;//stack
        B b = new B();//heap
        A a= new B(); // object, reference (address )
        //Base class variable can hold sub class (sub type ) reference.

        //upcasting
        //If the reference variable of Parent class refers to the
        // object of Child class, it is known as upcasting.
        Integer i=1;
        Number number=i;
        Object object1=number;

        Object object;
       // Integer -> Number -> .. -> Object
        //Plant -> ... -> Object
        //Object is the supertype of all the Java classes.

        Movie movie = new Movie("RRR", 3.0);
        System.out.println(movie); //calling the tostring method

    }
}

class A{}
class B extends A{}
