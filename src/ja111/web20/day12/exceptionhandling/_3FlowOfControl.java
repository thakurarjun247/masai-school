package ja111.web20.day12.exceptionhandling;

public class _3FlowOfControl {
    public static void main(String[] args) {
        /*if exc. is not handled:
        - Prints out exception description.
          - Prints the stack trace (Hierarchy of methods where the exception occurred).
          - Causes the program to terminate.
        */
        int i=1;

        int[] a = new int[10];
       try {
           System.out.println(a[i]);
       }
       catch (ArrayIndexOutOfBoundsException e){
           System.out.println("something");
       }
        System.out.println("some more statements");
    }
}
