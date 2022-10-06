package ja111.web20z.day1;

public class _4IdentifiersOperatorsDataTypes {
    public static void main(String[] args) {
        //rules for identifier names
        //rule: (must follow)
        //1. not start with a number
        // String 1country = "India";
        String _country = "India";
        String $country = "India";
        //convention (not necessary, recommended):
        //camelCase (recommendation, convention) = thisIsMe ⇒ variable names, Method names
        String myCountryName="India";
        //camelCase: identifier, methods,
        //PascalCase: classes, Interfaces


        //Literals or Primitives
        int i=10;
        boolean areYouOk=true;
        double pi=3.14;
        //don't use keywords as your identifiers
       // int class=10;


        //Operators
        //+, -, *, /, %, ++, --,=, +=, -=, *=, /=, %=
        //not equal to !=

        System.out.println(++i); //pre increment 11
        int j=10;
        System.out.println(j++) ; // post increment

        //Boolean operators
        //&, |, ^
        // AND
        // OR XOR

        //short circuit
        // &&, ||

        //Ternary Operator
        // exp1? this:that;
        int x=50;
        String result= (x==5) ? "x is five":"x is not 5";
        System.out.println(result);


        boolean b1=true;
        boolean b2=false;
        System.out.println(b1&b1);//true
        System.out.println(b1&b2);//false
        System.out.println(b2&b1);//false
        System.out.println(b2&b2);//false

        System.out.println(b1|b1);//true
        System.out.println(b1|b2);//true
        System.out.println(b2|b1);//true
        System.out.println(b2|b2);//false
        // ^

        // if both the operand are having the same value it will print false
        //if both the operand are having different  values it will print true
        System.out.println(b1^b1);//false
        System.out.println(b1^b2);//true
        System.out.println(b2^b1);//true
        System.out.println(b2^b2);//false

        System.out.println(true ^ true);
        System.out.println(false ^ false);
        System.out.println(true ^ false);

        //Data types
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        //who numbers: byte, short, int, long

        //github
        //install git locally
        //point local to remote
        //create remote repo

        //decimal numbers
        //float < double

        double pie=3.14;
        float anotherPie=3.14f;
        float m=(float) 555.66;
        System.out.println(Double.MIN_VALUE);
        //Wrapper
       // int n=3;
        //is same as
        Integer n=3;
        //java is an OOP lang
        Integer y=3;
        y=n;
        n=y;



    }
}
