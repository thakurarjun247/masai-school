package ja111.web20z.day3;

import org.w3c.dom.ls.LSOutput;

public class _4LogicalOperator
{
    // | and &
    //   | OR works binary numbers
    public static void main(String[] args) {
        // | will return true if at least one of the operands is true
        System.out.println(true | true); //true
        System.out.println(false | true); //true
        System.out.println(false | false); //f

        boolean b1=true;
        boolean b2=false;

        System.out.println(b1&b1);//true
        System.out.println(b1&b2);//false
        System.out.println(b2&b1);//false
        System.out.println(b2&b2);//false
        //truth table
        System.out.println(b1|b1);//true
        System.out.println(b1|b2);//true
        System.out.println(b2|b1);//true
        System.out.println(b2|b2);//false


        //XOR if both the operands are same if returns false

        System.out.println(b1^b1);//false
        System.out.println(b1^b2);//true
        System.out.println(b2^b1);//true
        System.out.println(b2^b2);//false
    }
}
