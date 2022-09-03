package ja111.web20.day2;

public class _3DataTypes {
    public static void main(String[] args) {
        //Range
        int a=130;
        Integer x=a;
        //byte -128 to +127
        //byte byteVar=130; error

        int myInt=20;
        char myChar='a';
        Character characterWrapper=myChar;
        String myString="afsdasfdasdfjalksdfjlkajsf";

        Boolean booleanWrapper=true;
       // boolean booleanPrimitive=booleanWrapper;
        boolean myBool;

        //Use of Wrapper
        //Object

        System.out.println(Byte.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

        //no default value for variable of a method
        int primDefaultValue = 0;
        Integer wrapperDefaultValue;//null
        String s;//null






    }


}

class A{
    int i; //default values for class members
}
