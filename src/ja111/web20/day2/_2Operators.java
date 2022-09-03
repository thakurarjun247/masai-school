package ja111.web20.day2;

public class _2Operators {
    public static void main(String[] args) {
        int a=10;
        System.out.println(a); //10
        System.out.println(a++);//10  //post-increment => (print, increase)
        System.out.println(++a);//12
        System.out.println(a--);//12
        System.out.println(--a);//10
        System.out.println(a);//10

        int b=5;
        //(6 - 7)
        System.out.println(++b - ++b);
        a=4;
        System.out.println((--a + --a)*(++a - a--)+(--a +a--)*(++a + a++));
        //(3 + 2 )*(3 - 3)+(1 + 1)*(1 + 1);=4

        System.out.println(true^true);
        System.out.println(false^false);


        System.out.println(true^false);


    }
}
