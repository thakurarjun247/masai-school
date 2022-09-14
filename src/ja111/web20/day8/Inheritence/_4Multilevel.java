package ja111.web20.day8.Inheritence;

public class _4Multilevel {
    public static void main(String[] args) {
        Child child= new Child();
        child.facialFeatures();
    }
}

class Grandparent{
    void facialFeatures(){
        System.out.println("facialFeatures");
    }
}
class Parent extends Grandparent{}
class Child extends Parent{}
