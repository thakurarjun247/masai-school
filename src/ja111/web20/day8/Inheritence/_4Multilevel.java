package ja111.web20.day8.Inheritence;

public class _4Multilevel {
    public static void main(String[] args) {
        Child child= new Child();
        //child.facialFeatures();
        //Object object= new Object();
    }
}

class Grandparent{
    Grandparent(){
        //super();
        System.out.println("GP");
    }
    void facialFeatures(){
        System.out.println("facialFeatures");
    }
}
class Parent extends Grandparent{
    Parent(){
       // super();
        System.out.println("parent");
    }
}
class Child extends Parent{
    Child(){
       // super();
        System.out.println("child");
    }
}
