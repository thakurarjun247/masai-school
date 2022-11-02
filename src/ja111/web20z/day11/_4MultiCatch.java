package ja111.web20z.day11;

public class _4MultiCatch {
    public static void main(String[] args) {
        try{
            int a[]=new int[5];
            a[6]=30/0;
            System.out.println("End of try");
        }
        catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("Array Index OOB Exception ");
        }
        catch (ArithmeticException arithmeticException){
            //....
        }
        catch (Exception exception){

        }

        System.out.println("rest of the code");
    }
}
