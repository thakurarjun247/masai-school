package ja111.web20.day12.accessspecifierandmarker;

import java.io.Serializable;

public class _1MarkerInterface {
    public static void main(String[] args) {
        MyClass obj= new MyClass();
    }
}
interface MyMarkerInterface{}
class MyClass implements Serializable, Cloneable { //tag: Serialized, cloneable

    int i;
}
