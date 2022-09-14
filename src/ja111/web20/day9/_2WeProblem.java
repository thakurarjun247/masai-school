package ja111.web20.day9;

public class _2WeProblem {
    /*
    * class RBIBank
    * getRoI() : Int   0
    *
    * class HDFC child of RBIBank
    * override  getRoI() : 8
    *
    * class SBI child of RBIBank
    * override  getRoI() : 7.5
     *
     *
     *
     * create a class Bank, with a method getRateOfInterest and create
     * multiple child classes of This Bank class as SBI,
     * HDFC and override the getRateOfInterest method in all the child classes.
    * */
    public static void main(String[] args) {
        HDFC hdfc= new HDFC();
        SBI sbi= new SBI();
        System.out.println(hdfc.getRoI());
        System.out.println(sbi.getRoI());
    }
}
class RBIBank{
    int  getRoI(){
        return 0;
    }
}

class SBI extends RBIBank{
    @Override
    int getRoI(){
        return (int) 7.5;
    }
}

class HDFC extends RBIBank{
    @Override
    int getRoI(){
        return 8;
    }
}


