package ja111.web20z.day7.object;

public class _5final {


    public static void main(String[] args) {
        //what is final
        //what is diff final, finally, finalize

        //final is a keyword
        //variable: unchanged, no reassignment
        //method: can't overridden
        //class: can't extend it
        final int x=10;
       // x++; //just like a string
       // x=20; //no reassignment
        final Double pi=3.14;
        //pi+=34.9;
    }
}
class Abc{
    final void hi(){ //legal Contract
        System.out.println("hi");
    }


}
class Bcd extends Abc{
   // @Override
    /*void hi() {

    }*/


}

abstract class X{
    //Illegal combination of modifiers: 'abstract' and 'final'
   //final abstract void hello();
   //final: can't override
    //abstract: must override
}
