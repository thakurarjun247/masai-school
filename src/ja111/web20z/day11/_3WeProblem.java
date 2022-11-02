package ja111.web20z.day11;

public class _3WeProblem {
    //create an array;
    //print the item at the index -1  a[-1];
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
       try{
           System.out.println(arr[5]);
       }
       catch (ArithmeticException exception){
           System.out.println("something went wrong Exception"+exception.getMessage());
       }

        //try catch finally
        //If exception is not handled, JVM provides a default exception handler that performs the following tasks:
        //
        //- Prints out exception description.
        //- Prints the stack trace (Hierarchy of methods where the exception occurred).
        //- Causes the program to terminate.
    }
}
