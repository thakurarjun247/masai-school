package ja111.web20z.day3;

public class Egg{
    String color;
    int size;
    //constructor
    Egg(){
        //will be called whenever an object is created
        //populate a menu on screen
        //starting
        System.out.println("welcome to Windows");
    }



    //overloaded cons, aka parameterised constructor.
      Egg(String color, int size){
        this.color=color; //set the color of current object (this.color)
        // same as the value of the param
        this.size=size;
    }
}