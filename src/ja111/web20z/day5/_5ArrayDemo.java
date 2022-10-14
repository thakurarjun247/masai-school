package ja111.web20z.day5;

public class _5ArrayDemo {



    public static void main(String[] args) {
        //declare
        //<datatype>[]
        int[] arrayName;

        //initialization
            //1st way
            int[] a = {1,2,3};
            //2nd way
            //<datatype>[] <arrayName> = new <datatype>[size];
            boolean[] b = new boolean[5];

            //arrays will have init with defaulut values;
        System.out.println(b);

        System.out.println(a[0]);
        //iterating over an array
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        //another way, foreach loop aka enhanced for loop
        for(Integer item: a){
            System.out.println(item);
        }

    }
}
