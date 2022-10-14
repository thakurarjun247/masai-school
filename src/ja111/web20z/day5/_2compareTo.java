package ja111.web20z.day5;

public class _2compareTo {
    public static void main(String[] args) {
        String x="abc";
        String y= "yz";
        System.out.println(x.compareTo(y));
        //x - y

        //lexicographically => changes the char to UNICODE =>performs subtraction
        //"abc" => 1
        //"yz" => 25

        System.out.println("abc".compareTo("abc")); //0
        System.out.println("z".compareTo("y")); // z-y
        //equals() and ==


    }
}
