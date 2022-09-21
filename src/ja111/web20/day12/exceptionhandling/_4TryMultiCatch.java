package ja111.web20.day12.exceptionhandling;

import ja111.web20.day7.Student;

public class _4TryMultiCatch {
    public static void main(String[] args) {
        int i=-1;
        int d=0;
        int[] a= new int[1];
        Student student= null ; //new Student("aga");

        try
        {
           //System.out.println(i/d);
           // System.out.println(a[i]);
            System.out.println(student.getName());
        }
        catch (ArithmeticException e){
            System.out.println("Arithmatic ");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("AIOBE");
        }
        catch (Exception exception){
            System.out.println("generic exc.");
        }
    }
}
