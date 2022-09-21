package ja111.web17.day7;

public class _7SuperKeyword {
    /*usage
    * super() call immediate parent class constructor
    * super.variable can call immediate parent class variable
    * super.fun() can call immediate parent class function
    * */
    public static void main(String[] args) {
       // GrandParent grandParent=new GrandParent();
        Parent parent= new Parent();

    }
}

class GrandParent{
    GrandParent(){
        System.out.println("GrandParent constructor");
    }
}
class Parent extends GrandParent{
    Parent(){
        super();//implied, understood, not written there but understood.
        System.out.println("Parent constructor");
    }
}

