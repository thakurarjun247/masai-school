package sb101.web18.day2.lambda_expressions;

public class _1FunctionalInterfaceDemo {
    //Two ways to write a program
    //1. declarative. What? - functional progg
    //2. imparative. How/details? =- OOP
    public static void main(String[] args) {
        //standard way
       MyInterface standardWay=new MyClass();
        standardWay.sayHello(" Ashok");
       //anonymous inner class
        MyInterface anonymousWay=new MyClass(){
            @Override
            public void sayHello(String name) {
                super.sayHello("welcome - ano"+name);
            }
        };
        anonymousWay.sayHello("anonymousName");

        //lambda way
        MyInterface lambdaWay= (String name) ->
            System.out.println("welcome Lambda"+name);

        //syntax:
        //(arg list) -> <body> <actual body>
        lambdaWay.sayHello("Sumit ");

        MyInterface lambdaWayWithoutDataType= (name) ->
                System.out.println("welcome Lambda"+name);
        lambdaWayWithoutDataType.sayHello("withoutDataType");

    }
}
@FunctionalInterface
interface MyInterface{
    abstract void sayHello(String name);

}
class MyClass implements MyInterface{

    @Override
    public void sayHello(String name) {
        System.out.println("welcome" + name);
    }
}
