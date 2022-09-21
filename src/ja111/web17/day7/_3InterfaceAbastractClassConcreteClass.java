package ja111.web17.day7;

public class _3InterfaceAbastractClassConcreteClass {
    public static void main(String[] args) {
        Dolphin dolphin=new Dolphin();
        dolphin.move();
    }
}
interface IAnimal{
    //when you don't know the details you make it abstract. no body.
     abstract public void move();

}
//implements - interface
//extends - class
class Fish implements IAnimal{
    @Override
    public void move(){
        System.out.println("moving by swimming");
    }
}

class Dolphin extends Fish{
    @Override // warning sign: sharp turn ahead
    public void move(){

        System.out.println("moving by swimming and jumping");
    }

}
class BlueDolphin extends Dolphin{
  @Override // warning sign: sharp turn ahead
    public void move(){
        System.out.println("BlueDOlphin moving by swimming and jumping");
    }
}

//Why we need abstract class - covered sb101
//Car  Engine
/*
class WVCar{
    Engine engine;
}
abstract class Engine{}

class AudiEngine extends Engine{}
class WVEngine extends Engine{}
*/

