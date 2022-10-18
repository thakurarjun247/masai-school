package ja111.web20z.day7.object;

public class _3instanceOf {
    public static void main(String[] args) {
        KTM ktm= new KTM();
        System.out.println("string" instanceof String);
        System.out.println(ktm instanceof KTM);
        System.out.println(ktm instanceof Bike);
        Everything everything= new Everything();
        System.out.println(everything instanceof Object);
    }
    static class Everything{}
}
