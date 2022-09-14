package ja111.web20.day7.problemsolving;

public class _4StringBuilder {
    public static void main(String[] args) {

        StringBuilder builder= new StringBuilder("value");
        //2 ways to convert a string builder to a string
        //1
        String s=builder.toString();
        //2
        String ss= new String(builder);


        String x="asdfasdf";
        //converts string to stringbuilder
        StringBuilder b=new StringBuilder(x);

    }
}
