package sb101.web18.day7.serialization;

import java.io.*;

public class _1Serialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        //serialization
        A object =new A();
        FileOutputStream fileOutputStream= new FileOutputStream("nio.txt");
        ObjectOutputStream objectOutputStream= new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(object);
        objectOutputStream.close();
        System.out.println("object is serialized");


        //deserialization
        FileInputStream fileInputStream= new FileInputStream("nio.txt");
        ObjectInputStream objectInputStream= new ObjectInputStream(fileInputStream);
        Object deserObject=objectInputStream.readObject();
        A deserializedObjectOfA=(A) deserObject;
        System.out.println("object is deserialized");
        System.out.println(deserializedObjectOfA.i);

        //we problem: the output of this?
        System.out.println(deserializedObjectOfA.email);
        System.out.println(deserializedObjectOfA.aBoolean);
       // objectOutputStream.writeObject("string");

        //be back by 2:50pm
    }
}


class A implements Serializable {
    int i=10;

    //don't serialize this
    transient String email="xyz@gmail.com";//null
    transient boolean aBoolean=true;
}


