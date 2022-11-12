package ja111.web20z.day12;

public class _3ExceptionPropogation {
    void one(){
        System.out.println("one()");
        int data=10/0;
    }

    void two(){
        System.out.println("two");
        one();
    }

    void three(){
        System.out.println("three()");
       try {
           two();
       }
       catch (Exception e){
           System.out.println("handled..");
       }

        System.out.println("end of three");
    }

    public static void main(String[] args) {
        new _3ExceptionPropogation().three();
        System.out.println("end of main.");
    }
}
