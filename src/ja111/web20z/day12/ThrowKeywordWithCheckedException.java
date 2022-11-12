package ja111.web20z.day12;

import java.io.IOException;
import java.util.Scanner;

public class ThrowKeywordWithCheckedException {
    //throw vs throws

    //throw

    public static void main(String[] args) {
        System.out.println("User goes to vote");
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter your age");
        int age= scanner.nextInt();
        //validate the age
        try {
            validateAge(age);////2. handle it
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void validateAge(int age) throws IOException{  //1. declare it using throws
        if(age<18){
            //throw a checked exception
            //there are two choices
            //1. declare it ()
            //2. handle it
            throw new IOException("You are not eligible to vote");
            //checked or unchecked?
        }
        System.out.println("you can vote");
    }
}
