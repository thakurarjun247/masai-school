package ja111.web17.day5;

public class _4StringBuilder {
    public static void main(String[] args) {

        StringBuilder builder=new StringBuilder("Welcome");
        builder=builder.append("1");
        System.out.println(builder);
        System.out.println(builder.append("2"));
        String s="1234"; //4231 => 4321
        System.out.println(builder.toString());

    }
}
