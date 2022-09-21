package ja111.web17.day5;

public class _2StringOperations {
    public static void main(String[] args) {
        String s1="one";
        String s2="two";
        String s3="three";
        String s4="0123456789";
        String s5="0123456789";
        String s6=new String("0123456789");
        System.out.println(s1+s2);
        s1.length();
        System.out.println(s4.charAt(3));;
        System.out.println(s4.substring(4));; //456789
        System.out.println(s4.substring(4, 6));; //45
        s3.indexOf('r');
        s3.lastIndexOf('e');
        System.out.println(s4.equals(s5));; //compares the content, memory address doesn't matter
        System.out.println(s4.equals(s6));;
        System.out.println();
        System.out.println( "abc".equalsIgnoreCase("ABC"));;
        System.out.println("abC".toLowerCase());
        System.out.println(" abc def ".trim());
        System.out.println("ab4g".replace('4','y'));
        //convert a string to an array:
        char[] array=s5.toCharArray();
        System.out.println("char array");
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
        //split
        String s7="one,two,three";
        String[] allStrings=s7.split(","); //one two three



    }
}
