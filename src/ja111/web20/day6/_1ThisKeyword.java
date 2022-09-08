package ja111.web20.day6;

public class _1ThisKeyword {
    //this points to the current object, this is not related to a class
    //static is related to a class not to any object
    int x=10;
    void fun(){
        int x=1000;
        System.out.println(this);
        //this keyword can access the instance variable of the current object.
        System.out.println(this.x);//10 object's variable
        System.out.println(x);//1000 local variable
    }

    public static void main(String[] args) {
        int x=100;
        _1ThisKeyword object= new _1ThisKeyword();
        System.out.println(object);
        object.fun();

        System.out.println(object.x);
        System.out.println(x);
        //You cannot refer to the This keyword from the static area
      // System.out.println(this.x);
    }
}
