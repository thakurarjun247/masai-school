package ja111.web17.day5;

public class _3Immuatability {
    public static void main(String[] args) {
     String message="Welcome";
     message.concat(" Back");
     System.out.println(message);
        System.out.println(message+"back");

        String newString= message.concat(" Back, once again.");
     System.out.println(newString);
        System.out.println(message);
        //Reason for immutability:
        //1. Save some space
        String s6=message.concat("1"); //Welcome1
        String s7=s6.concat("2"); //Welcome12



    }
}
