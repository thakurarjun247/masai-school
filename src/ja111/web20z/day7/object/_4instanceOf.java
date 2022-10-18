package ja111.web20z.day7.object;



public class _4instanceOf {
    public static void main(String[] args) {
        Animal animal= new Animal();
        takeAnimal(animal);

        Elephant elephant= new Elephant();
        takeAnimal(elephant);

        Fish fish= new Fish();
        takeAnimal(fish);
    }

    static void takeAnimal(Animal animal){
        animal.speak();
        //animal.swim(); //you can call only the methods that are present in animal
       // animal.swim();
        //Fish fish= new Fish();
       // fish.swim();

        if( animal instanceof Fish){

            byte b=10;
            int i=b;
            byte anotherByte=(byte) i;
            Fish f1=(Fish) animal;
            f1.swim();
        }
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



class Elephant extends Animal{} //elep. is-a animal

class Fish extends Animal{
    void swim(){
        System.out.println("fish swims");
    }
}
