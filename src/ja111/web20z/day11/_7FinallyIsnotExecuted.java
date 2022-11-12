package ja111.web20z.day11;

public class _7FinallyIsnotExecuted {

    //1. power cut, hardware failure;
    //2. System.exit(1);
    public static void main(String[] args) {
        try {
            System.out.println("TRY");
            System.exit(1);
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
        finally {
            System.out.println("finally");
        }
    }
}
