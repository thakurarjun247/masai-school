package sb101.web18.day3;

public class _2ReturnLambda {
    public static void main(String[] args) {
        //String string=hi();
        MyInterface mi=returningLambda();
        mi.sayHello("Sumit");

        //rewrite
        returningLambda().sayHello("Vinay");
    }
    public static MyInterface returningLambda(){
        //return name -> System.out.println("hello to "+name);
        //can be rewritten as:
        MyInterface myLambda= name-> System.out.println("hello to "+name);
        return myLambda;
    }

    public static String hi(){
        return "hi";
    }
}
interface MyInterface{
    void sayHello(String name);
}
