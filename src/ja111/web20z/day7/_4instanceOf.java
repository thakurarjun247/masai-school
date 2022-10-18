package ja111.web20z.day7;



public class _4instanceOf {
    public static void main(String[] args) {

    }
    //write a static method
    //takeAnimal(Animal animal)
    //if the animal is a fish it will call the swim and speak method on it.
    //else if animal is an elephant it will only call the speak method
}
class Animal{
    void speak(){
        System.out.println("animal speaks");
    }
}
class Elephant extends Animal{}

class Fish extends Animal{
    void swim(){
        System.out.println("fish swims");
    }
}
