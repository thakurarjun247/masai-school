package ja111.web20.day12.accessspecifierandmarker.pack2;

import ja111.web20.day12.accessspecifierandmarker.pack1.One;

public class Two extends One {
    public static void main(String[] args) {
        One one = new One();
       // one.hi(); default not available outside the package
        Two two= new Two();
        two.hello();//protected is available outside the package using inheritence.
    }
}
