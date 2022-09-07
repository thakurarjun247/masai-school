package ja111.web20.day5;

public class _3PredictTheOutput {
    static int j=200;
    A a1=new A();

    public static void main(String[] args) {
        _3PredictTheOutput obj= new _3PredictTheOutput();
        System.out.println(obj.j);//200
        System.out.println( obj.a1); //print address of a1
        obj.a1.funA(); //cmd+click
    }
}
class A{
    int x=10;
    void funA(){
        System.out.println("inside funA of class A");
    }
}


