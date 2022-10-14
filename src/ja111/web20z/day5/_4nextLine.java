package ja111.web20z.day5;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class _4nextLine {


    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        //don't use other inputs before nextLine.
   /*     System.out.println("enter your country name");
        String country=scanner.next();
        System.out.println(country);*/
        System.out.println("enter your full name");
        //.next(); //will read only the first word, stops at a whitespace
        String fullName=scanner.nextLine(); //reads the entire line, it stops at a new line \n
        System.out.println(fullName);

        System.out.println("enter your country name");
        String country=scanner.next();
        System.out.println(country);
        scanner.close();


    }
}
