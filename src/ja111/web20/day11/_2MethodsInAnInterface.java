package ja111.web20.day11;
interface Animal{
    //by defalut an interface method is abstract
      abstract void move();
     //abstract - no detail -> overriding
    //final - can't override
    //abstract and final don't go together.

}
/*class SnakePlant implements Animal{

}*/
abstract class Fish implements Animal{
    // void move(); will come in here
}

class Dolphin extends Fish{

    @Override
    public void move() {
        System.out.println("dolphin swim and jump");
    }
}
public class _2MethodsInAnInterface {
    public static void main(String[] args) {
        new Dolphin().move();

        Dolphin dolphin= new Dolphin();
        System.out.println(dolphin instanceof Fish);
        System.out.println(dolphin instanceof Animal);
    }
}
