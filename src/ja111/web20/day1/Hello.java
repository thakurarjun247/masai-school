package ja111.web20.day1;

public class Hello {

    /*
    *
    *
    * */

    //signature
    public static void main(String[] anything) {
        //it will insert empty line before the next statement.
        System.out.println("Hello Java");
        System.out.println(90);
        multiplication();
        System.out.println("back to main");

    }

    public static void multiplication(){
        System.out.println("inside the multiplication method");
        int a=10;
        int y=7;
        System.out.println(a*y);

    }
}
//shortcut to (un)comment: control+shift+/
