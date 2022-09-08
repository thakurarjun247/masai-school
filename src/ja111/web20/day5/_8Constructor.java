package ja111.web20.day5;

public class _8Constructor {
    public static void main(String[] args) {
        MyClass obj=new MyClass();
        MyClass anotherObject= new MyClass(10);
        System.out.println(anotherObject.variable);
    }
}

class MyClass{
    int variable;
    //default constructor
    MyClass(){
        System.out.println("");
    }
    //parameterized constructor
     MyClass(int var){
        variable=var;
    }
}
//Similarity constructor and method
//both are functions
// both have arg list.
//both of them can be overloaded

//difference:
//static? No constructor can't be static
//return type: constructor doesn't have a return type, not even void
//a method can have any name, but cons. can only have the name same as the classname.