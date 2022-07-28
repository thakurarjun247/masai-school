package sb101.web18.day2.generics;

public class _2YourOwnGenerics {
    public static void main(String[] args) {
        MyGenerics<String> stringMyGenerics=new MyGenerics<>();
        stringMyGenerics.add("1234.1234");
        System.out.println(stringMyGenerics.get());

        MyGenerics<Number> myGenericsNumbers=new MyGenerics<>();
        myGenericsNumbers.add(100);
        System.out.println(myGenericsNumbers.get());
    }
}
//Type Parameters
// K,V,T,E,N
class MyGenerics<T>{
    T obj;
    void add(T obj){
        this.obj=obj;
    }
    T get(){
        return obj;
    }
}
