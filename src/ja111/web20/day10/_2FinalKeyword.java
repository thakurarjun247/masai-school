package ja111.web20.day10;
//final, finally and finalize
public class _2FinalKeyword {
    public static void main(String[] args) {
        //variable, class, method.

        //variable
       final int i;
       //i++; it's value can't be changed const
        i=10;
        final int j=100;
        //i++;


    }
}

class A{
    void nonFinal(){
    }

    //final method -- if a method is final it can't be overridden
    // -- final is just opposite of overriding

    final void finalMethod(){
        System.out.println("asdfasdf");
    }
}
class B extends A{
    @Override
    void nonFinal(){
    }
    //final method can be overloaded
    void finalMethod(String s){

    }

    //CT error
   // @Override
    //void finalMethod(){}

}

//RBI ()  - non-final decideRoI();   final int premiumForCoronaKavach(){ return 1215;}
//SBI , HDFC -
//if a class is final it can't be extended.
final class Shape{
    final double pi=22/7;
}
/* CT error
class Circle extends Shape{

}*/
