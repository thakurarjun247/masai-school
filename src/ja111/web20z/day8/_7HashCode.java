package ja111.web20z.day8;

public class _7HashCode {
    //- A**hashcode**is an integer value associated with every object in Java, facilitating the hashing in hash tables (k, v pair)
    //- To get this hashcode value for an object, we can use the hashcode() method in Java. It is the means***hashcode()
    // method that returns the integer hashcode value of the given object***.
    //- Since this method is defined in the Object class, hence it is inherited by user-defined classes also.
    //collision:
    //

    public static void main(String[] args) {
        System.out.println("abc".hashCode());
        System.out.println("azc".hashCode());
        System.out.println("avc".hashCode());
        //collision:
        // "abc" 96354, "xyz" 96354

        //HashSet set.
        //abc,xyz           96354("xyz")


    }
}
