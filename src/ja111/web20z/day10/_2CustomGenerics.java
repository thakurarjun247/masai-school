package ja111.web20z.day10;
import ja111.web20.day14.Plant;
import ja111.web20z.day9.Student;

import java.util.*;
public class _2CustomGenerics {
    //create a class
    //setter
    //getter
    //Symbols T (type), K = datatype to represent key of a map
    //V = value of a map


    //without generics
    List listIntegerWithoutGenerics=new ArrayList();


    public static void main(String[] args) {
        //with generics
        List<Plant> listInteger=new ArrayList<>();

        OurOwnGenericClass<String> ourOwnGenericClass=new OurOwnGenericClass<>();
        ourOwnGenericClass.add("string");
        System.out.println(ourOwnGenericClass.get());
        //ourOwnGenericClass.add(1234);


        OurOwnGenericClass<Student> object1=new OurOwnGenericClass<>();
        object1.add(null);

        OurOwnGenericClass nonGenericObject= new OurOwnGenericClass();
        nonGenericObject.add("asdf");
        nonGenericObject.add(1234);
        Object object=nonGenericObject.get();
        Integer i=(Integer) object;
    }
}

class OurOwnGenericClass<T>{
    T object;
    void add(T tObject){
        object=tObject;
    }

   T get(){
        return object;
    }

}
//**Type Parameters:**
//
//The type parameters naming conventions are important
// to learn generics thoroughly. The common type parameters are as follows:
//
//1. T - Type
//2. E - Element
//3. K - Key
//4. N - Number
//5. V - Value
