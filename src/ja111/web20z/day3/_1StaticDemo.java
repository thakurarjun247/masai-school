package ja111.web20z.day3;

public class _1StaticDemo {
    //Inside a class, there will be two types of elements are there :
    //
    //1. static elements : loaded into RAM first
    //2. non-static elements(instance variables and methods): loaded into memory only after
    // you create an object using new operator


    //Computer =>
    // 1. HD (secondary) big capacity, 64 GB, slower
    // 2.  RAM (MM) smaller in size 8GB, faster


    // How many copies of them are created.
    //static is related to a class. Only one copy
    //non-static is related to an object. Many copies
}
class Simple{
    static int s; //RAM
     int n; //
    //as soon as a class is loaded (having .class file in the memory) static varibale
    //are given default value.
    //non static aren't assigned any value.

    public static void main(String[] args) { //RAM
        System.out.println(s);
        //System.out.println(n);
        Simple simple= new Simple();
        //new allocates memory
        System.out.println(simple.n);


    }

    //rule : You can't reference nonstatic items from static methods
}
