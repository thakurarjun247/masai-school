package ja111.web20z.day5;

public class _1StringBuilder {
    public static void main(String[] args) {
        String lastStation= "RC";
        lastStation="SOS";//string pool

        //Alternatives to Strings when the data isn't immutable.
        StringBuilder stringBuilder;
        StringBuffer stringBuffer; //save it for later.


        //how to create a SB
        //1st way
        StringBuilder builder= new StringBuilder("this is string builder");

        //2nd way
        StringBuilder builder1= new StringBuilder();
        builder.append(" added to the end");
        System.out.println(builder.toString());;

        //reassign
        builder1=builder;

        builder1.compareTo(builder);
//String vs StringBuilder
        //1. immutable and mutable
        //2. Nature of it: read-only vs read/write (dynamic)
        //3. Speed of Concatenation: slow vs fast
        "asdf".concat("asdfasdf");
    }
}
