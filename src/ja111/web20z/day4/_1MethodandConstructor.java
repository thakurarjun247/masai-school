package ja111.web20z.day4;

import org.w3c.dom.ls.LSOutput;

public class _1MethodandConstructor {
    //a method vs constructor (difference)
    //constructor creates a new object while a method can get/set a value.
    //1. Constructor name should be exactly The same as the class name while this is not
    // required for the name of the method
    //2. So a method must have a return type however a constructor doesn't have any written type not even void
//3. Constructor name starts with uppercase character while method name starts with lowercase characters.
    //4. A method can be abstract where as abstract keyword is not applicable with the constructor.
//5. cons. is related to a object, static (belongs to a class):
// static keyword is not applicable to a constructor. A method can be static.


    //a method vs constructor (similarity)
    //1. both of them can be overloaded.
    //2. both of them can take args.
    //3. both are used to set values of the object variables.
    //4. both of them can have access specifiers: public, private


    public static void main(String[] args) {
        Plant plant=new Plant("Green");
        plant.setColor("Red");
    }
}

class Plant{
    //private = it's not available outside of this class.
    private String color;

    public Plant(String color) {
        this.color = color;
    }
    public void setColor(String color){ //setter method
        this.color=color;
    }
}
