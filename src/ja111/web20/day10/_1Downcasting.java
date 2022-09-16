package ja111.web20.day10;

public class _1Downcasting {
    public static void main(String[] args) {
        String s="hello";
        Object o=s;//upcasting.
        System.out.println(s instanceof String); //true
        System.out.println(s instanceof Object);//true
        //Downcasting

        Animal parent=new Dog();//upcasting.
       // Dog d1= new Animal(); //CT error
        parent.eat();
        //parent.bark(); //CT error
        //parent instance of Animal
        //parent instanceof Dog
        Dog dog=(Dog) parent; //downcasting.
        dog.bark();
        downcast(parent);
        Animal pureAnimal= new Animal();
        downcast(pureAnimal);
        System.out.println("this will not print");
    }

    static void downcast(Animal animal){
        //my program shouldn't throw any exception
        if(animal instanceof Dog) {
            Dog dog = (Dog) animal;
            System.out.println("casted.");
        }
        else
        {
            System.out.println("animal isn't of type dog, can't cast it");
        }

    }
}

class Animal{
    void eat(){
        System.out.println("animal eats");
    }
}

class Dog extends Animal{
    @Override
    void eat(){
        System.out.println("dog eats");
    }
    void bark(){
        System.out.println("dog barks");
    }
}