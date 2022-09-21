package ja111.web17.day5;

public class _1StringDemo {
    public static void main(String[] args) {
        //Strings can be declared in two ways
        //1. String Literal - Stored in String pool (PermGen Area)
       String s="mystring";
       String s1="anotherString";
       String s2="anotherString";
       // == compares the memory addresses of two objects, returns true if they are the same address
        System.out.println(s1==s2);
        System.out.println(s1==s);

        //2. String using new Operator
        String s3= new String("three");
        String s4= new String("three");
        System.out.println(s3==s4);

    }
}
