package ja111.web20z.day6;

public class _7WeProblemOverriding {
    //# We Problem:
    //
    //create a class Bank, with a method getRateOfInterest and create
    // multiple child classes of This Bank class as
    // SBI (6), ICICI (7) and override the getRateOfInterest method in all the child classes
}
abstract class Bank{
    abstract int getRateOfInterest();
}
//absrr
//Creating child classes.
class SBI extends Bank{
    @Override
    int getRateOfInterest(){
        return 8;
    }
}

class ICICI extends Bank{
    int getRateOfInterest(){
        return 7;
    }
}

class AXIS extends Bank{
    int getRateOfInterest(){
        return 9;
    }
}

//Main class to create objects and call the methods
class Main{
    public static void main(String args[]){

        SBI s=new SBI();
        ICICI i=new ICICI();
        AXIS a=new AXIS();

        System.out.println("SBI Rate of Interest: "+s.getRateOfInterest());
        System.out.println("ICICI Rate of Interest: "+i.getRateOfInterest());
        System.out.println("AXIS Rate of Interest: "+a.getRateOfInterest());
    }
}