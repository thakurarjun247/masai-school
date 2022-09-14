package ja111.web20.day9;

public class _6Upcasting {
    public static void main(String[] args) {
        Mother mother=new Mother();
        Daughter daughter= new Daughter();
        //base class (variable) can have subclass reference
        Mother mother1=new Daughter(); //upcasting.
        String s="aasdfasdf";
        Object o="asdf";//upcasting.
        Object o1;
        o1=new Mother();//upcasting.
        //parent class object referring to child class is called upcasting
    }
}

class Mother{}
class Daughter extends Mother{}
