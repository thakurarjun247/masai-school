package ja111.web20.day2;

public class _4Casting {


    public static void main(String[] args) {
        //implicit = internal = automatic
        byte myByte=10;
        int myInt=myByte;

        int i=10;
        //explicit type casting
        //syntax  (datatype)
        byte b= (byte) i;
        System.out.println(b);

        //ASCII value? a 65, b 66, A=96

        char c='A'; //ascii of 'A' = 65
        int anotherInteger=c;//65
        System.out.println(anotherInteger);
        int asciiValofZ='z';
        System.out.println(asciiValofZ);

        byte b1=10;
        byte b2=20;
        byte b3= (byte) (b1+b2);
        System.out.println(b3);
        //-128 to 127

        byte a1=125;
        byte a2=100;
        byte a3= (byte) (a1+a2);
        System.out.println(a3);
        //standard practice is:
        //always use int
        //use long if the number is too large

    }
}
