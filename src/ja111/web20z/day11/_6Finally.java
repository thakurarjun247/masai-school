package ja111.web20z.day11;

public class _6Finally {
    public static void main(String args[]) {
        try {
            //below code do not throw any exception
            int data = 25 / 0;
            System.out.println(data);
        }
        //catch won't be executed
        catch (NullPointerException e) {
            System.out.println(e);
        }

        //executed regardless of exception occurred or not
        finally {
            System.out.println("finally block is always executed");
        }

        System.out.println("rest of the code...");
    }
}
