package ja111.web20.day6;

public class _6Immutability {
    // //Strings are immutable (constant/unchanged)
    public static void main(String[] args) {
        String s="hi"; //["hi"] s->"hi"
        String temp=s;  //["hi"] s->"hi" temp->s->"hi"   temp->"hi"
        //reassignment
        s=s+s; //["hi", "hihi"] s->"hihi"  temp->"hi"

      /*  int x=10;
        x=5;*/
        System.out.println(s);// s->"hihi"
        System.out.println(temp);// temp->"hi"

        /*String password="xyz";
        password="newPassword";*/
        String s1=s+"there";
        //drawbacks of immut.
        //
        String longitude="34.42343";
        String latitude="56.234";
        String longitude1="34.42343";
        String latitude1="56.234";
      //abcd
        //d bc a
        //d cb  a
        StringBuilder stringBuilder=new StringBuilder("mutable");
        stringBuilder.append("appended");
        System.out.println(stringBuilder);

        String string="immutable";
        string.concat("appended");
        System.out.println(string);
        //conversion from StringBuilder to String
        stringBuilder.toString();
        //conversion from String to StringBUilder
        StringBuilder builder= new StringBuilder(string);

        //StringBuffer-not much in use.

        //compareTo
        System.out.println("abc".compareTo("xyz"));
        System.out.println("a".compareTo("a"));
        System.out.println("b".compareTo("a"));




    }
}
