package ja111.web20.day7.problemsolving;

public class _3Immutability {
    public static void main(String[] args) {
        int x=10;//mutable
        x++;
        System.out.println(x);
        String s = "string"; //[string, stringmuted ]
        String temp=s;
        String s1=s.concat("muted");
        System.out.println(s);
        System.out.println(s1);
        s="hi";
        System.out.println(s);
        System.out.println(temp);
        String same="string";
        System.out.println(temp==same);

        int i=10;
    }
}
