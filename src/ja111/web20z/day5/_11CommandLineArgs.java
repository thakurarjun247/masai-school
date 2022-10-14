package ja111.web20z.day5;

public class _11CommandLineArgs {
    public static void main(String[] stringArray) {

        System.out.println(stringArray.length);
        //AIOBE
        // System.out.println(stringArray[0]);
        System.out.println(stringArray[0]);
        for (String item: stringArray)
            System.out.println(item);

        String x=stringArray[0];
        //how to convert a string to an integer.
        Integer xInIntegerForm=Integer.parseInt(x);
        System.out.println(xInIntegerForm+5);
        Integer.parseInt("123");
        Double.parseDouble("12.3");
        Integer n=10;
        //convert the int to a string
        String str= String.valueOf(n); // 10 => "10"

        System.out.println(str);
    }
}
