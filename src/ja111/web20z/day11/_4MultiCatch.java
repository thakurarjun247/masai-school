package ja111.web20z.day11;

import ja111.web20.day14.Plant;

public class _4MultiCatch {
    public static void main(String[] args) {
        try{
            Plant o=null;
            System.out.println(o.toString());
            int a[]=new int[5];
            a[6]= 56;
            a[2]=  30/0;
            System.out.println("End of try");
        }
        catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("Array Index OOB Exception ");
        }
        catch (ArithmeticException arithmeticException){
            System.out.println("ArithmeticException Exception ");
        }
        catch (Exception exception){
            System.out.println("generic Exception");
        }

        System.out.println("rest of the code");
    }

    //resume recording...
}
