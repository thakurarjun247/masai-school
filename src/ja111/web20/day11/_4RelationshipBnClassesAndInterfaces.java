package ja111.web20.day11;

public class _4RelationshipBnClassesAndInterfaces {
    //class extends another class (only one )
    //class implements interface (any number of them)
    //interface extends interface (any)


    // class A extends class B, class C //multiple inheritence not supported
    //cla
}

interface AnimalInterface{
    void eat();
}
interface BirdInterface{// extends AnimalInterface {
    void fly();
}
class Eagle implements BirdInterface, AnimalInterface{

    @Override
    public void eat() {
        System.out.println("eagle eats");
    }

    @Override
    public void fly() {
        System.out.println("fly high");
    }
}
