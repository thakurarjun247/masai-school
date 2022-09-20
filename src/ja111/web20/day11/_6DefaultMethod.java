package ja111.web20.day11;

public class _6DefaultMethod {
    public static void main(String[] args) {
        Food dosa=new Dosa();
        dosa.dineIn();
        dosa.deliver();

        Idli idli= new Idli();
        idli.deliver();
        Food.eat();

    }
}
interface Food{
    //void concreteMethod{}
    void dineIn();
    default void deliver(){
        System.out.println("delivering Food");
    }
     static void eat()
    {
        System.out.println("eat food");
    }

}
//if you add a new method in an interface
//implementation will break
//backward incompatibility
class Dosa implements Food{

    @Override
    public void dineIn() {
        System.out.println("serving Dosa...");
    }
}
class Idli implements Food{

    @Override
    public void dineIn() {
        System.out.println("serving Idli...");
    }
}
