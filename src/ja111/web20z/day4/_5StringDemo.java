package ja111.web20z.day4;

public class _5StringDemo {
    public static void main(String[] args) {
        System.out.println("hi");
        Integer i; //declaration
        i=10; //intialization;
          String name; //create a variable on stack
        name="Putin"; //assign a vaule to the variable "name"
        String plant1="snakeplant";//string literal, stored in perm gen are in (string pool)
        String plant2= new String("rose"); //string using new operator, stored on heap memory
        String plant3="snakeplant";
        String plant4= new String("rose");
        //copare the address of objects?
        // ==
        System.out.println(plant1==plant2); //false
        System.out.println(plant1==plant3); //true

        String x="hello"; //pool
        String y=new String("hello"); //heap
        System.out.println(x==y); //false
        // == compares object memory addresses.
        // equals method in string it compares the content and not the address
        System.out.println(x.equals(y)); //true










    }
}
