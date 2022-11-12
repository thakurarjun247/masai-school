package ja111.web20z.day11;

public class _1ExceptionHandling {
    //  an exception is an unwanted or unexpected event, which occurs during the execution of a program i.e. at run time,
    //  that disrupts the normal flow of the program’s instructions.
    public static void main(String[] args) {
        System.out.println("line 1");
        int i=1;
        i--;
        i++;
        try {
            System.out.println(4/i);
        }
        catch (ArithmeticException arithmeticException){
            System.out.println("inside the catch block"); //exc. hanlding
        }
        System.out.println("line 2");
        //java.lang.Throwable
        //Exception , Error
        //**Error vs Exception:**
        //
        //- E**rror:** An Error indicates a serious problem that a reasonable application should not try to catch. Error is irrecoverable.

        //- **Exception:Exception indicates conditions that a reasonable application might try to catch.
        //Types Of Exceptions:
        //1. Checked (aka compile time exc., ): which inherit from Exception class: FileNotFoundException
        //2. Unchecked(aka runtime exception) (which inherit from the RuntimeException class): e.g.ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException,

    }

}
//unchecked(aka runtime exception)
class MyOwnUncheckedException extends RuntimeException{
    MyOwnUncheckedException(String message) {


    }
}
