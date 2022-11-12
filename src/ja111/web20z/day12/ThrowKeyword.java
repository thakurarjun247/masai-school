package ja111.web20z.day12;

import java.util.Scanner;

public class ThrowKeyword {
    //throw vs throws

    //throw
    //999999999 - oiuqwer@!#$#IUIU
    public static void main(String[] args) {
        System.out.println("User goes to vote");
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter your age");
        int age= scanner.nextInt();
        //validate the age
        validateAge(age);

    }

    private static void validateAge(int age) {
        if(age<18){
            //throw an exception
            throw new ArithmeticException("You are not eligible to vote");
            //checked or unchecked?
        }
        System.out.println("you can vote");
    }
}
