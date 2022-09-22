package ja111.web20.day13;

import java.io.IOException;

public class _1ThrowPart2 {
    public static void main(String[] args) {
        //validate(20);
        //FE
        try {
            validate(17);
        } catch (IOException e) {
            System.out.println("To cast your vote your age should be at least 18");
        }
    }
    static void validate(int age)  throws IOException{
        if(age<18){
            //ArithmeticException Runtime-unchecked
                    //IOException - Compile Time-checked
            throw new IOException("age < 18");
            //options:
            //1 declare: declare the exception i.e. throw from here so that
            // someone else can handle it
            //2 handle: try-catch
        }
        else
            System.out.println("you can cast your vote");
    }
}
// main -> validate -> other
//Rose=>
//1. declare : flower + thorn : throw/throws
//2. handle: flower : try-catch