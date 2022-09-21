package ja111.web20.day12.exceptionhandling;

public class _8Throw {
    public static void main(String[] args) {
        int age=2;
        if(age<18)
            throw new ArithmeticException("Below 18 not allowed in Masai.");
        else
            System.out.println("eligible for Masai");

    }
}
