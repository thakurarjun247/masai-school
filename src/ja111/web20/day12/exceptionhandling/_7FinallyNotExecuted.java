package ja111.web20.day12.exceptionhandling;

public class _7FinallyNotExecuted {
    public static void main(String[] args) {
        try{
            System.out.println("try");
            System.exit(1);
        }
        finally {
            System.out.println("finally");
        }
        /*
        * In the above example, the finally block will not execute due to the System.exit(1)
        *  condition in the try block.

 A finally block will not execute due to other conditions like when JVM runs out of
 * memory when our java process is killed forcefully from task manager or console when our
 *  machine shuts down due to power failure and deadlock condition in our try block*/
    }
}
