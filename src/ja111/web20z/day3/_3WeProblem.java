package ja111.web20z.day3;

public class _3WeProblem {
    int x=10;
    static int s;

    public static void main(String[] args) {
        _3WeProblem obj1= new _3WeProblem();
            obj1.x=10;

        _3WeProblem obj2= new _3WeProblem();
        obj2.x=20;
        System.out.println(obj1.x); //10
        System.out.println(obj2.x); //20
        System.out.println(s);
        System.out.println(_3WeProblem.s);

    }
}
