package ja111.web20.day8.Inheritence;

public class _1InheritenceDemo {
    public static void main(String[] args) {
        Fish fish= new Fish();
        fish.swim();
        Dolphin dolphin= new Dolphin();
        dolphin.swim();
        dolphin.jump();
        //fish.jump();
    }
}
class Fish{
    void swim(){
        System.out.println("Fish is swimming...");
    }
}
//Fish: Parent Class, Super Class, Base Class
//Dolphin: Child Class, Sub Class, Derived Class
class Dolphin extends Fish{
/*
Benefits:
code resuse


* void swim(){
        System.out.println("Fish is swimming...");
    }*/
void jump(){
    System.out.println("Dolphin is jumping...");

}
}