package ja111.web20.day4;

public class _5LoadingNonStatic {
    int nonStaticInt=90;
    static int staticInt=100;
    public static void main(String[] args) {
        System.out.println(staticInt);
        //System.out.println(nonStaticInt); //error

        //how to load nonStaticInt into the memory?
        //create an object
        _5LoadingNonStatic object=new _5LoadingNonStatic();
        System.out.println(object.nonStaticInt);
        //1. there are separate static and non-static areas.



    }


}
