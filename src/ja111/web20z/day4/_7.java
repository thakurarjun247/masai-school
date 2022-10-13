package ja111.web20z.day4;

public class _7 {
    public static void main(String[] args) {
        String x="Hi"; //pool
        String y="Hi"; //pool, at the same location
        x.concat(" there"); // x= hi there
        System.out.println(x);
        System.out.println();
        x="hello"; //
        System.out.println(x); //hi, hello
        System.out.println(y);
        y=x;
        System.out.println(y);
        String editMe="abcd....xyz";
        //a 1
        //b 2
        //z 26
       String newString= editMe.replace('a', '1');
        //"1bcd...xyz"
    }
}
