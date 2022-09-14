package ja111.web20.day9;

public class _5Bindings {
    //Two types of polymorphism
    //method overlaoding..aka compile time poly. aka static binding
    //overriding aka runtime poly aka dynamic binding
    void one(String s){}
    void one(Integer i){}

    public static void main(String[] args) {
        _5Bindings ob=new _5Bindings();
        ob.one("asdfs");
    }
}
