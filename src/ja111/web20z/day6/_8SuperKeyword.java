package ja111.web20z.day6;

public class _8SuperKeyword {
    //this -> current
    //super -> super/parent/base
    //super();
    //super.hi();
    public static void main(String[] args) {
        //new Lotus().printColor();
        Lotus lotus= new Lotus();
    }
}

class Flower{
    String color="white";
    Flower(){
       // super();
        System.out.println("flower cons. called.");
    }
}
class Lotus extends Flower{
    String color="Blue";
    Lotus(){
        super();
        //rule:
        //the call to the super() is always the first statements in a cons. body.
        System.out.println("lotus cons. called");

    }
  /*  void printColor(){
        System.out.println(color); //blue
        System.out.println(this.color); //blue
        System.out.println(super.color); //white
    }*/
}

