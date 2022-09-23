package ja111.web20.day14;

public class _2Boxing {
    public static void main(String[] args) {
        //autoboxing, unboxing
        int x=10;
        //prim to Wrapper
        Integer wrapperInt=Integer.valueOf(x); //boxing
        //same as
       Integer autoBoxedInt=x; //autoboxing

        //unboxing
        //wrapper to prim
        int primInt=wrapperInt.intValue(); //unboxing
        //same as
        int primInt2=wrapperInt; //auto-unboxing.

    }
}
