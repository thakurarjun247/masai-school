package ja111.web17.day5;

import java.util.Scanner;

public class _7Scanner {
    public static void main(String[] args) {
        //one timer
      Scanner scanner =new Scanner(System.in);

      System.out.println("Y are above 18?");
      boolean areYou18Plus=scanner.nextBoolean();
      System.out.println(areYou18Plus);

      System.out.println("enter temprature");
      Double temp=scanner.nextDouble();
      System.out.println(temp);

      scanner.nextLine();
      System.out.println("enter a full line");

      String line=scanner.nextLine();

      System.out.println(line);
      scanner.close();



    }
}
