package ja111.web20.day5;

public class _6Polymorphism {
    public static void main(String[] args) {
        Maths sum=new Maths();
        System.out.println(sum.add(2,3, 4));
        System.out.println(sum.add(3,4));
        System.out.println(9);
        System.out.println(sum.square((byte) 5.9));
    }
}

class Maths {
    //Polymorphism:
    //1. static binding, compile time polymorphism, method overloading
    //2. we will learn later.
    int add(int x, int y){
        return x+y;
    }
    String add(int x, int y, int z){
        return "x+y+z";

    }
    int square(int x){
        System.out.println("int");
        return x*x;
    }
    int square(byte b){
        System.out.println("byte");
        return b*b;
    }


}

//Rules
//return type can be same or diff
//arg list should be diff
