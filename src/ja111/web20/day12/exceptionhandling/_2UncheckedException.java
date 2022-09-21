package ja111.web20.day12.exceptionhandling;

import ja111.web20.day7.Student;

public class _2UncheckedException {
    NullPointerException e;

    public static void main(String[] args) {
        String number="12asdfa";
        //NumberFormatException
       // Integer.parseInt(number);

        Student s=null;
        //NPE
       // System.out.println(s.getName());



        //ArrayIndexOutOfBoundsException //a[-1]




    }
}
