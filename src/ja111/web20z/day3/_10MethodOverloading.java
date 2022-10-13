package ja111.web20z.day3;

public class _10MethodOverloading {
    //Polymorphism = > many forms of the same thing.
    //two types
    //compile time aka static polymorphism aka static binding aka method overloading
    public static void hi(){
        System.out.println("hi");
    }
    public static void hi(String name){
        System.out.println("hi " + name);
    }
    public static void hi(String name, String place){
        System.out.println("hi "+name +" how is it going in "+place);
    }

    public static void main(String[] args) {
        hi();
        hi("Chirag");
        hi("Dipali", "Delhi");

    }
}
