package ja111.web20z.day6;

public class _2InheritenceDemo {
}

abstract class Animal{
    abstract void move();
}
class Fish extends Animal{
    void move(){
        System.out.println("moves by swimming");
    }
}
class Dolphin extends Fish{
    void move(){
        System.out.println("moves by swimming and jumping");
    }
}

//Fish is an (IS-A relationship) Animal?
//Another name of inheritance is IS-A relationship.