package ja111.web20.day12.exceptionhandling;

import java.util.Scanner;

public class _6Finally {
//The finally block is always executed whether
// an exception is handled or not. Therefore, it contains
// all the necessary statements that need to
// be executed regardless of the exception occurs or no
public static void main(String[] args) {
    Scanner scanner= new Scanner(System.in);
    System.out.println("enter boolean");
    scanner.nextBoolean();
    int index=0;
    int[] a= new int[1];
    try{
        int x=a[index];
    }
    catch (Exception e){
        System.out.println("catch");
    }
    finally { //last wish.
        System.out.println("closing the scanner");
        scanner.close();
        System.out.println("finally  will always be executed.");
    }

    //try - catch
    //try - multicatch
    // nested try catch
    //try - catch -finally
    //try -finally
}


}
