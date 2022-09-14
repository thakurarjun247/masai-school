package ja111.web20.day8.Inheritence;

public class _3MultipleANdHybridInheritence {
    public static void main(String[] args) {

    }
}

class Pet{
    void speak(){
        System.out.println("pet speaking...");
    }
}
class Dog extends Pet{
    @Override
    void speak(){
        System.out.println("barking...");
    }
}
class Cat extends Pet{
    @Override
   void speak(){
        System.out.println("meawing..");
    }
}
/*
//not supported in Java
class MultipleInheritence extends Dog, Cat{

}*/
