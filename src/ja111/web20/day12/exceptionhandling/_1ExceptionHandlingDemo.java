package ja111.web20.day12.exceptionhandling;

public class _1ExceptionHandlingDemo {
    //subclasses of RunTimeException are unchecked Exceptions
    //all the other are checked or compile time exceptions
    public static void main(String[] args) {
        System.out.println("one");
        try {
            System.out.println(1/0);
        }
        catch (Exception exception){ //ArithmeticException
            System.out.println("devide by zero error");
        }
        System.out.println("two");

    }
    //**Error vs Exception:**
    //
    //- E**rror:** An Error indicates a serious problem that a reasonable application
    // should not try to catch. Error is irrecoverable.
    //- **Exception:** Exception indicates conditions that a
    // reasonable application might try to catch.
}
