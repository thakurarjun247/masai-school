package ja111.web20.day6;

public class _4String {
    public static void main(String[] args) {
        String s1= "value"; // string literal
        String s2= new String("value"); //string with new operator
        //Be back by 03:05 pm

        //System.out.println(s1 == s2);
        //create two literal compare their addresses, Sunny
        //string literal are created on string pool ( PERMGEN)
        //string pool [content,  ] no dups
        String s3="content";
        String s4= "content";
        System.out.println(s3==s4);

        //in the heap area a new object is created.
        String s5=new String("P");
        String s6= new String("P");
        System.out.println(s5==s6);


    }
}
