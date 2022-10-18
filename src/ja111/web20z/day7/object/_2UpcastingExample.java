package ja111.web20z.day7.object;

public class _2UpcastingExample {
    public static void main(String[] args) {
        Bike bike=new KTM();//upcasting.
        bike.run();//1
        new KTM().run();//2
        KTM ktm=new KTM();
        ktm.run();//3
    }
}
class Bike{
    void run(){
        System.out.println("bike running");
    }
}

class KTM extends Bike{
    @Override
    void run(){
        System.out.println("KTM bike running");
    }
}
