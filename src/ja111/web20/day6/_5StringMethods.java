package ja111.web20.day6;

public class _5StringMethods {
    public static void main(String[] args) {
        String s1="hi";
        String s2="hello";
        System.out.println(s1+s2);
        System.out.println(s1.concat(s2));
        "string".length();
        String s="string";
        //        01234
        s.charAt(3);
        s.substring(1);
        //tr
        System.out.println(s.substring(1,3 ));//print from index 1 to 3, 3 is excluded

        String s5= "HelloThereHowAreYou";
        s5.indexOf('T');
        s5.indexOf("Are");
        s5.lastIndexOf('e');
        //   == double equals operator compares the m/m addresses of two strings/objects
        // equals() method: compares the content and not the address.
        String x="xyz";
        String y="xyz";
        String z="diff";
        String a="XYZ";
        System.out.println(x.equals(y)); //
        System.out.println(x==y);
        System.out.println(x.equals(z));

        System.out.println(a.equalsIgnoreCase(x));
        System.out.println("      asdf asdf     ".trim());

        System.out.println("      asdf asdf     ".replace('f','F'));

    }
}
