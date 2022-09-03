package ja111.web20.day2;

public class _11ReturnAndContinue {
    public static void main(String[] args) {
        //return
        System.out.println(retrunDemo());
    }
    static String retrunDemo(){
        //return is always the last statement

        return "string";

        //anything after return is unreachable
        //System.out.println("not reachable");
    }
    //what is static?
    //next lecture, no questions asked.


}
