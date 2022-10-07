package ja111.web20z.day2;
//by importing you bring the code in your program.
import java.util.Scanner;

public class _6Scanner {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter your age");
        int age=scanner.nextInt();
        System.out.println("enter your name");
        String name=scanner.next();
        System.out.println("Are you 18+?");
        boolean eighteenPlus=scanner.nextBoolean();
        System.out.println(age+" "+name+" "+eighteenPlus);
    }
}
