package ja111.web20z.day11;

import ja111.web20.day14.Plant;

public class _2Keywords {
    //keywords
    //try
    //catch (always after the try block) There shouldn't be any other statement bn try catch
    public static void main(String[] args) {
        Plant plant = null;
        System.out.println(plant.hashCode());;
        try
        {


            System.out.println(3/0);
            System.out.println("one more line");

        }
        //System.out.println(4);
        catch (ArithmeticException e){
            System.out.println("catch block");
        }


        finally {
            //always executed.
            System.out.println("resource clean up");
        }
    }
    //throw => used to create and throw an exception object
    //throws => declare an exception
}

