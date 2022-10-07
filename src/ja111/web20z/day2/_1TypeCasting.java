package ja111.web20z.day2;
import java.lang.Integer;
public class _1TypeCasting {
    //java.lang contains many classes
    //Short, Long, Float, Double, Boolean
    // prim: short, long, float

    public static void main(String[] args) {
        int i=5;
        Integer j=5;
        i=j;
        j=i;
        //conversion aka type casting
        //primitive -> Wrapper : int->Integer
        //Wrapper -> primitive : Integer -> int

        //Casting has two types
        //1. Implicit (automatic, understood)Type casting:
        //smaller type to larger one
        //Byte  (-128 to 127)

        byte b=10; //bucket of size 127
        int c=10000; //bucket of size 2,147,483,648
        c=b; //automatic conversion implicit

        //2. Explicit Type casting (specify, mention it yourself)
       int d=130; // 2,147,483,648
        //128 =127+1

        //-128, -127 ..... +127
       byte e;
       e= (byte) d; //try avoid
       System.out.println(e);

       byte x=101;
       byte y=111;
       int z= (x+y);
       //Recommendation:
        //implicit type cast is always fine.
        //explicit: Please don't do it on purpose. there is risk. understand the output.
       // System.out.println(z);

        //byte< int<long
        //float < double
        //Recommended to use double over float.








    }
}
