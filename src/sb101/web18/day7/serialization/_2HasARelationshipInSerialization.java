package sb101.web18.day7.serialization;

import java.io.*;

public class _2HasARelationshipInSerialization {
    public static void main(String[] args) throws IOException {

        Dog dog= new Dog();
        FileOutputStream fileOutputStream= new FileOutputStream("nio.txt");
        ObjectOutputStream objectOutputStream= new ObjectOutputStream(fileOutputStream);
        //has a /composition
        objectOutputStream.writeObject(dog);

        //is-a relationship or inheritence
        Parent parent= new Parent();
        Child child= new Child();
        objectOutputStream.writeObject(parent);
        objectOutputStream.writeObject(child);

        objectOutputStream.flush();
        objectOutputStream.close();
    }
}
class Dog implements Serializable{
    Cat cat= new Cat();
}

//Make the cat class not implement serialization
// and you will end up into an error.
class Cat implements Serializable{
    Mouse mouse= new Mouse();
}
class Mouse implements Serializable{

}

class Parent implements Serializable{
    int age=40;
}

class Child extends Parent{
    int height=180;
}