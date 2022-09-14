package ja111.web20.day8.Inheritence;

public class _2Overriding {
    public static void main(String[] args) {
        Father father= new Father();
        //father.earn();
        You you= new You();
        you.earn();
    }
}

class Father{
    void earn(){
        //1.
        System.out.println("earn by running a business");
    }
}

class You extends Father{
    //rules of overriding
    //1. there shold be is-a relation
    //2. method names should be the same across the parent and child class
    //3. arg list of both the methods should be the same;
    @Override
    void earn(){
        //1.
        System.out.println("earn by running a business");
        System.out.println("earn from sw engg day job");
    }
}
