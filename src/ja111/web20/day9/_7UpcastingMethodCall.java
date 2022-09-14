package ja111.web20.day9;

public class _7UpcastingMethodCall {
    public static void main(String[] args) {
        Bike bike=new Splendor();
        bike.run();

        //instanceof
        Integer i=10;
        System.out.println(i instanceof Integer);
        //System.out.println(i instanceof String);
        System.out.println(i instanceof Object);
        System.out.println(bike instanceof Bike);
        System.out.println(bike instanceof Object);
     //   System.out.println(bike instanceof Splendor);


    }
}

class Bike{
    void run(){
        System.out.println("bike runs");
    }
}


class Splendor extends Bike{
    void run(){
        System.out.println("Splendor runs");
    }
}