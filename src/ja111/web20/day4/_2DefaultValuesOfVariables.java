package ja111.web20.day4;

public class _2DefaultValuesOfVariables {
     int x=10; //inside a class: instance variable
    static int myStaticVariable=0;
    int instanceVariableWithoutAValue;
    String string; //default value will be null, same for all the user defined objects as well.
    //x is non static
    public static void main(String[] args) {

        //this area is static
        int y=5; //inside a method: local variable
        System.out.println(y);
       // System.out.println(x);
        _2DefaultValuesOfVariables object=new _2DefaultValuesOfVariables();
        System.out.println("instanceVariableWithoutAValue "+object.instanceVariableWithoutAValue);//


        int localVariableWithoutAValue; //no default value
        //intialize it
        //localVariableWithoutAValue=10;
        //System.out.println(localVariableWithoutAValue); //error
    }
}
