package ja111.web20.day10;

public class _5Abstraction {

    //inheri, poly (static, dynamic), encapsulation - Javabean pojo,
    //abstract : summary : Hide the details
    //Abstraction is a way of hiding the implementation details and showing only functionality to the user.

    public static void main(String[] args) {
        new Email().send(null, null, null,null);
        MathematicalShape shape=new Circle();
        shape.calculateArea();
        new Cylinder().calculateArea();
    }
}
class Email{
    void send(String sender, String rec, String sub, String body){
        //smtp port google, y email.
    }
}
//hide details becuase:
// 1. the req aren't crystal clear
// 2. flexibilty / scalability
// 3. overriding

//abstact classes, methods = without details
//concrete class, methods= with all the details
abstract class MathematicalShape{
    final double pi=22/7;
    abstract double calculateArea();
    void readme(){
        System.out.println("readme: this is a shape class .... ");
    }
    /*{
        //l*w; rect
        //pi*r*r circle
        return 0;
    }*/
}

 class Circle extends MathematicalShape{
    int r;
     @Override
     double calculateArea() {
         return pi*r*r;
     }
 }

class Square extends MathematicalShape{
    int r;
    @Override
    double calculateArea() {
        return r*r;
    }
}


class Cylinder extends MathematicalShape{
    int r;
    int h;
    @Override
    double calculateArea() {
        return pi*r*r*h;
    }
}
//abstract class can provide abstraction from 0% (all concrete) to 100% (all abstract)
//interface