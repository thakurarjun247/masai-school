package ja111.web20z.day4;

public class _4ThisKeyword {
    //'this' keyword
    // 1. Points to the current class obj.
    //2. Differentiate between local and instance variable.
    //3. Calling a constructor of a class from another constructor of the same class.
    public static void main(String[] args) {
        Demo demo= new Demo();
        demo.fun1();
        System.out.println(demo);
    }
}

// 1. Points to the current class obj.
//2. Differentiate between local and instance variable.

class Demo{
    int x=100; //instance
    public Demo(){}
    public Demo(int x) {
        //Calling a constructor of a class from another constructor of the same class.
        this(); //is same as callin Demo();
        //call to this() should be the first statement in the cons. body.
        this.x = x;
    }

    void fun1(){
        int x=500; //local
        System.out.println(x);
        System.out.println(this.x); //print x of the current object
        System.out.println(this); //it will print address of the current object
    }

}
