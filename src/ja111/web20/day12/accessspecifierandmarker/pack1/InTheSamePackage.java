package ja111.web20.day12.accessspecifierandmarker.pack1;

public class InTheSamePackage {
    public static void main(String[] args) {
        One one= new One();
        one.hi(); // default are available only in the same package.
        one.hello(); //protected are available  in the same package.

    }
}
